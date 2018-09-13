//功能描述:		 1.发送查询车型名称
//				 2.接收车辆优缺点信息
//				 3.使用echarts力导图展示
function ShowBuyPurpose(obj) {
	myChartFive.showLoading();
	var pname = document.getElementById('buytype');
	$.ajax({
		type : "POST",
		async : true, //同步执行
		url : "PurposeServlet",
		cache : false,
		data : {
			name : pname.value			//发送车型名称
		},
		dataType : "JSON",
		success : function(data) {
			//接收数据
			document.getElementById("buypurpose").value = data;
			optpurpose(data);
		}
	});

}

//echarts力导图展示
function optpurpose(data) {
	myChartFive.hideLoading();
	myChartFive.setOption(mationpurpose(data));
}

function mationpurpose(data) {

	var option = {
		title : {
			text : '车型优缺点',
			x : 'right',
			y : 'bottom'
		},
		tooltip : {
			trigger : 'item',
			formatter : '{a} : {b}'
		},
		toolbox : {
			show : true,
			feature : {
				restore : {
					show : true
				},
				magicType : {
					show : true,
					type : [ 'force', 'chord' ]
				},
				saveAsImage : {
					show : true
				}
			}
		},
		legend : {
			x : 'left',
			data : [ '优点', '缺点' ]
		},
		series : [ {
			type : 'force',
			name : "车型优缺点",
			ribbonType : false,
			categories : [ {
				name : '车型'
			}, {
				name : '优点'
			}, {
				name : '缺点'
			} ],
			itemStyle : {
				normal : {
					label : {
						show : true,
						textStyle : {
							color : '#333'
						}
					},
					nodeStyle : {
						brushType : 'both',
						borderColor : 'rgba(255,215,0,0.4)',
						borderWidth : 1
					},
					linkStyle : {
						type : 'curve'
					}
				},
				emphasis : {
					label : {
						show : false
					},
					nodeStyle : {
					},
					linkStyle : {}
				}
			},
			useWorker : false,
			minRadius : 15,
			maxRadius : 25,
			gravity : 1.1,
			scaling : 1.1,
			roam : 'move',
			nodes : data.y,
			links : data.x
		} ]
	};

	return option;
}