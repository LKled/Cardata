//功能描述: 社交平台分享功能实现，分别实现新浪微博和QQ空间分享以及微信公众号文章推送
function shareToSina(){
	var title ="超有用的汽车大数据平台，选车就用它！";
	var pics = "http://s12.sinaimg.cn/middle/002Ik5u5zy7nkINMg2L7b&690";
	var url = "http://140.82.22.122:8080/CarData/";
	var sharesinastring='http://v.t.sina.com.cn/share/share.php?title='+title+'&url='+url+'&content=utf-8&sourceUrl='+url+'&pic='+pics; 
	window.open(sharesinastring,'newwindow','height=800,width=800,top=100,left=100'); 
}

function shareToQQZone(){
	var title ="超有用的汽车大数据平台，选车就用它！";
	var pics = "http://s12.sinaimg.cn/middle/002Ik5u5zy7nkINMg2L7b&690";
	var url = "http://140.82.22.122:8080/CarData/";
	var shareqqzonestring='http://sns.qzone.qq.com/cgi-bin/qzshare/cgi_qzshare_onekey?summary='+title+'&url='+url+'&pic='+pics; ; 
	window.open(shareqqzonestring,'newwindow','height=800,width=800,top=100,left=100'); 
}

function shareToWechat(){
	var sharewechatstring='https://mp.weixin.qq.com/s?__biz=MzUxMTkzMjEwNg==&mid=2247483701&idx=1&sn=cf8681125a564e1ae077960b3633f359&chksm=f96d6290ce1aeb86a01babf9adb690d937306739c7c3f6ebc880bc8e969ca3d1db46da983bf6&token=1083022359&lang=zh_CN#rd';
	window.open(sharewechatstring,'newwindow','height=800,width=800,top=100,left=100'); 
}