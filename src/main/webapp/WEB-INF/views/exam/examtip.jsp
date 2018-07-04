<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <title>长安福特二手车技能大赛</title>
	<style type="text/css">
		
 	.chongfu{
		width:250px;
		padding:20px;
		padding-top:40px;
		background-color:rgba(0,0,0,0.5);
		border-radius:4px;
		position:absolute;
		left:50%;
		top:46%;
		margin:-150px 0 0 -150px;
		z-index:99;
		text-align:center}
		
  </style>
  	 <link rel="stylesheet" type="text/css" href="../static/css/login.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body >
	<div class="container" style="background-image: url(../static/img/bg3.jpg)">
		<div class="chongfu layui-anim layui-anim-up" style="text-align: left;" >
			<center style="color: white;font-size: 20px;font-weight: 700;">考试规则</center><br/>
			<p>
			<span style="color: white;">1、考试时间：10:00--11:00<br>
			2、考试包括单选题，多选题，判断题<br>
			3、考试时间到，如你没有人工点击交卷，系统将自动收卷
			</span>
			</p>
			<br>
			<center>
			<button class="layui-btn layui-btn-radius layui-btn-normal"  
			style="width: 50%; margin-top: 10px;margin-bottom: 10px;"
			 onclick="javascript:window.location.href='<%=path%>/exam/forwardExam.act'"
					  type="submit" lay-filter="login">开始答题</button>
			</center>
		</div>
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