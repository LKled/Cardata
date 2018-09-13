<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <base href="<%=basePath%>">
        <title>Car Data</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/fontAwesome.css">
        <link rel="stylesheet" href="css/light-box.css">
        <link rel="stylesheet" href="css/owl-carousel.css">
        <link rel="stylesheet" href="css/templatemo-style.css">
        <link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="css/advise.css">

        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">

        <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
        
		<script type="text/javascript" src="js/vendor/jquery.js"></script>
		<script type="text/javascript" src="js/vendor/jquery.min.js"></script>
		<script type="text/javascript" src="js/vendor/jquery.easing.min.js"></script>
		<script type="text/javascript" src="js/vendor/jquery-1.11.2.min.js"></script>
		<script type="text/javascript" src="js/jslib/ShowPraise.js"></script>
		<script type="text/javascript" src="js/jslib/ShowCharacter.js"></script>
		<script type="text/javascript" src="js/jslib/ShowScore.js"></script>
		<script type="text/javascript" src="js/jslib/SocialShare.js"></script>
		<script type="text/javascript" src="js/jslib/ShowYH.js"></script>
		<script type="text/javascript" src="js/jslib/ShowArea.js"></script>
		<script type="text/javascript" src="js/jslib/ShowBuyPurpose.js"></script>
		<script type="text/javascript" src="js/jslib/script.js"></script>
		<script type="text/javascript" src="js/jslib/adviseCars.js"></script>
    </head>

