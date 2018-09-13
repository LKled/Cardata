//	功能描述:  1.获取用户选择的筛选条件
//			   2.将筛选条件信息发送到后端
//			   3.接收后端发送的车辆信息
//			   4.将车辆信息展示到web页面
function AdviseCars(obj) {
	//获取筛选条件
	var sort = document.getElementById("car_name").innerHTML;
	var price = document.getElementById("price").innerHTML;
	var point = document.getElementById("point").innerHTML;
	
	$.ajax({
		type : "POST",
		async : true, //同步执行
		url : "AdviseServlet",
		//发送条件数据
		data : {
			sort : sort,
			price : price,
			point : point
		},
		dataType : "JSON",
		//接收车辆信息
		success : function(data) {
			showAdvise(data);
		}
	});
}

//展示车辆信息
function showAdvise(data){
	var name = data.name;
	var comfort = data.comfort;
	var space = data.space;
	var configuration = data.configuration;
	var quality = data.quality;
	var power = data.power;
	var control = data.control;
	var pic = data.picture;

	if (name == null){
		//无推荐车辆显示nocar页面
		$("#advisecar").hide();
		$("#nocar").show();
	}
	else {
		//有推荐车辆展示advisecar页面，展示车辆信息
		$("#nocar").hide();
		document.getElementById("type").innerHTML = name;
		document.getElementById("comfort").innerHTML = comfort;
		document.getElementById("space").innerHTML = space;
		document.getElementById("config").innerHTML = configuration;
		document.getElementById("quality").innerHTML = quality;
		document.getElementById("power").innerHTML = power;
		document.getElementById("control").innerHTML = control;
		document.getElementById("img").src = pic;

		$("#advisecar").show();
	}
}