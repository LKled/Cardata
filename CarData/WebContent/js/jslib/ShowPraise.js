//功能描述:		 1.接收各车型的口碑发布数量信息
//				 2.echarts展示，柱状图展示不同年份不同车型的口碑发布量，各车型上有折线图展示发布量随年份变化的趋势
function showPraiseNum(obj){
	myChartOne.showLoading();
	$.ajax({
	type : "POST",
	async : true, //同步执行
	url : "PraiseServlet",
	dataType : "JSON",
	success : function(data) {
		//接收数据
		ShowPraise(data);
		}
	});
}

//echarts展示
function ShowPraise(data) {
	// 基于准备好的dom，初始化echarts图表
	var mydata = data;
	myChartOne.hideLoading();
	myChartOne.setOption(ShowPraiseInit(mydata));
}

function ShowPraiseInit(mydata) {
	var yearCount = 4;						//年份计数，2015到2018共4个年份
	var categoryCount = mydata.num;			//车型种类计数

	var xAxisData = [];						//车型种类数据，即横坐标值
	var customData = [];					//折线数据
	var legendData = [];					//图例数据
	var dataList = [];						//各车型分年份口碑发布数量

	var list = [];
	var nameList = mydata.name;

	list.push(mydata.p2015);
	list.push(mydata.p2016);
	list.push(mydata.p2017);
	list.push(mydata.p2018);

	legendData.push('trend');
	var encodeY = [];
	for (var i = 0; i < yearCount; i++) {
		legendData.push((2015 + i) + '');
		dataList.push([]);
		encodeY.push(1 + i);
	}

	for (var i = 0; i < categoryCount; i++) {
		xAxisData.push(nameList[i]);
		var customVal = [i];
		customData.push(customVal);

		var data = dataList[0];
		for (var j = 0; j < dataList.length; j++) {
			var value = list[j][i];
			dataList[j].push(value);
			customVal.push(value);
		}
	}

	function renderItem(params, api) {
		var xValue = api.value(0);
		var currentSeriesIndices = api.currentSeriesIndices();
		var barLayout = api.barLayout({
			barGap: '30%', barCategoryGap: '20%', count: currentSeriesIndices.length - 1
		});

		var points = [];
		for (var i = 0; i < currentSeriesIndices.length; i++) {
			var seriesIndex = currentSeriesIndices[i];
			if (seriesIndex !== params.seriesIndex) {
				var point = api.coord([xValue, api.value(seriesIndex)]);
				point[0] += barLayout[i - 1].offsetCenter;
				point[1] -= 20;
				points.push(point);
			}
		}
		var style = api.style({
			stroke: api.visual('color'),
			fill: null
		});

		return {
			type: 'polyline',
			shape: {
				points: points
			},
			style: style
		};
	}

	option = {
		tooltip: {
			rigger: 'axis'
		},
		legend: {
			data: legendData
		},
		dataZoom: [{
			type: 'slider',
			start: 0,
			end: 100
		}, {
			type: 'inside',
			start: 0,
			end: 100
		}],
		xAxis: {
			data: xAxisData
		},
		yAxis: {},
		series: [{
			type: 'custom',
			name: 'trend',
			renderItem: renderItem,
			itemStyle: {
				normal: {
					borderWidth: 2
				}
			},
			encode: {
				x: 0,
				y: encodeY
			},
			data: customData,
			z: 100
		}].concat(echarts.util.map(dataList, function (data, index) {
			return {
				type: 'bar',
				animation: false,
				name: legendData[index + 1],
				itemStyle: {
					normal: {
					    opacity: 0.9
					}
				},
				data: data
			};
		}))
	};
	return option;
}