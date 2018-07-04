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
	<div class="container" style="background-image: url(../static/img/bg3.jpg)">
	<form name="loginForm" method="post" action="<%=path%>/login/login.action" >
		<div class="login layui-anim layui-anim-up">
			<div class="layui-form" action="" method="post">
				<div class="layui-form-item">
					<input type="text" id="account" lay-verify="required|account" 
						maxlength="20" placeholder="请输入经销商代码" autocomplete="off" 
						name="agentcode" value = "${loginUserVO.agentcode}"
						autofocus="autofocus" class="layui-input" />
				</div>
				<div class="layui-form-item">
					<input type="password" id="password" lay-verify="required" 
					maxlength="20" placeholder="请输入密码" value = "${loginUserVO.password}"
					name="password"
					autocomplete="off" class="layui-input" />
				</div>
				<div class="layui-form-item" style="text-align: left;">
					<input type="checkbox" class="layui-form-checkbox" 
					checked="checked" value=""/>
					<span style="color: white;vertical-align: middle;">
						记住我
					</span>
					<span  style="padding-left: 30px;color: red;vertical-align: middle;">${msg}</span>
					</tr>
				</div>
	
				<button class="login_btn layui-btn layui-btn-radius layui-btn-normal" 
				  type="submit" lay-filter="login">登录</button>
			</div>
		</div>
	</form>
	</div>
</body>
</html>