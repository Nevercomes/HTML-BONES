package com.p2c.html_bones.modules.model.utils;

import com.p2c.html_bones.common.utils.DateUtils;
import com.p2c.html_bones.common.utils.PathUtils;
import com.p2c.html_bones.modules.python.PythonUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class ModelUtils {

    /***
     * 根据token序列获取html代码
     * @param date
     * @param imgId
     * @param type
     * @param color
     * @return html文件路径
     */
    public static String tokens2HTML(Date date, String imgId, String type, String color) {
        String tokenSavePath = PathUtils.getTokenSavePath();
        String dateFile = DateUtils.formatDate(date, "yyyy-MM-dd");
        tokenSavePath += dateFile + "/" + imgId + ".gui";

        String compilePath;
        List<String> args1 = new ArrayList<>();
        if (type.equals("1")) {
            compilePath = PathUtils.getCompilerPath();
            args1.add(tokenSavePath);
        } else {
            compilePath = PathUtils.getDrawnCompilerPath();
            args1.add(tokenSavePath);
            args1.add(color);
        }
        return PythonUtils.callArgs(compilePath, args1);

    }

    /***
     * 默认参数的函数重载
     * @param date
     * @param imgId
     * @return
     */
    public static String tokens2HTML(Date date, String imgId) {
        return tokens2HTML(date, imgId, "1", "0");
    }

    /***
     * 根据图片获取html代码
     * @param date
     * @param imgId
     * @param type
     * @param color
     * @return
     */
    public static String img2HTML(Date date, String imgId, String type, String color) {
        String imgSavePath = PathUtils.getImgSavePath();
        String dateFile = DateUtils.formatDate(date, "yyyy-MM-dd");
        imgSavePath += dateFile + "/" + imgId + ".png";

        String samplePath = PathUtils.getSamplerPath();
        List<String> args = new ArrayList<>();
        args.add(imgSavePath);
        String tokensPath =  PythonUtils.callArgs(samplePath, args);

        String compilePath;
        List<String> args1 = new ArrayList<>();
        if (type.equals("1")) {
            compilePath = PathUtils.getCompilerPath();
            args1.add(tokensPath);
        } else {
            compilePath = PathUtils.getDrawnCompilerPath();
            args1.add(tokensPath);
            args1.add(color);
        }
        return PythonUtils.callArgs(compilePath, args1);
    }

    /***
     * 默认参数的函数重载
     * @param date
     * @param imgId
     * @return
     */
    public static String img2HTML(Date date, String imgId) {
        return img2HTML(date, imgId, "1", "0");
    }
}
