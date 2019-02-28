function hidePicUpload() {
    //隐藏假上传文件并且触发真上传文件
    var picUpload = document.getElementById("picUpload");
    picUpload.style.display="none";
    var picUpload2 = document.getElementById("realPicUpload");
    picUpload2.click();
    var submit = document.getElementById("submit1");
    submit.style.display="block";
}

function hideDraftUpload() {
    var picUpload = document.getElementById("draftUpload");
    picUpload.style.display="none";
    var picUpload2 = document.getElementById("realDraftUpload");
    picUpload2.click();
    var submit = document.getElementById("submit2");
    submit.style.display="block";
}