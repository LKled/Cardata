//功能描述:		 1.发送查询车型名称
//				 2.接收车辆指标信息
//				 3.使用echarts雷达图展示
function ShowCharacter(obj) {
	myChartTwo.showLoading();
	var cpname = document.getElementById('carname');
	$.ajax({
		type : "POST",
		async : true, //异步执行
		url : "CharacterServlet",
		data : {
			cname : cpname.value		//发送车型名称
		},
		dataType : "JSON",
		success : function(data) {
			//接收数据
			document.getElementById("cartarget").value = data;
			ShowCarCharacter(data);
		}
	});
}

//echarts雷达图展示
function ShowCarCharacter(data) {
	// 基于准备好的dom，初始化echarts图表
	myChartTwo.hideLoading();
	myChartTwo.setOption(ShowCharacterInit(data));
}
					
function ShowCharacterInit(data) {		
	option = {
		tooltip: {},
		legend: {
			data: data.name
		},
		radar: {
			name: {
				textStyle: {
					color: '#fff',
					backgroundColor: '#000',
					borderRadius: 3,
					padding: [3, 5]
				}
			},
			indicator: [
				{ name: '空间', max: 5},
				{ name: '舒适度', max: 5},
				{ name: '外观', max: 5},
				{ name: '内饰', max: 5},
				{ name: '动力', max: 5},
				{ name: '操控', max: 5},
				{ name: '油耗', max: 5}
			]},
			series: [{
				name: data.name,
				type: 'radar',
				itemStyle:{
					normal:{
						color:'#36648B',
						lineStyle:{color:'#36648B'},
						areaStyle: {color:'#72ACD1'}
					}
			},
			data : [{
				value : [data.space, data.comfort, data.surface, data.interior, data.power, data.control,data.consumption]
			}]
		}]
	};
	return option;                    
}