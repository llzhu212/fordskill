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
		
		.toast--blue .toast__icon{
			  background-color:#1D72F3;
			}
		
.toast__icon{
  position:absolute;
  top:50%;
  left:22px;
  transform:translateY(-50%);
  width:14px;
  height:14px;
  padding: 7px;
  border-radius:50%;
  display:inline-block;
}
		
  </style>
    <link rel="stylesheet" type="text/css" href="../static/css/login.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>
	<div class="container" style="background-image: url(../static/img/bg3.png)">
		<div class="chongfu layui-anim layui-anim-up" >
			<img width="30px" height="30px" src="../static/img/success.png">&nbsp; 
			<span style="color: white;font-size: 20px;font-weight: 700;vertical-align: middle;">
				报名成功</span><br/><br/>
			<span style="color: white;font-weight: lighter;">请在8月23日10:30进行答题</span>
			<button class="layui-btn layui-btn-radius layui-btn-normal"  
			style="width: 50%; margin-top: 40px;"
			 onclick="javascript:window.location.href='<%=path%>/login/toHome.action'"
					  type="submit" lay-filter="login">确定</button>
		</div>
	</div>
</body>
</html>