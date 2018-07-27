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
 <style>
 	.chongfu{
		width:300px;
		padding:20px;
		padding-top:40px;
		background-color:rgba(0,0,0,0.5);
		border-radius:4px;
		position:absolute;
		left:50%;
		top:50%;
		margin:-150px 0 0 -150px;
		z-index:99;
		text-align:center}
		
		
  </style>
    <link rel="stylesheet" type="text/css" href="../static/css/login.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>
	<div class="container" style="background-image: url(../static/img/bg3.png)">
		<div class="chongfu layui-anim layui-anim-up" >
			<img width="30px" height="30px" src="../static/img/notice.png">&nbsp;&nbsp; 
			<span style="color: white;">${msg}</span>
			<button class="layui-btn layui-btn-radius layui-btn-normal"  
			style="width: 50%; margin-top: 40px;"
			 onclick="javascript:window.location.href='<%=path%>/login/toHome.action'"
					  type="submit" lay-filter="login">确定</button>
		</div>
	</div>
</body>
</html>