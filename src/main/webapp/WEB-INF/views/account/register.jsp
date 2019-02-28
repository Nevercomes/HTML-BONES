<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/include/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>HTMLBONES-注册</title>
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
        function isPasswordEquel() {
            var password = $('[name="password"]').val();
            var passwordAgain = $('[name="passwordAgain"]').val();
            if (password != passwordAgain) {
                console.log("donnot equal");
                $('#password_again').addClass('has-error');
                $('.warning').text("两次密码不相同");
                $('[name="passwordAgain"]').focus();
                $('[name="passwordAgain"]').val("");
                return false;
            }
            else
                return true;
        }
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
        function isPasswordAgainEmpty(){
            var passwordAgain = $('[name="passwordAgain"]').val();
            if (passwordAgain=="") {
                console.log("passwordAgain is empty");
                $('#password_again').addClass('has-error');
                $('.warning').text("请再次输入密码");
                $('[name="passwordAgain"]').focus();
                return true;
            }
            else {
                $('#password_again').removeClass('has-error');
                return false;
            }
        }

        $(document).ready(function () {
            console.log("ready");
            $('[name="username"]').on('change',function () {
                 console.log("you input" + this.value);
                 if(!isUsernameEmpty() && !isPasswordEmpty() && !isPasswordAgainEmpty() && isPasswordEquel()){
                     $('.warning').text("");
                 }
            });
            $('[name="password"]').on('change',function () {
                console.log("you input "+ $('[name="password"]').val());
                if(!isUsernameEmpty() && !isPasswordEmpty() && !isPasswordAgainEmpty() && isPasswordEquel()){
                    $('.warning').text("");
                }
            });
            $('[name="passwordAgain"]').on('change',function () {
                console.log("you input "+ $('[name="passwordAgain"]').val());
                if(!isUsernameEmpty() && !isPasswordEmpty() && !isPasswordAgainEmpty() && isPasswordEquel()){
                    $('.warning').text("");
                }
            });

            //提交后交由后端判断，不合法返回字符串
            /*$("#registerForm").on("submit",function (e) {
                e.preventDefault();
                var details = $("#registerForm").serialize();
                if(!isUsernameEmpty() && !isPasswordEmpty() && !isPasswordAgainEmpty() && isPasswordEquel()){
                    $.post('#', details, function(data){
                        $('.warning').text("data");//提示的方法还需要改
                   });
                }
            });*/
        });
    </script>
</head>
<body>
    <h2 id="register_title">加入 HTML-BONES</h2>
    <div id="register_page" class="container">
		<div class="row">
        <a class="home" href="${pageContext.request.contextPath}"> <h1 id="register_page_title" class="col-lg-6 col-xs-6">HTML-BONES</h1></a>
        <div class="register_form col-lg-6 col-xs-6">
            <p class="warning"></p>
            <form role="form" id="registerForm" action="${pageContext.request.contextPath}/account/registerController" method="post">
                <div class="form-group">
	                <div class="form-group" id="username">
                         <input name="username" class="form-control register_input_text" type="text" placeholder="输入用户名">
                    </div>
                    <div class="form-group" id="password">
                        <input name="password" class="form-control register_input_text" type="password" placeholder="输入密码">
                    </div>
	                <div class="form-group " id="password_again">
	                    <input name="passwordAgain" class="form-control register_input_text" type="password" placeholder="再次输入密码">
                    </div>
                    <button type="submit" class="btn btn-primary btn_register">注册</button>
                </div>
            </form>
        </div>
			</div>
    </div>
	<div id="foot">
    <span>已有账号？</span>
    <a href="${pageContext.request.contextPath}/account/viewLoginForm" class="href">点击登录</a>
	</div>
</body>
</html>

