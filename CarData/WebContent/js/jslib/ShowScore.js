//功能描述:		 1.发送查询车型名称
//				 2.接收车辆用户评分信息
//				 3.使用echarts柱状图展示该车型top5的车款评论数
function ShowScore(obj) {
	var pname = $("#sort");
	myChartThree.showLoading();
	$.ajax({
		type : "POST",
		async : true, //同步执行
		url : "ScoreServlet",
		data : {
			//发送数据
			name : pname.val()
		},
		dataType : "JSON",
		success : function(data) {
			//接收数据
			document.getElementById("scores").value = data;
			optTop(data);
		}
	});
}

//echarts展示
function optTop(data) {
	// 基于准备好的dom，初始化echarts图表
	var option = mationrank(data);
	myChartThree.hideLoading();
	myChartThree.setOption(option);
}

function mationrank(data) {
	option = {
		title : {
			text : '车型销售量',
		},
		tooltip : {
			trigger : 'axis'
		},
		legend : {
			data : [ '车型销量' ]
		},

		calculable : false,
		xAxis : [ {
			type : 'category',
			data : data.x
		} ],
		yAxis : [ {
			type : 'value'
		} ],
		series : [ {
			name : '车型销量',
			type : 'bar',
			color: '#36648B',
			data : data.y,
			markPoint : {
				data : [ {
					type : 'max',
					name : '最大值'
				}, {
					type : 'min',
					name : '最小值'
				} ]
			},
			markLine : {
				data : [ {
					type : 'average',
					name : '平均值'
				} ]
			},
		    barWidth:40
		} ]
	};
	return option;
}