<body background="img/13.png">
        <header class="nav-down responsive-nav hidden-lg hidden-md">
            <button type="button" id="nav-toggle" class="navbar-toggle" data-toggle="collapse" data-target="#main-nav">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <!--/.navbar-header-->
            <div id="main-nav" class="collapse navbar-collapse">
                <nav>
                    <ul class="nav navbar-nav">
                        <li><a href="#top">Home</a></li>
                        <li><a href="#praise">Praise</a></li>
                        <li><a href="#character">Character</a></li>
                        <li><a href="#score">Score</a></li>
                        <li><a href="#consumption">Consumption</a></li>
                        <li><a href="#purpose">Purpose</a></li>
                        <li><a href="#area">Area</a></li>
                        <li><a href="#advise">Advise</a></li>
                    </ul>
                </nav>
            </div>
        </header>

        <div class="sidebar-navigation hidde-sm hidden-xs">
            <div class="logo">
                <a href="#">Car<em>Data</em></a>
            </div>
            <nav>
                <ul>
                    <li>
                        <a href="#top">
                            <span class="rect"></span>
                            <span class="circle"></span>
                           	主页
                        </a>
                    </li>
                    <li>
                        <a href="#praise">
                            <span class="rect"></span>
                            <span class="circle"></span>
                  	              口碑发布数量
                        </a>
                    </li>
                    <li>
                        <a href="#character">
                            <span class="rect"></span>
                            <span class="circle"></span>
                           	车型指标
                        </a>
                    </li>
                    <li>
                        <a href="#score">
                            <span class="rect"></span>
                            <span class="circle"></span>
                    	       用户评分
                        </a>
                    </li>
                    <li>
                        <a href="#consumption">
                            <span class="rect"></span>
                            <span class="circle"></span>
                           	实测油耗
                        </a>
                    </li>
                    <li>
                        <a href="#purpose">
                            <span class="rect"></span>
                            <span class="circle"></span>
                           	车型优缺点
                        </a>
                    </li>
                    <li>
                        <a href="#area">
                            <span class="rect"></span>
                            <span class="circle"></span>
                           	地域销售
                        </a>
                    </li>
                     <li>
                        <a href="#advise">
                            <span class="rect"></span>
                            <span class="circle"></span>
                           	购车推荐
                        </a>
                    </li>
                </ul>
            </nav>
            <ul class="social-icons">
                <li><a href="#"><i class="fa fa-wechat" onclick=shareToWechat()></i></a></li>
				<li><a href="#"><i class="fa fa-weibo" onclick=shareToSina()></i></a></li>
				<li><a href="#"><i class="fa fa-qq" onclick=shareToQQZone()></i></a></li>
            </ul>
        </div>

        <div class="slider">
            <div class="Modern-Slider content-section" id="top">
                <!-- Item -->
                <div class="item item-1">
                    <div class="img-fill">
                    <div class="image"></div>
                    <div class="info">
                        <div>
                          <h1>
								Want to know<em> Car</em> ?
						  </h1>
                          <div class="white-button button">
                              <a href="#praise">Discover More</a>
                          </div>
                        </div>
                        </div>
                    </div>
                </div>
                <!-- // Item -->
                <!-- Item -->
                <div class="item item-2">
                    <div class="img-fill">
                        <div class="image"></div>
                        <div class="info">
                        <div>
                          <h1>
								Want to know<em> Car</em> ?
						  </h1>
                          <div class="white-button button">
                              <a href="#praise">Discover More</a>
                          </div>
                        </div>
                        </div>
                    </div>
                </div>
                <!-- // Item -->
                <!-- Item -->
                <div class="item item-3">
                    <div class="img-fill">
                        <div class="image"></div>
                        <div class="info">
                        <div>
                          <h1>
								Want to know<em> Car</em> ?
						  </h1>
                          <div class="white-button button">
                              <a href="#praise">Discover More</a>
                          </div>
                        </div>
                        </div>
                    </div>
                </div>
                <!-- // Item -->
                <!-- Item -->
                <div class="item item-4">
                    <div class="img-fill">
                        <div class="image"></div>
                        <div class="info">
                        <div>
                          <h1>
								Want to know<em> Car</em> ?
						  </h1>
                          <div class="white-button button">
                              <a href="#praise">Discover More</a>
                          </div>
                        </div>
                        </div>
                    </div>
                </div>
                <!-- // Item -->
                <!-- Item -->
                <div class="item item-5">
                    <div class="img-fill">
                        <div class="image"></div>
                        <div class="info">
                        <div>
                          <h1>
								Want to know<em> Car</em> ?
						  </h1>
                          <div class="white-button button">
                              <a href="#praise">Discover More</a>
                          </div>
                        </div>
                        </div>
                    </div>
                </div>
                <!-- // Item -->
            </div>
        </div>


        <div class="page-content">
        
        	<!-- // Praise -->
            <section id="praise" class="content-section">
                <div class="section-heading">
                     <h2>口碑发布数量</h2>
                    <h4 class="section-subheading text-muted">2015年、2016年、2017年、2018年的车型口碑发布数量对比</h4>
                </div>	
                <div class="section-content">
                    <div class="owl-carousel owl-theme">
                    <div class="col-md-12">
                     <div id="carnum" style="width: 1000px; height: 450px; margin-left: 20%"></div>
                     <script src="js/echarts.js"></script>
						<script type="text/javascript">
							var myChartOne = echarts.init(document.getElementById('carnum'));
							showPraiseNum();
				
						</script>
                    </div>
                    </div>
                </div>
            </section>
            
            <!-- // Character -->
            <section id="character" class="content-section">
                <div class="section-heading">
                    <h2>车型指标</h2>
					<h4 class="section-subheading text-muted">查看每款车型指标的评分</h4>
                </div>
                <div class="section-content">
                    <div class="masonry">
                        <div class="col-md-4">
                          	<select name="selt"
								style="height: 30px; width: 230px; margin-left: 15px"
								id="carname" onchange="ShowCharacter(this);">
						 	</select>
						 	</div>
						 <div class="col-md-12">
							<div id="cartarget" style="width: 1000px; height: 400px;margin-left: 10%"></div>
							 <script src="js/echarts.js"></script>
							<script type="text/javascript">
								var myChartTwo = echarts.init(document.getElementById('cartarget'));
								$.ajax({
									type : "POST",
									async : false, //同步执行   结束请求后再在执行下一个ajax
									url : "CarSelectServlet",
									dataType : "JSON",
									success : function(data) {
										$("#carname").html("");
										for ( var i = 0; i < data.carList.length; i++) {
											$("#carname").append(
												"<option value='"+data.carList[i]+"'>"
													+ data.carList[i] + "</option>");
										}
									}
								});
					
								ShowCharacter();
							</script>
                        </div>
                    </div>
                </div>    
            </section>
            
            <!-- // Score -->
            <section id="score" class="content-section">
                <div class="row">
                    <div class="col-md-12">
                        <div class="section-heading">
                            <h2>用户评分</h2>
							<h4 class="section-subheading text-muted">每款车型的用户评分Top5</h4>
                        </div>
                        <div class="col-md-4" style="float:right;">
                            <select name="selt" 
								style="height:8%;border:0;background:#1b386c;font-size:16px;color:#fefefe;margin-top:4.5%; border-radius:4px;padding:0 5px;width:200px;"
								id="sort" onchange="ShowScore(this);">
								<option value="小型SUV">小型SUV</option>
								<option value="紧凑型SUV">紧凑型SUV</option>
								<option value="中型SUV">中型SUV</option>
								<option value="中大型SUV">中大型SUV</option>
								<option value="微型车">微型车</option>
								<option value="小型车">小型车</option>
								<option value="紧凑型车">紧凑型车</option>
								<option value="中型车">中型车</option>
								<option value="中大型车">中大型车</option>
								<option value="MPV">MPV</option>
								<option value="跑车">跑车</option>
								<option value="皮卡">皮卡</option>
							</select>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div id="scores" style="width: 1000px; height: 400px; margin-left: 6%"></div>
                         <script src="js/echarts.js"></script>
						<script type="text/javascript">
							var myChartThree = echarts.init(document.getElementById('scores'));
							ShowScore();
						</script>
                    </div>
                </div>
            </section>
            
            <!-- // Consumption -->
            <section id="consumption" class="content-section">
                <div class="section-heading">
                    <h2>实测油耗</h2>
					<h3 class="section-subheading text-muted">通过用户的实际驾驶对油耗的统计</h3>
                </div>
                <div class="section-content">
                    <div id="consume" style="width: 1000px; height: 450px;margin-left: 6%"></div>
                     <script src="js/echarts.js"></script>
					<script type="text/javascript">
						var myChartFour = echarts.init(document.getElementById('consume'));
					 	showConsumption();
					  
					</script>
                </div>
            </section>
            
            <!-- // Purpose -->
            <section id="purpose" class="content-section">
                <div id="contact-content">
                    <div class="section-heading">
                        <h2 class="section-heading">车型优缺点</h2>
						<h3 class="section-subheading text-muted">查看已购车主对该款车的优缺点评价</h3>
                    </div>
                    <div class="section-content">
                    	<div class="row">
                        	<div class="col-md-4">
                            	<select name="buytype"
									style="height: 30px; width: 230px; margin-top: 20px; margin-left: 15px"
									id="buytype" onchange="ShowBuyPurpose(this);">
								</select>
                            </div>
                            <div class="col-md-12">
                            	<div id="buypurpose" style="width: 1000px; height: 400px; margin-left: 6%"></div>
								<script src="js/echarts-all.js"></script>
								<script type="text/javascript">
									var myChartFive = echarts.init(document.getElementById('buypurpose'));
									$.ajax({
										type : "POST",
										async : false, //同步执行   结束请求后再在执行下一个ajax
										url : "SelectServlet",
										dataType : "JSON",
										success : function(data) {
											$("#buytype").html("");
											for ( var i = 0; i < data.carList.length; i++) {
												$("#buytype").append(
													"<option value='"+data.carList[i]+"'>"
													+ data.carList[i] + "</option>");
											}
										}
									});
				    
				   					ShowBuyPurpose();
								</script>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            
            <!-- // Area -->
            <section id="area" class="content-section">
                <div class="row">
                    <div class="col-md-12" >
                        <div class="section-heading">
                            <h2 class="section-heading">地域销售</h2>
							<h3 class="section-subheading text-muted">点击左边地图，查看不同省份汽车销售量对比</h3>
                        </div>
                        <div id="areaMap" style=" width:1100px;height:500px; margin-left: 6%"></div>
                        
                        <script src="js/ec/echarts.js"></script>
                        <script src="js/ec/china.js"></script>
                        <script>
                        showArea();
						</script>
                    </div>
                </div>
            </section>

		<!-- // Advise -->
		<section id="advise" class="content-section">
			<div class="row">
				<div class="col-md-12" style="margin-top: 5%">
					<div class="section-heading">
						<h2 class="section-heading">购车推荐</h2>
						<h3 class="section-subheading text-muted">根据筛选条件为您推荐一款最合适的汽车</h3>
					</div>
				</div>
			</div>

			<ul class="select">
        <li class="select-list">
            <dl id="select1">
                <dt>级别：</dt>
                <dd class="select-all selected"><a href="#" onclick="return false;">全部</a></dd>
                <dd><a href="#" onclick="return false;">小型SUV</a></dd>
                <dd><a href="#" onclick="return false;">紧凑型SUV</a></dd>
                <dd><a href="#" onclick="return false;">中型SUV</a></dd>
                <dd><a href="#" onclick="return false;">中大型SUV</a></dd>
                <dd><a href="#" onclick="return false;">微型车</a></dd>
                <dd><a href="#" onclick="return false;">小型车</a></dd>
                <dd><a href="#" onclick="return false;">紧凑型车</a></dd>
                <dd><a href="#" onclick="return false;">中型车</a></dd>
                <dd><a href="#" onclick="return false;">中大型车</a></dd>
                <dd><a href="#" onclick="return false;">MPV</a></dd>
                <dd><a href="#" onclick="return false;">跑车</a></dd>
                <dd><a href="#" onclick="return false;">面包车</a></dd>
                <dd><a href="#" onclick="return false;">豪华车</a></dd>
            </dl>
        </li>
        
        <li class="select-list">
            <dl id="select2">
                <dt>价格：</dt>
                <dd class="select-all selected"><a href="#" onclick="return false;">全部</a></dd>
                <dd><a href="#" onclick="return false;">5万以下</a></dd>
                <dd><a href="#" onclick="return false;">5-8万</a></dd>
                <dd><a href="#" onclick="return false;">8-12万</a></dd>
                <dd><a href="#" onclick="return false;">12-18万</a></dd>
                <dd><a href="#" onclick="return false;">18-25万</a></dd>
                <dd><a href="#" onclick="return false;">25-40万</a></dd>
                <dd><a href="#" onclick="return false;">40-80万</a></dd>
                <dd><a href="#" onclick="return false;">80万以上</a></dd>
            </dl>
        </li>
        
        <li class="select-list">
            <dl id="select3">
                <dt>侧重点：</dt>
                <dd class="select-all selected"><a href="#" onclick="return false;">全部</a></dd>
                <dd><a href="#" onclick="return false;">舒适度</a></dd>
                <dd><a href="#" onclick="return false;">空间</a></dd>
                <dd><a href="#" onclick="return false;">配置</a></dd>
                <dd><a href="#" onclick="return false;">性价比</a></dd>
                <dd><a href="#" onclick="return false;">动力</a></dd>
                <dd><a href="#" onclick="return false;">操控</a></dd>
            </dl>
        </li>
        
        <li class="select-result">
            <dl>
                <dt>已选条件：</dt>
                <dd class="select-no">暂时没有选择过滤条件</dd>
            </dl>
            <input class="button" type="button" value="确认" onclick="AdviseCars(this)"style="margin-left: 720px;margin-top: 0px"/>
        </li>
    </ul>

	<div id="result" style="display:none">
	<h1 id="car_name">全部</h1>
	<h1 id="price">全部</h1>
	<h1 id="point">全部</h1>
        </div>

	<div id="advisecar" style="display:none">
		<section class="wrapper style1">
		<div class="inner">
			<!-- 2 Columns -->
			<div class="flex flex-2">
				<div class="col col1">
					<div class="image round fit">
						<a><img id="img" src="images/pic01.jpg" alt="" /></a>
					</div>
				</div>
				<div class="col col2" id="content">

					<table frame="void" rules="rows">

						<tr>

							<th>车款</th>

							<td id="type"></td>

						</tr>

						<tr>

							<th>舒适度</th>

							<td id="comfort"></td>

						</tr>
						<tr>

							<th>空间</th>

							<td id="space"></td>

						</tr>
						<tr>

							<th>配置</th>

							<td id="config"></td>

						</tr>
						<tr>

							<th>性价比</th>

							<td id="quality"></td>

						</tr>
						<tr>

							<th>动力</th>

							<td id="power"></td>

						</tr>
						<tr>

							<th>操控</th>

							<td id="control"></td>

						</tr>
					</table>

				</div>
			</div>
		</div>
		</section>
	</div>
	
	<div id="nocar" style="display:none">
	<h1 style="text-align:center">Sorry,找不到你要的车。</h1>
	</div>
		</section>

		<!-- // Footer -->
            <section class="footer">
                <p>Copyright &copy; 2018 Car Data. Design</p>
            </section>
        </div>



    <script src="https://cdn.bootcss.com/jquery/1.11.2/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>

    <script src="js/vendor/bootstrap.min.js"></script>
    
    <script src="js/plugins.js"></script>
    <script src="js/main.js"></script>
    
    <script>
    
    </script>

    <script>
        // Hide Header on on scroll down
        var didScroll;
        var lastScrollTop = 0;
        var delta = 5;
        var navbarHeight = $('header').outerHeight();

        $(window).scroll(function(event){
            didScroll = true;
        });

        setInterval(function() {
            if (didScroll) {
                hasScrolled();
                didScroll = false;
            }
        }, 250);

        function hasScrolled() {
            var st = $(this).scrollTop();
            
            // Make sure they scroll more than delta
            if(Math.abs(lastScrollTop - st) <= delta)
                return;
            
            // If they scrolled down and are past the navbar, add class .nav-up.
            // This is necessary so you never see what is "behind" the navbar.
            if (st > lastScrollTop && st > navbarHeight){
                // Scroll Down
                $('header').removeClass('nav-down').addClass('nav-up');
            } else {
                // Scroll Up
                if(st + $(window).height() < $(document).height()) {
                    $('header').removeClass('nav-up').addClass('nav-down');
                }
            }
            
            lastScrollTop = st;
        };
    </script>

    <script src="https://cdn.bootcss.com/jquery/1.10.2/jquery.min.js" type="text/javascript"></script>
    
    

</body>
</html>