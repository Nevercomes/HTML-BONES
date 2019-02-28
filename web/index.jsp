<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>HTMLBONES-首页</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <link rel="stylesheet" href="HTML-BONES.css">
  </head>

  <body>
  <div id="page1">
      <header>
        <h1>HTML-BONES</h1>
        <a href="register.html" class="btn btn-primary">注册</a>
        <a href="login.html" class="btn btn-primary">登录</a>
      </header>
    <div id="content">
        <div class="border">
      <div id="indexTitle">
        <h1 class="page_text_title">HTML-BONES</h1>
        <h3 class="page_text_title_small">打造你自己的网站</h3>
        <a href="uploadDraft.html" class="btn btn-primary page_btn1">上传草图</a>
        <a href="uploadDesign.html" class="btn btn-primary page_btn1">上传设计图</a>
      </div></div>
        <div id="introduction">
                <h2 class="introduction_title">使用人工智能，将你的设计转变为代码</h2>
                <p class="introduction_p">HTML-BONES帮助人们使用网页设计获得网页代码。在这里你可以选择两种类型的图片上传：网页设计图或草图。无论你是专业人士还是业余爱好者，都能在本站得到满意的网页代码。</p>
        </div>
		<div class="intro">
            <img class="draft" src="caotu.jpg"/>
		<h2 class="intro_title">使用草图</h2>
            <h3 class="intro_stiltle">快速预览框架</h3>
		<p class="intro_p1">在HTML-BONES,你可以使用手绘草图得到期望的网页代码，也可以上传尚未定稿的网页设计草图获得详细代码供进一步使用。得到网页框架后，你还可以更改方案的配色以达到满意的效果。</p>
			<a href="uploadDraft.html" class="btn btn-primary page_btn2">上传草图</a>

		</div>
		<div class="intro">
            <img class="design" src="sheji.png"/>
            <div class="intro2">
		<h2 class="intro_title">使用设计图</h2>
            <h3 class="intro_stiltle">一键获得代码</h3>
		<p class="intro_p2">如果已经确定网页设计稿，HTML-BONES能帮助你获得基于流行框架、符合行业标准的实现代码。在页面上传图片即可获得包括HTML和CSS在内的详细代码,可方便地进一步使用。</p>
			<a href="uploadDesign.html" class="btn btn-primary page_btn3">上传设计图</a>
            </div>

		</div>
    </div>
  </div>
  </body>
</html>
