import * as tv from './token_vocab';
import * as tf from '@tensorflow/tfjs';

const PIX2CODE_URL = 'model/pix2code/model.json';
const SKETCH2CODE_URL = 'model/sketch2code/model.json';

const IMAGE_SIZE = 256;
const START_TOKEN = "<START>";
const END_TOKEN = "<END>";
const PLACEHOLDER = " ";
const CONTENT_LENGTH = 48;
const SEQUENCE_LENGTH = 150;


async function pix2code(image) {

    const model = await tf.loadModel(PIX2CODE_URL);

    tf.tidy(() => {
        const x_img = tf.resize_images(image, [256, 256, 3], 0);
        let current_context = initType(CONTENT_LENGTH - 1, PLACEHOLDER);
        current_context.append(tv.pix2codeVoc[START_TOKEN]);
        current_context = sparsify(current_context, CONTENT_LENGTH);
        let predictions = START_TOKEN;
        for (let i = 0; i < SEQUENCE_LENGTH; i++) {
            const X = getX(x_img, current_context);
            const prob = model.predict(X);
            const axis = 1;
            const prediction = Array.from(prob.argMax(axis).dataSync());

            let new_context = [];
            for(let j=0; j<CONTENT_LENGTH; j++) {
                new_context.append(current_context[j]);
            }
            let sparseLabel = initType(CONTENT_LENGTH, 0);
            sparseLabel[prediction] = 1;
            new_context.append(sparseLabel);
            current_context = new_context;
            predictions += tv.idForPix2Code[prediction];
            if(tv.idForPix2Code[prediction] == END_TOKEN) {
                break;
            }
        }
        return predictions;
    });
}

async function seketch2code(image) {

    const model = await tf.loadModel(SKETCH2CODE_URL);

    tf.tidy(() => {
        const x_img = tf.resize_images(image, [256, 256, 1], 0);
        let current_context = initType(CONTENT_LENGTH - 1, PLACEHOLDER);
        current_context.append(tv.sketch2code[START_TOKEN]);
        current_context = sparsify(current_context, CONTENT_LENGTH);
        let predictions = START_TOKEN;
        for (let i = 0; i < SEQUENCE_LENGTH; i++) {
            const X = getX(x_img, current_context);
            const prob = model.predict(X);
            const axis = 1;
            const prediction = Array.from(prob.argMax(axis).dataSync());

            let new_context = [];
            for (let j = 0; j < CONTENT_LENGTH; j++) {
                new_context.append(current_context[j]);
            }
            let sparseLabel = initType(CONTENT_LENGTH, 0);
            sparseLabel[prediction] = 1;
            new_context.append(sparseLabel);
            current_context = new_context;
            predictions += tv.idForSketch2Code[prediction];
            if (tv.idForSketch2Code[prediction] == END_TOKEN) {
                break;
            }
        }
        return predictions;
    });
}

function getX(image, context) {
    const img_array = image.eval();
    return tf.tensor4d(image_array, context);
}

function sparsify(labelVector, outputSize) {
    let sparseVector = [];

    for (let label in labelVector) {
        let sparseLabel = initType(outputSize, 0);
        sparseLabel[label] = 1;

        sparseVector.append(sparseLabel);
    }
    return sparseVector;
}

function initType(size, type) {
    let array = [];
    for (let i = 0; i < size; i++) {
        array.append(type)
    }
    return array;
}

