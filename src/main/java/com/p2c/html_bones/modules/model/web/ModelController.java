package com.p2c.html_bones.modules.model.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/model")
public class ModelController {

    /***
     * 进行图片备份
     * 同时记录用户
     * 生成一个uid进行保存与之后的序列、编译结果相对应
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "uploadImg")
    public String uploadImg(HttpServletRequest request, HttpServletResponse response) {
        return "";
    }

    /***
     * 获取Token序列调用Python进行编译
     * 返回index.html
     * 将tokens与html进行备份 uid与图片一致
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "uploadTokens")
    public String uploadTokens(HttpServletRequest request, HttpServletResponse response) {
        return "";
    }

}
