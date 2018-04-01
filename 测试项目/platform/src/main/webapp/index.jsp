<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/common/head.jsp"%>
</head>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
	<form>
		<input type="text" id="kpiModelCode" name="kpiModelCode"> 
		<input
			type="text" id="kpiModelName" name="kpiModelName"> 
		<select
			id="kpiModelType" name="kpiModelType">
			<option value="1">柱状图</option>
			<option value="2">折线图</option>
			<option value="3">饼壮图</option>
		</select> 
		<input type="text" id="kpiModelHtml" name="kpiModelHtml" rows="10"
			cols="30"> 
		<input type="text" id="kpiModelJs"
				name="kpiModelJs" rows="10" cols="30"> 
		<input type="textarea"
			id="kpiModelData" name="kpiModelData" rows="10" cols="30" />
			
		<button type="button"  onclick="save();">取消</button>
			
	</form>
	<%@ include file="/WEB-INF/common/script.jsp"%>
	<script>
	function save(){
		$.bootstrapLoading.start({ loadingTips: "正在处理数据，请稍候..." });
		$("#adsForm").ajaxSubmit({
			url: "platform/kpimodel/save",
			type:'post',
			data:{
				"kpiModelCode":$("#kpiModelCode").val(),
				"kpiModelName":$("#kpiModelName").val(),
				"kpiModelType":$("#kpiModelType").find("option:selected").val(),
				"kpiModelHtml":$("#kpiModelHtml").val(),
				"kpiModelJs":$("#kpiModelJs").val(),
				"kpiModelData":$("#kpiModelData").val()
			},
			dataType: "json",
			success: function(result){
				$.bootstrapLoading.end();
				if(result.status == 0){
					swal({title:'',text:"保存成功",type:"success"});
					search();
				}else{
					swal({title:'',text:result.msg,type:"error"});
				}
			}
		});
	}
	
	</script>
</body>

	

</html>
