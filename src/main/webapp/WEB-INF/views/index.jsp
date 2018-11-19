<%@page contentType="text/html;charset=UTF-8" %>
<%@include file="/WEB-INF/views/include/taglib.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <title>HTML-BONES</title>
    <%@include file="/WEB-INF/views/include/head.jsp" %>

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="${ctxStatic}css/customize.css" rel="stylesheet" type="text/css"/>

    <script src="${ctxStatic}js/alert.js" type="text/javascript"></script>

</head>

<body>
<header class="navbar navbar-expand navbar-light bg-light flex-column flex-md-row bd-navbar">
    <a class="navbar-brand" href="#">
        <img src="${ctxStatic}image/logo.png" width="150" height="40">
    </a>
    <ul class="navbar-nav bd-navbar-nav flex-row">
    </ul>
    <ul class="navbar-nav flex-row ml-md-auto d-md-flex">
        <li class="nav-item">
            <a class="btn btn-outline-success" href="#" onclick="alertNotOpenShow()">登录 <span class="sr-only">(current)</span></a>
        </li>
        <li class="nav-item">
            <span>&nbsp&nbsp&nbsp&nbsp</span>
        </li>
        <li class="nav-item">
            <a class="btn btn-outline-secondary" href="#" onclick="alertNotOpenShow()">联系我们 <span class="sr-only">(current)</span></a>
        </li>
    </ul>
</header>
<div class="container text-center">
    <img class="bd-title" src="${ctxStatic}image/title4.jpg">
    <div class="row">
        <div class="col-6">
            <!-- <div class="row text-center"> -->
            <img class="center-block bd-main-box" src="${ctxStatic}image/design.png" width="400" height="400">
            <!-- </div> -->
        </div>
        <div class="col-6">
            <!-- <div class="row text-center"> -->
            <img class="center-block bd-main-box" src="${ctxStatic}image/sketch.png" width="400" height="400">
            <!-- </div> -->
        </div>
    </div>
    <div class="row mt-4">
        <div class="col-6">
            <!-- <div class="row text-center"> -->
            <!-- <img class="center-block bd-main-box" src="static/image/design.png" width="400" height="400"> -->
            <!-- </div> -->
            <button class="btn btn-outline-primary" onclick="alertNotOpenShow()">上传设计图</button>
        </div>
        <div class="col-6">
            <!-- <div class="row text-center"> -->
            <!-- <img class="center-block bd-main-box" src="static/image/sketch.png" width="400" height="400"> -->
            <!-- </div> -->
            <button class="btn btn-outline-primary" onclick="alertNotOpenShow()">上传手绘图</button>
        </div>
    </div>

    <div id="alert-not-open" class="alert alert-warning fade show bd-alert" role="alert">
        <strong>Sorry,website is under development</strong>
    </div>
</div>
</body>
</html>

