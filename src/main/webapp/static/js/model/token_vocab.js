export const pix2codeVoc = {
    "<START>": 0,
    "<END>": 1,
    " ": 2,
    "header": 3,
    "{": 4,
    "\n": 5,
    "btn-inactive": 6,
    ",": 7,
    "btn-active": 8,
    "}": 9,
    "row": 10,
    "single": 11,
    "small-title": 12,
    "text": 13,
    "btn-green": 14,
    "double": 15,
    "btn-orange": 16,
    "btn-red": 17,
    "quadruple": 18
};

export const idForPix2Code = ["<START>", "<END>", " ", "header", "{", "\n", "btn-inactive", ",",
    "btn-active", "}", "row", "single", "small-title", "text", "btn-green", "double", "btn-orange", "btn-red", "quadruple"];

export const sketch2code = {
    "<START>": 0,
    "<END>": 1,
    " ": 2,
    "header": 3,
    "{": 4,
    "\n": 5,
    "btn-inactive": 6,
    ",": 7,
    "btn-<HEADER>": 8,
    "}": 9,
    "row": 10,
    "single": 11,
    "small-title": 12,
    "text": 13,
    "btn-<HOLDER>": 14,
    "double": 15,
    "quadruple": 16
};

export const idForSketch2Code = ["<START>", "<END>", " ", "header", "{", "\n", "btn-<HEADER>", ",", "}",
    "row", "single", "small-title", "text", "btn-<HOLDER>", "double", "quadruple"];