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
		width:300px;
		padding:20px;
		padding-top:40px;
		background-color:rgba(0,0,0,0.5);
		border-radius:4px;
		position:absolute;
		left:50%;
		top:48%;
		margin:-150px 0 0 -150px;
		z-index:99;
		text-align:center}
		
  </style>
  	 <link rel="stylesheet" type="text/css" href="../static/css/login.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body >
	<div class="container" style="background-image: url(../static/img/bg3.jpg)">
		<div class="chongfu layui-anim layui-anim-up" style="text-align: center;" >
			<div style="width: 40%;height: auto;margin: 0 auto;text-align: left;">
			<center style="color: white;font-size: 20px;font-weight: 700;vertical-align: middle;">
				我的成绩</center><br/>
			<span style="color: white;">经销商：</span>
			<span style="color: red;">A02033</span><br>
			<span style="color: white;">分数：</span>
			<span style="color: red;">20</span>
			</div>
			<button class="layui-btn layui-btn-radius layui-btn-normal"  
			style="width: 50%; margin-top: 30px;"
			 onclick="javascript:window.location.href='<%=path%>/login/toHome.action'"
					  type="submit" lay-filter="login">查看试卷详情</button>
		</div>
	</div>

</body>
</html>