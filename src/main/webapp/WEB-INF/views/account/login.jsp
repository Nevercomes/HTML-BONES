﻿<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/include/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>HTMLBONES-登录</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${ctxStatic}css/HTML-BONES.css">
    <style>
        body{
            background-color: #666666;
            padding: 0;
        }
    </style>
    <script>
        function isUsernameEmpty() {
            var username = $('[name="username"]').val();
            if (username=="") {
                console.log("username is empty");
                $('#username').addClass('has-error');
                $('.warning').text("请输入用户名");
                $('[name="username"]').focus();
                return true;
            }
            else {
                $('#username').removeClass('has-error');
                return false;
            }
        }
        function isPasswordEmpty(){
            var password = $('[name="password"]').val();
            if (password=="") {
                console.log("password is empty");
                $('#password').addClass('has-error');
                $('.warning').text("请输入密码");
                $('[name="password"]').focus();
                return true;
            }
            else {
                $('#password').removeClass('has-error');
                return false;
            }
        }
        $(document).ready(function () {
            console.log("ready");
            $('[name="username"]').on('change',function () {
                console.log("you input" + this.value);
                if(!isUsernameEmpty() && !isPasswordEmpty()){
                    $('.warning').text("");
                }
            });
            $('[name="password"]').on('change',function () {
                console.log("you input "+ $('[name="password"]').val());
                if(!isUsernameEmpty() && !isPasswordEmpty()){
                    $('.warning').text("");
                }
            });
            //提交后由后端判断用户名密码是否正确,后端返回字符串
            /*$("#loginForm").on("submit",function (e) {
                e.preventDefault();
                if(!isUsernameEmpty() && !isPasswordEmpty()){
                    var details = $("#loginForm").serialize();
                    $.post('#', details, function(data){
                        $('.warning').text(data);
                    });
                }
            });*/
        });
    </script>
</head>
<body class="body1">
    <h2 id="login_title">登录 HTML-BONES</h2>
    <div id="login_page" class="container">
		<div class="row">
        <a class="home" href="${pageContext.request.contextPath}"> <h1 id="login_page_title" class="col-lg-6 col-xs-6">HTML-BONES</h1></a>
        <div class="login_form col-lg-6 col-xs-6">
            <div class="warning"></div>
            <form role="form" id="loginForm" action="${pageContext.request.contextPath}/account/loginController" method="post">
                <div class="form-group">
                    <div class="form-group" id="username">
                        <input name="username" class="form-control input_text" type="text" placeholder="输入用户名">
                    </div>
                    <div class="form-group" id="password">
                    <input name="password" class="form-control input_text" type="password" placeholder="输入密码">
                    </div>
                    <button type="submit" class="btn btn-primary btn_login">登录</button>
                </div>
            </form>
        </div>
			</div>
    </div>
	<div id="foot">
    <span >没有账号？</span>
    <a href="${pageContext.request.contextPath}/account/viewRegisterForm" class="href">点击注册</a>
	</div>
</body>
</html>

