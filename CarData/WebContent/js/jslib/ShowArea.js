//功能描述:    1.获取地域销售数据
//			   2.通过左侧地图展示地域销售数据，以颜色深度区分
//			   3.将地图作为选择器，选中区域数据加入右侧饼图，进行地域销售对比
function showArea(obj) {
	$.ajax({
		type : "POST",
		async : false, // 同步执行
		url : "AreaServlet",
		dataType : "JSON",
		success : function(data) {
			//获取地域销售数据
			var dataMap = data;
			showAreaInit(dataMap);
		}
	});
}

//echarts部分展示数据
function showAreaInit(dataMap) {
	var myChart = echarts.init(document.getElementById('areaMap'));
	var option = {
		title : {
			text : '地域销售',
		},
		tooltip : {
			trigger : 'item'
		},
		legend : {
			x : 'right',
			selectedMode : false,
			data : [ '北京', '上海', '广东' ]
		},
		toolbox : {
			show : true,
			orient : 'vertical',
			x : 'right',
			y : 'center',
			feature : {
				mark : {
					show : true
				},
				dataView : {
					show : true,
					readOnly : false
				}
			}
		},
		visualMap : {
			orient : 'horizontal',
			min : 0,
			max : 20000,
			seriesIndex : [ 0 ],
			inRange : {
				color : [ '#edfbfb', '#b7d6f3', '#40a9ed', '#3598c1',
						'#215096', ]
			},
			text : [ '高', '低' ], // 文本，默认为数值文本
			splitNumber : 0
		},
		series : [
				{
					name : '地域销售',
					type : 'map',
					mapType : 'china',
					left : '10px',
					selectedMode : 'multiple',
					itemStyle : {
						normal : {
							label : {
								show : true
							}
						},
						emphasis : {
							label : {
								show : true
							}
						}
					},
					data : dataMap
				},
				{
					name : '地域销售对比',
					type : 'pie',
					roseType : 'area',
					tooltip : {
						trigger : 'item',
						formatter : "{a} <br/>{b} : {c} ({d}%)"
					},
					center : [
							document.getElementById('areaMap').offsetWidth - 250,
							225 ],
					radius : [ 30, 120 ],
					data : [ {
						name : '北京',
						value : 7046
					}, {
						name : '上海',
						value : 7392
					}, {
						name : '广东',
						value : 12636
					} ]
				} ],
		animation : false
	};
	myChart.setOption(option);
	
	//点击区域加入饼图
	myChart.on('click', function(params) {
		var selected = params.name;
		var mapSeries = option.series[0].data;
		var data = [];
		var legendData = [];
		var name;

		for (var p = 0, len = mapSeries.length; p < len; p++) {
			name = mapSeries[p].name;
			if (name === selected)
				mapSeries[p].selected = !mapSeries[p].selected;
			if (mapSeries[p].selected) {
				data.push({
					name : name,
					value : mapSeries[p].value
				});
				legendData.push(name);
			}
		}
		option.legend.data = legendData;
		option.series[1].data = data;
		myChart.setOption(option, true);
	});
}