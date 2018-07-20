<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <meta content="yes" name="apple-mobile-web-app-capable">
    <meta content="black" name="apple-mobile-web-app-status-bar-style">
    <meta name="x5-orientation" content="portrait">
    <meta name="x5-page-mode" content="app">
    <title>长安福特二手车技能大赛</title>
     <link rel="stylesheet" type="text/css" href="../static/css/login.css">
 <style>

.div_c_l {
	padding: 2px;
	font-weight: 500;
	color: white;
}

.div_c_l span {
	line-height: 38px;
	padding: 0 5px;
	width: 60px;
}

.div_c_l img {
	height: 30px;
	margin: 2px;
	padding: 0px 7px;
}

.div_c_r {
	float: right;
	padding: 2px;
	width: calc(100% - 100px);
	padding-left: 15px;
}

.div_c_r input {
	border: 0px;
	margin: 5px;
	float: right;
	line-height: 28px;
	text-align: right;
	width: 110%;
	outline: none;
	text-align: left;
	padding: 2px;
}

.div_c_r button {
	width: 88px;
	float: right;
	background-color: #F2F2F2;
	height: 28px;
	padding: 4px 8px;
	line-height: 20px;
	font-size: 14px;
	font-weight: 500;
	margin: 5px 5px 0 0;
	border: 1px solid #DBDBDB;
	border-radius: 6px;
	outline: none;
}

.div_f {
	border-bottom: 1px solid #E8E8E8;
}

.btn_1 {
	border: none;
	margin: 20px 6% 0px 6%;
	width: 88%;
	height: 1.8em;
	background-color: #05a0e0;
	border-radius: 4px;
	font-size: 20px;
	color: #FFFFFF;
	outline: none;
	-webkit-tap-highlight-color: transparent;
}

.div_b_l {
	float: left;
	margin-left: 6%;
	padding: 5px;
	width: calc(44% - 10px);
}

.div_b_r {
	float: right;
	margin-right: 6%;
	padding: 5px;
	width: calc(44% - 10px);
	text-align: right;
}

.span_b {
	font-weight: 500;
	color: #000;
	padding: 0 2px;
	float: left;
}

.span_br {
	font-weight: 500;
	color: #05a0e0;
	float: left;
}

</style>


</head>

<body sroll="no" onclick="onload">
<div class="container" style="background-image: url(../static/img/bg3.gif)">
<form name="form1"  action="<%=path%>/registration/addRegistration.action" method="post" onSubmit="return checkreg()">
	<div class="regis layui-anim layui-anim-up" style="text-align: center;">
	<span style="color: white;font-size: 20px;font-weight: 700;">长安福特二手车技能大赛</span><br/>
	<span style="color: white;font-size: 20px;font-weight: 700;">分站赛入围名单</span><br/>
	<div class="div_f" style="margin-top: 15px;">
		<div class="div_col" id="me">
			<div class="div_c_l"><span>1、浙江万国</span></div>
		</div>
		<div style="clear:both"></div>
	</div>
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span>2、重庆安福</span></div>
		</div>
		<div style="clear:both"></div>
	</div>
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span>3、东莞冠骏</span></div>
		</div>
		<div style="clear:both"></div>
	</div>
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span>4、广州瀚福</span></div>
		</div>
		<div style="clear:both"></div>
	</div>
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span>5、武汉威汉</span></div>
		</div>
		<div style="clear:both"></div>
	</div>
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span>6、山东福特福</span></div>
		</div>
		<div style="clear:both"></div>
	</div>
	</div>
</form>
</div>

<script type="text/javascript">

(function () {
	var setFont = function () {
		var wd = window.innerWidth>screen.width?screen.width: window.innerWidth;
		var width = wd>750?750: wd;
		var fts = width/3.75;//23.438
		console.log("fts="+fts)
		var agent = navigator.userAgent;
		document.documentElement.style.fontSize = fts + 'px'
	}
	setFont();
//	var window_width = window.innerWidth, calc_window_width;
//	calc_window_width = window_width>750?750: window_width;
//	document.documentElement.style.fontSize = calc_window_width/3.75 + 'px'
	window.onresize=function () {
		setFont();
	}
	
})()	
</script>
</body>
</html>