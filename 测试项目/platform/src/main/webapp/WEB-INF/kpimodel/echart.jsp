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
	<div id="content"></div>

</body>
<script type="text/javascript">

var option = {
		title : {
			text : 'ECharts 入门示例'
		},
		tooltip : {},
		legend : {
			data : [ '销量' ]
		},
		xAxis : {
			data : [ "衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子" ]
		},
		yAxis : {},
		series : [ {
			name : '销量',
			type : 'bar',
			data : [ 5, 20, 36, 10, 10, 20 ]
		} ]
	};
	
	$(document).ready(function() {
		var content = $("#content");
		$.ajax({
			url : '/platform/kpimodel/find',
			type : 'post',
			dataType : "json",
			success : function(result) {
				console.log(result);
				if (result.status == 0) {
					var data = result.data.list;
					console.log(data);
					console.log(data.length);
					for(var i=0;i<data.length;i++){
						var html = data[i].kpiModelHtml;
						console.log(html);
						content.append(html);
					}
					for(var i=0;i<data.length;i++){
						var kpiModelCode = data[i].kpiModelCode;
						var option = data[i].kpiModelData;
						console.log(document.getElementById('main_'+kpiModelCode));
						echarts.init(document.getElementById('main_'+kpiModelCode)).setOption(option);						
					}
				} else {
					console.log("获取错误")
				}
			}
		});

	});
</script>
</html>