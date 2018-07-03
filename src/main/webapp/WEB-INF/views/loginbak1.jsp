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
 <style>
	body{
	background-color: -moz-linear-gradient( top,#ccc,#000);
	}
	#login{
		box-shadow:
		0 0 2px rgba(0,0,0,0.2),
		0 1px 1px rgba(0,0,0,.2),
		0 3px 0 #fff,
		0 4px 0 rgba(0,0,0,.2);
 
		position:absolute;
		z-index: 0;
 
		/*
		-moz-box-shadow:5px 5px 5px #d0d0d0 inset; 
		-webkit-box-shadow:5px 5px 5px #d0d0d0 inset;
		box-shadow:5px 5px 5px #d0d0d0 inset; */
	}
 
	#login:before{
		content:'';
		position:absolute;
		z-index:-1;
		border :1px dashed #ccc;
		top :5px;bottom:5px;left:5px;right:5px;
		box-shadow: 0 0 0 1px #fff;
	}
 
	h3{
		text-shadow: 0 1px 0 rgba(255,25,55,.9);
		
		text-transform:uppercase;
		text-align:center;
		color:#d0d0d0;
		margin:0 0 30px 0;/*ma外pa内*/
		letter-spacing:4px;
		position:relative;
	}
 
	h3:after, h3:before{
		background-color:#777;
		content:"";
		height:1px;
		position:absolute;
		top:15px;width:120px;
	}
 
	h3:after{
		background-image:-webkit-gradient(linear,left top ,right top,from(#777),to(#fff) );
		
		background-image:-webkit-linear-gradient(left,#777,#fff);
 
		background-image:linear-gradient(left,#777,#fff);
		right:0;
 
	}
 
	h3:before{
		background-image:-webkit-gradient(linear,right top,left top,from(#777),to(#777));
 
		background-image:-webkit-linear-gradient(right,#777,#fff);
 
		background-image:linear-gradient(right,#777,#fff);
		left:0;
	}
	#login{
	background:linear-gradient(top,#ccc,#000);
	}
  </style>
    <link rel="stylesheet" type="text/css" href="../static/css/login.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>
		<div class="login layui-anim layui-anim-up" style="height: 100px;">
			<img width="30px" height="30px" src="../static/img/notice.png">&nbsp;&nbsp;
			<span style="color: white;">您已经成功报名了，请勿重复报名</span>
		</div>
</body>
</html>