
//功能说明：购车推荐功能筛选条件点击事件实现，用户点击条件高亮，并列入已选条件
$(document).ready(function(){
    $("#select1 dd").click(function () {
    	$(".select-no").hide();
        $(this).addClass("selected").siblings().removeClass("selected");
        document.getElementById("car_name").innerHTML = $(this).text();		//获取级别条件
        //console.log($(this).text());
        if ($(this).hasClass("select-all")) {
            $("#selectA").remove();
        } else {
            var copyThisA = $(this).clone();
            if ($("#selectA").length > 0) {
                $("#selectA a").html($(this).text());
            } else {
                $(".select-result dl").append(copyThisA.attr("id", "selectA"));
            }
        }
    });

    $("#select2 dd").click(function () {
    	$(".select-no").hide();
        $(this).addClass("selected").siblings().removeClass("selected");
        document.getElementById("price").innerHTML = $(this).text();		//获取价格条件
        //console.log($(this).text());
        if ($(this).hasClass("select-all")) {
            $("#selectB").remove();
        } else {
            var copyThisB = $(this).clone();
            if ($("#selectB").length > 0) {
                $("#selectB a").html($(this).text());
            } else {
                $(".select-result dl").append(copyThisB.attr("id", "selectB"));
            }
        }
    });

    $("#select3 dd").click(function () {
    	$(".select-no").hide();
        $(this).addClass("selected").siblings().removeClass("selected");
        document.getElementById("point").innerHTML = $(this).text();			//获取侧重点条件
        //console.log($(this).text());
        if ($(this).hasClass("select-all")) {
            $("#selectC").remove();
        } else {
            var copyThisC = $(this).clone();
            if ($("#selectC").length > 0) {
                $("#selectC a").html($(this).text());
            } else {
                $(".select-result dl").append(copyThisC.attr("id", "selectC"));
            }
        }
    });

});