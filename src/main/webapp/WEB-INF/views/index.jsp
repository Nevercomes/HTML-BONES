<%@page contentType="text/html;charset=UTF-8" %>
<%@include file="/WEB-INF/views/include/taglib.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>HTML-BONES</title>
    <%@include file="/WEB-INF/views/include/head.jsp"%>
    <script src="${ctxStatic}js/test_js.js" type="text/javascript"></script>
    <link href="${ctxStatic}css/test_css.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<header class="navbar navbar-expand navbar-light bg-light flex-column flex-md-row bd-navbar">
    <a class="navbar-brand mr-0 mr-md-2" href="#">
        <img id="test" src="${ctxStatic}image/logo.png" width="150" height="40">
    </a>
    <div class="navbar-nav-scroll">
        <ul class="navbar-nav bd-navbar-nav flex-row">
        </ul>
    </div>
    <ul class="navbar-nav flex-row ml-md-auto d-none d-md-flex">
        <li class="nav-item active">
            <label type="label"><img src="${ctxStatic}image/3.jpg" style="width:30px; height:30px; margin-bottom:-10px"/></label>
        </li>
        <li class="nav-item">
            <button type="button" class="button_1">登录</button>
        </li>
        <li class="nav-item">
            <button type="button" class="button_1">注册</button>
        </li>
    </ul>
</header>
<table class="tabTitlesContainer" style="padding-top:0%; width:100%; height:80px" rules="none" frame="below" border="1">
    <tr id="tabTitles">
        <td class="tabTitleSelected" onclick="tabPageControl(0)" style="width:50%">设计稿</td>
        <td class="tabTitleUnSelected" onclick="tabPageControl(1)" style="width:50%">草图</td>
    </tr>
</table>
<table id="tabPagesContainer" style="width:100%;" rules="none" frame="below" border="5">
    <tbody class="tabPageSelected">
    <tr class="tabPage">
        <td style="height:450px; weight:100%">
            <div style="width:20%; height:100%; float:left">
                <button type="button" class="button_2" style="margin-left:15px; margin-top:40px">上传设计图</button>
                <button type="button" class="button_2" style="margin-left:15px; margin-top:5px">重新上传</button>
            </div>
            <div style="width:30%; height:100%;float:left">
                <img src="${ctxStatic}image/2.png"
                     style="margin-left:-60px; margin-top:30px; border-color:#03F; width:516px; height:408px"/>
            </div>
            <div style="width:20%; height:100%; float:left">
                <button type="button" class="button_2" style="margin-left:15px; margin-top:40px">开始生成</button>
                <button type="button" class="button_2" style="margin-left:15px; margin-top:5px">自动保存</button>
            </div>
            <div style="width:30%; height:100%;float:left">
                <img src="${ctxStatic}image/1.png"
                     style="margin-left:-60px; margin-top:30px; border-color:#03F; width:516px; height:408px" />
            </div>
        </td>
    </tr>
    </tbody>
    <tbody class="tabPageUnSelected">
    <tr class="tabPage">
        <td style="height:450px; weight:100%">
            <div style="width:20%; height:100%; float:left">
                <button type="button" class="button_2" style="margin-left:15px; margin-top:40px">上传草图</button>
                <button type="button" class="button_2" style="margin-left:15px; margin-top:5px">重新上传</button>
            </div>
            <div style="width:30%; height:100%;float:left">
                <img src="${ctxStatic}image/2.png"
                     style="margin-left:-60px; margin-top:30px; border-color:#03F; width:516px; height:408px"/>
            </div>
            <div style="width:20%; height:100%; float:left">
                <button type="button" class="button_2" style="margin-left:15px; margin-top:40px">开始生成</button>
                <button type="button" class="button_2" style="margin-left:15px; margin-top:5px;">自动保存</button>
            </div>
            <div style="width:30%; height:100%;float:left">
                <img src="${ctxStatic}image/1.png"
                     style="margin-left:-60px; margin-top:30px; border-color:#03F; width:516px; height:408px" />
            </div>
        </td>
    </tr>
    </tbody>
</table>
</body>
</html>
