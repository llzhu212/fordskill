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
        .loadingcss{position:fixed;z-index:999;top:0;left:0;display:table;width:100%;height:100%;background:#dedfe6;color:#fff;text-align:center}.loadingcss .loader{display:table-cell;vertical-align:middle}.loadingcss .loader span{position: relative; display: inline-block; margin-bottom: .5rem; border-top: .3rem solid hsla(0,0%,100%,.7); border-right: .3rem solid hsla(0,0%,100%,.7); border-bottom: .3rem solid hsla(0, 0%, 100%, 0.7); border-left: .3rem solid #4462a7; -webkit-animation: load .8s infinite linear; animation: load .8s infinite linear;}.loadingcss .loader span,.loadingcss .loader span:after{width:2.2rem;height:2.2rem;border-radius:50%}@-webkit-keyframes load{0%{-webkit-transform:rotate(0);transform:rotate(0)}to{-webkit-transform:rotate(360deg);transform:rotate(360deg)}}@keyframes load{0%{-webkit-transform:rotate(0);transform:rotate(0)}to{-webkit-transform:rotate(360deg);transform:rotate(360deg)}}
    </style>
    <link rel="stylesheet" type="text/css" href="../static/css/style.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>
	<div class="container" style="background-image: url(../static/img/bg1.png)">
	<div class="content">
				<a href="<%=path%>/registration/forwardRegistration.action" class="button">
					<span class="line line-top"></span>
					<span class="line line-right"></span>
					<span class="line line-bottom"></span>
					<span class="line line-left"></span>
					我要报名
				</a>
				<a href="<%=path%>/exam/toExam.action" class="button">
					<span class="line line-top"></span>
					<span class="line line-right"></span>
					<span class="line line-bottom"></span>
					<span class="line line-left"></span>
					我要考试
				</a>
				<a href="<%=path%>/exam/toExamScore.action" class="button">
					<span class="line line-top"></span>
					<span class="line line-right"></span>
					<span class="line line-bottom"></span>
					<span class="line line-left"></span>
					查看成绩
				</a>
				<a href="<%=path%>/exam/toExamruwei.action" class="button">
					<span class="line line-top"></span>
					<span class="line line-right"></span>
					<span class="line line-bottom"></span>
					<span class="line line-left"></span>
					入围名单
				</a>
		</div>
	</div>
</body>
</html>