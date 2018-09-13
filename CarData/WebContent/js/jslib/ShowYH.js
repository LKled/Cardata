	/* 用户实测油耗统计 */
//功能描述:		 1.接收各车型实测油耗数据
//				 2.echarts折线图展示各车型最高油耗、最低油耗和平均油耗
function showConsumption(obj){
	myChartFour.showLoading();
	$.ajax({
		type : "POST",
		async : true, //同步执行
		url : "ConsumptionServlet",
		dataType : "JSON",
		success : function(data) {
			//接收数据
			ShowYh(data);
		}
	});
}
function ShowYh(data){
	// 基于准备好的dom，初始化echarts图表
	myChartFour.hideLoading();
	myChartFour.setOption(yh(data));
}

function  yh(data){
	option = {
		title: {
			text: '实测油耗'
		},
		tooltip: {
			trigger: 'axis'
		},
		legend: {
			data:[ '最低油耗', '最高油耗', '平均油耗' ]
		},
		toolbox: {
			feature: {
				saveAsImage: {}
			}
		},
		xAxis: {
			type: 'category',
			boundaryGap: false,
			data: data.yhType
		},
		yAxis: {
			type: 'value'
		},
		series: [
			{
				name:'最低油耗',
				type:'line',
				itemStyle:{
					normal:{
						color: '#4F94CD',
						lineStyle:{color:'#4F94CD'},
						areaStyle: {color:'rgba(99,184,255,0.5)'}
					}
				},
				data: data.yhMin,			            
			},
			{
				name:'最高油耗',
				type:'line',
				itemStyle:{
					normal:{
						color: '#36648B',
						lineStyle:{color:'#36648B'},
					}
				},
				data: data.yhMax
			},
			{
				name:'平均油耗',
				type:'line',
				smooth: true,
				itemStyle:{
					normal:{
						color: '#515151',
						lineStyle:{color:'#515151'},
					}
				},
				data: data.yhAvg
			}
			]
	};
	return option;
}