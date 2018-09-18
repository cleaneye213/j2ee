<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>修改角色</title>
    <link href="hplus/css/bootstrap.min.css" rel="stylesheet">
    <!-- Toastr style -->
    <link href="hplus/css/plugins/toastr/toastr.min.css" rel="stylesheet">

    <link href="hplus/css/animate.css" rel="stylesheet">
    <link href="hplus/css/style.css" rel="stylesheet">

    <link href="hplus/css/plugins/iCheck/custom.css" rel="stylesheet">
    <link href="hplus/css/plugins/cropper/cropper.min.css" rel="stylesheet">

    <link href="hplus/css/plugins/awesome-bootstrap-checkbox/awesome-bootstrap-checkbox.css" rel="stylesheet">

    <link href="hplus/css/plugins/summernote/summernote.css" rel="stylesheet">
    <link href="hplus/css/plugins/summernote/summernote-bs3.css" rel="stylesheet">
</head>

<body>

<div id="wrapper">
    <div class="gray-bg">
        <div class="row wrapper border-bottom white-bg page-heading">
            <div class="col-lg-10" style="margin-top: 20px;">
                <ol class="breadcrumb">
                    <li>
                        <a href="user/toUserMain">角色管理</a>
                    </li>
                    <li class="active"><strong>修改角色</strong>
                    </li>
                </ol>
            </div>
            <div class="col-lg-2"></div>
        </div>

        <div id="content1" class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
                <div class="col-lg-12">
                    <div class="ibox float-e-margins">
                        <div class="ibox-content">
                            <form method="post" class="form-horizontal" id="form1">
                            <!--新增的时候，我传一个A进来，代表add，说明是新增  -->
                            <!--修改的时候，我传一个U进来，代表update，说明是修改  -->
                            <!--查看的时候，我传一个V进来，代表view，说明是查看  -->
                            <input type="hidden" name="cmd" value="${param.cmd}">
                            <input type="hidden" name="id" value="${param.id}"/>
                        
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">角色名称：</label>
                                    <div class="col-sm-8">
                                        <input id="roleName" name="roleName" class="form-control" type="text">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">备注：</label>
                                    <div class="col-sm-8">
                                    	<textarea id="remark" name="remark"  class="form-control"  rows="5" ></textarea>
                                    </div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                <div class="form-group">
                                    <div class="col-sm-4 col-sm-offset-2">
                                        <button id="cancelBtn" type="button" class="btn btn-w-m btn-default" >取消</button>
                                        <button id="saveBtn" type="button" class="btn btn-w-m btn-primary">保存</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Mainly scripts -->
<script src="hplus/js/jquery.min.js"></script>
<script src="hplus/js/bootstrap.min.js"></script>
<!-- 自定义js -->
<script src="hplus/js/content.js?v=1.0.0"></script>
<script src="hplus/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="hplus/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="hplus/js/plugins/pace/pace.min.js"></script>

<!-- Custom and plugin javascript -->
<!-- 表单验证 -->
<script src="hplus/js/plugins/validate/jquery.validate.min.js"></script>
<script src="hplus/js/plugins/validate/messages_zh.min.js"></script>
<!-- Toastr 通知提示插件-->
<script src="hplus/js/plugins/toastr/toastr.min.js"></script>

<!-- toastr设置js -->
<script src="js/toastrSetting.js"></script>

<!-- Input Mask-->
<script src="hplus/js/plugins/jasny/jasny-bootstrap.min.js"></script>

<!-- SUMMERNOTE -->
<script src="hplus/js/plugins/summernote/summernote.min.js"></script>
<script src="hplus/js/plugins/summernote/summernote-zh-CN.js"></script>
<script src="js/summernoteUtil.js"></script>

<script src="hplus/js/plugins/layer/laydate/laydate.js"></script>

<!--表单回填-->
<script src="js/formUtil.js"></script>
<script>
    $(document).ready(function () {
    	
    	var cmd="${param.cmd}";
    	init();
    	if("A"==cmd){
    		
    	}else if("U"==cmd){
    		getRoleInfo();
    	}else if("V"==cmd){
    		getRoleInfo();
    		//关闭所有能编辑的输入框
    	}

    });

    $.validator.setDefaults({
        submitHandler: function () {
            var formData = $("#form1").serialize();
            $.ajax({
                url: "roleServlet?action=saveRoleInfo",
                method: "post",
                dataType: "json",
                data: formData,
                success: function (data) {
                    if (data != null && !data.success) {
                        toastr.error(data.message);
                        $("#saveBtn").attr("disabled", false);
                    } else {
                        toastr.success(data.message);
                        window.history.go(-1);
                        //window.location.href = "system/role/roleMain.jsp";
                    }
                },
                error: function () {
                    toastr.error("执行出错了！");
                    $("#saveBtn").attr("disabled", false);
                }
            });
        }
    });
    
    
    function getRoleInfo(){
    	var id="${param.id}";
    	$.ajax({
    		url:"roleServlet?action=getRoleInfo",
    		data:{id:id},
    		dataType:"json",
    		type:"post",
    		success:function(data){
    			//回填表单
    			reSetFormVal("form1",data);
    		}
    	});
    }
    
    function init(){

        //表单验证信息
        $("#form1").validate({
            rules: {
                roleName: {required: true, maxlength: 64},
                remark: {required: true, maxlength: 120},
            },
            messages: {
                loginName: {required: "请输入角色名称", maxlength: "角色名称长度不能超过64位"},
                remark: {required: "请输入备注", maxlength: "备注长度不能超过120位"},
            },
            errorPlacement: function (error, element) {
                $("#saveBtn").attr("disabled", false);
                error.appendTo(element.parent());
            }
        });

        $("#saveBtn").click(function () {
            $("#saveBtn").attr("disabled", true);
            $("#form1").submit();
        });
        
        $("#cancelBtn").click(function () {
        	window.history.go(-1);
            //location.href="system/role/roleMain.jsp";
        });
    }
    
    
</script>

</body>
</html>
