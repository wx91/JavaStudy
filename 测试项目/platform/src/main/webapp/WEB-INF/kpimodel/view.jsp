<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ECharts</title>
<script src="/platform/resources/echarts.js"></script>
<script src="/platform/resources/vendors/jquery/dist/jquery.min.js"></script>


</head>
<body>
	<div id="content">
		
	</div>
	<script type="text/javascript">
	$(document).ready(function(){
		var content = $("#content");
		$.ajax({
			url:'platform/kpimodel/find',
			type:'post',
			dataType: "json",
			success: function(result){
				console.log(result);
				if(result.status == 0){
					
					
				}else{
					console.log("获取错误")
				}
			}
		});
		
	});
	
	</script>
</body>
</html>