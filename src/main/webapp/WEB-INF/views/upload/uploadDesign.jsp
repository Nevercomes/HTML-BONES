<%@include file="/WEB-INF/views/include/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>HTMLBONES</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="${ctxStatic}css/HTML-BONES.css">
	<script>
		$(document).ready(function(){

            var screenwidth, screenheight, mytop, getPosLeft, getPosTop;
            screenwidth = $(window).width();
            screenheight = $(window).height();
            //获取滚动条距顶部的偏移
            mytop = $(document).scrollTop();
            //计算弹出层的left
            getPosLeft = screenwidth / 2 - 200;
            //计算弹出层的top
            getPosTop = screenheight / 2 - 150;
            //css定位弹出层
            $("#commentBox").css({ "left": getPosLeft, "top": getPosTop });
            //当浏览器窗口大小改变时
            $(window).resize(function () {
                screenwidth = $(window).width();
                screenheight = $(window).height();
                mytop = $(document).scrollTop();
                getPosLeft = screenwidth / 2 - 200;
                getPosTop = screenheight / 2 - 150;
                $("#commentBox").css({ "left": getPosLeft, "top": getPosTop + mytop });
            });
            //当拉动滚动条时，弹出层跟着移动
            $(window).scroll(function () {
                screenwidth = $(window).width();
                screenheight = $(window).height();
                mytop = $(document).scrollTop();
                getPosLeft = screenwidth / 2 - 200;
                getPosTop = screenheight / 2 - 150;
                $("#commentBox").css({ "left": getPosLeft, "top": getPosTop + mytop });
            });

			$("#commentBox").hide();

			$("#code").hide();
			$(".bar").hide();
			$("#btn_submit").on("click",function(){

			});
			$("#picture_in").on("change",function(){
			    var filePath = this.value;
			    if(filePath) {
                        //获取文件
                        var file = $("#imgForm").find("input")[0].files[0];

                        //创建读取文件的对象
                        var reader = new FileReader();

                        //创建文件读取相关的变量
                        var imgFile;

                        //为文件读取成功设置事件
                        reader.onload = function (e) {
                            imgFile = e.target.result;
                            console.log(imgFile);
                            $("#imgContent").attr('src', imgFile);
                        };

                        //正式读取文件
                        reader.readAsDataURL(file);
                    }
                else{
                    this.value = '';
                    $("#imgContent").removeAttr('src');
                }
			});

			/*$("#imgForm").on("submit",function (e) {
			    e.preventDefault();
                var fileTypes = ["jpg","png"];
                var filePath = $("#picture_in").val();
                if(filePath) {
                    var isNext = false;
                    var arr=filePath.split('\\');
                    var fileName=arr[arr.length-1];
                    var ar = fileName.split('.');
                    var fileEnd = ar[ar.length-1];
                    console.log(ar);
                    console.log(fileName);
                    // console.log(filePath);
                    console.log(fileEnd);
                    for (var i = 0; i < fileTypes.length; i++) {
                        if (fileTypes[i] == fileEnd) {
                            isNext = true;
                            break;
                        }
                    }
                    if (isNext) {
                        //显示动态
                        console.log("You clicked",this);
                        $("#imgContent").animate({
                            marginLeft:'-=320'
                        },1000);

                        $("#code").show();
                        $("#code").animate({
                            top:'-=130',
                            opacity:1,
                        },2000);

                        $(".bar").show();
                        $(".bar").animate({
                            top:'-=30',
                            opacity:1,
                        },2000);

                        $("#picture_in").hide();
                        $(this).hide();

                        var details = $("#imgForm").serialize();
                        $.post('#',details);
                    }
                    else{
                            alert('请选择图片，类型为jpg或png');
                        $("#picture_in").val("");
                        $("#imgContent").removeAttr('src');
                    }
                }
                else{
                    alert('请选择图片');
                    $("#picture_in").val("");
				}
            });*/

			$('#comment').on('click',function () {

                //点击链接弹出登录窗口
                    $("#commentBox").fadeIn("slow"); //toggle("slow");
                    //获取页面文档的高度
                    var bodyheight = $(window).height();
                    var bodywidth = $(document.body).width();
                    console.log(bodyheight,bodywidth);
                    //追加一个层，使背景变灰
                    $("body").prepend("<div id='greybackground'></div>");
                    $("#greybackground").css({ "opacity": "0.5", "background":"grey", "position": "absolute" ,"z-index":"10", "padding-left": bodywidth,"padding-top":bodyheight, "top":0, "left":0});
                var h =$("#greybackground").height();
                    console.log(h);
			});
            //点击关闭按钮
            $(".close_btn").click(function () {
                $("#commentBox").fadeOut("slow"); ////hide();
                //删除变灰的层
                $("#greybackground").remove();
            });

		});

	</script>
</head>
<body>
	    <header>
        <h1>HTML-BONES</h1>
        <a href="${pageContext.request.contextPath}/account/viewRegisterForm" class="btn btn-primary">注册</a>
        <a href="${pageContext.request.contextPath}/account/viewLoginForm" class="btn btn-primary">登录</a>
      </header>
	<div id="page2">
		<h1 class="page_title">上传设计图</h1>
		<img id="imgContent">
		<div id="code">
			
		</div>
	<form id="imgForm" method="post" action="${pageContext.request.contextPath}/uploadDesign" enctype="multipart/form-data">
		<input type="file" name="pictureFile" id="picture_in">
		<input type="submit" id="btn_submit" class="btn btn-default">
	</form>
		<h4 class="changeUpload">上传草图？<a href="${pageContext.request.contextPath}/viewUploadDesignForm">点击这里</a></h4>
		
		<div class="progress progress-striped active bar">
    			<div class="progress-bar progress-bar-success" role="progressbar"
         				aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
         				style="width: 40%;">
        		<span class="sr-only">40% 完成</span>
    			</div>
			</div>
	</div>
		<button id="comment">评价框</button>
<div id="commentBox">
	<div class="row1">
		评价<a href="javascript:void(0)" title="关闭窗口" class="close_btn" id="closeBtn">×</a>
	</div>
	<form>
	<div class="row2">
		<p>对于本次生成的代码，您：</p>
		<label><input name="satisfaction" type="radio" value="very">非常满意</label>
		<label><input name="satisfaction" type="radio" value="satisfied">满意</label>
		<label><input name="satisfaction" type="radio" value="general">一般</label>
		<label><input name="satisfaction" type="radio" value="dissatisfied">不满意</label>
	</div>
		<div class="row3">
			<textarea name="commentText" placeholder="留下您宝贵的评价与建议" class="commentText" cols="20" rows="4"></textarea>
		</div>
		<div class="row4">
			<button class="btn btn-primary">提交</button>
		</div>
	</form>
</div>
				
</body>
</html>