<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="basepath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<title>报名页面</title>
	<style type="text/css">
	*{padding: 0;margin: 0;font-size: .14rem;font-family: "Microsoft YaHei","Helvetica Neue","Hiragino Sans GB",Arial,sans-serif;}
	html,body{height: 100%;}
	input,button,select{outline: none;}
	.container{max-width: 750px;min-height: 100%;margin: 0 auto;background: no-repeat center 0;background-size: 100% 100%;}
	.flex-box{display: flex;}
	.flex1{flex: 1;} 
	.logo{padding: .15rem .15rem;font-size: .16rem;}
	.logo>img{display: inline-block;height: .35rem;}
	.logo>img:first-child{margin-right: .1rem;float: right;}
	.input-wrap{width: 2.5rem;}
	.input-wrap>input,.input-wrap>select{
		margin-right: .1rem;
		box-sizing: border-box;
		width: 2rem;
	    height: 0.3125rem;
	    padding: .05rem 1rem;
	    padding: .06rem 8px;
	    line-height: 0.2125rem;
	    color: #555;
	    background-color: #fff;
	    background-image: none;
	    border: 1px solid #ccc;
	    border-radius: 4px;
	    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
	    box-shadow: inset 0 1px 1px rgba(0,0,0,.075);
	    -webkit-transition: border-color ease-in-out .15s,-webkit-box-shadow ease-in-out .15s;
	    -o-transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
	    transition: border-color ease-in-out .15s,box-shadow ease-in-out .15s;
	}
	.input-wrap>span{vertical-align: baseline;display: inline-block;}
	.input-wrap>span>img{width: .12rem;}
	.input-wrap>input:focus,.input-wrap>select:focus {
	    border-color: #66afe9;
	    outline: 0;
	    -webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.075), 0 0 8px rgba(102,175,233,.6);
	    box-shadow: inset 0 1px 1px rgba(0,0,0,.075), 0 0 8px rgba(102,175,233,.6);
	}
	.form-wrap>.flex-box{padding: .1rem 0;}
	.form-wrap>.flex-box>.flex1{text-align: right;padding-right: .1rem;box-sizing: border-box;font-size: .16rem;color: #fff;}
	.beizhu{padding: .1rem .2rem;text-align: center;}
	.beizhu>div{display: inline-block;text-align: justify;}
	.beizhu p.name{color: #f00;font-size: .15rem;}
	.beizhu p.info{line-height: .24rem;font-size: .14rem;color: #fff;}
	.beizhu p.info font{color: #f00;}
	.btn-wrap{text-align: center;margin-top: 0.2279rem;}
	.btn-info {
	    background: url(${basepath}/static/img/abd_22.png) no-repeat center center;
	    background-size: 100% 100%;height: 0.65rem;
	    background-color: #fff100;
	    border: none;
	    width: 1.715rem;
	}
	.btn-info:active{background-color: #f1e300;}
	.btn {
	    display: inline-block;
	    margin-bottom: 0;
	    text-align: center;
	    white-space: nowrap;
	    vertical-align: middle;
	    -ms-touch-action: manipulation;
	    touch-action: manipulation;
	    cursor: pointer;
	    -webkit-user-select: none;
	    -moz-user-select: none;
	    -ms-user-select: none;
	    user-select: none;
	    border-radius: 4px;
	}
	.hide{display: none !important;}
	</style>
	<script type="text/javascript"  src="${basepath}/static/js/jquery-1.9.1.js"></script>
</head>

<body>
	<div class="container" style="background-image: url(${basepath}/static/img/bg.jpg);">
		<div class="logo"><img src="${basepath}/static/img/abd_05.png" /><img src="${basepath}/static/img/abd_03.png"/></div>
		<div><img src="${basepath}/static/img/abd_10.png" style="width: 2.87rem;margin: .108rem auto .23125rem;display: block;"/></div>
		<div><img src="${basepath}/static/img/abd_14.png" style="width: 2.07rem;margin: 0 auto 0.325rem;display: block;"/></div>
		<div>
			<form class="form-wrap"id="addUser" action="${basepath}/fordexhibition/addExhibition.act" method="post" >
				<div class="flex-box">
					<div class="flex1">您的姓名：</div>
					<div class="input-wrap"><input id="username" value="${name}" type="text" name="name" placeholder="请输入姓名"/><span><img src="${basepath}/static/img/abd_18.png"/></span><span id="vusername" style="display:none;"><font color="red">请输入姓名！</font></span></div>
				</div>
				<div class="flex-box">
					<div class="flex1">手机号码：</div>
					<div class="input-wrap"><input id="phone" value="${phone}" type="text" maxlength="11" name="phone" placeholder="请输入手机号码" /><span><img src="${basepath}/static/img/abd_18.png"/></span>
					<c:choose>
					 <c:when test="${chongfuerror == 1}">
					    <span id="vphone" ><font color="red">该号码已使用!</font></span>
					 </c:when>
					 <c:otherwise>
					    <span id="vphone" style="display:none;"><font color="red">请输入手机号码！</font></span>
					 </c:otherwise>
					</c:choose>
					</div>
				</div>
				<!--<div class="flex-box">
					<div class="flex1">活动举办城市：</div>
					<div class="input-wrap">
						<select name="city">
							<option value="">请选择城市</option>
							<option value="12">哈尔滨</option>
							<option value="33">重庆</option>
						</select>
						<span><img src="img/abd_18.png"/></span></div>
				</div>-->
				<div class="flex-box">
					<div class="flex1">意向经销商：</div>
					<div class="input-wrap">
						<select id="agentcode" name="code">
							<option value="">请选经销商</option>
							<c:forEach items="${fordagentlist}" var="var">
							<option value="${var.code}" <c:if test="${var.code eq code}">selected</c:if>>${var.abbreviation}</option>
							</c:forEach>
						</select>
						<span style="margin-left:-7px"><img src="${basepath}/static/img/abd_18.png"/></span><span id="vagentcode" style="display:none;"><font color="red">请选择供应商！</font></span></div>
				</div>
			</form>
			<div class="btn-wrap">
				<button class="btn btn-info" onclick="validateForm();">&nbsp;</button>
			</div>
			<div class="beizhu">
				<div>
					<p class="name">备注：</p>
					<p class="info">
						A、“<font>*</font>”处为必填项，请如实填写。 <br />
						B、成功报名后才可获得有效抽奖资格。 <br />
						C、报名截止时间：2018年7月12日24时
					</p>
				</div>
			</div>
		</div>
		<!--<img src="img/c1.png" style="position:absolute;bottom:0;left:0;width:100%"/>-->
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

function validateForm(){
	var flag  = true;
	var username = $("#username").val();
	var phone = $("#phone").val();
	var agentcode = $("#agentcode").val();
	$("#vusername").hide();
	$("#vphone").hide();
	$("#vagentcode").hide();
	if(username==""){
		$("#vusername").show();
		flag = false;
	}
	if(phone==""){
		$("#vphone").html("<font color='red'>请输入电话号码!</font>");
		$("#vphone").show();
		flag = false;
	}else if(phone.length <11){
		$("#vphone").html("<font color='red'>请输入完整电话号码！</font>");
		$("#vphone").show();
		flag = false;
	}
	if(agentcode==""){
		$("#vagentcode").show();
		flag = false;
	}
	if(flag==true){
		var form = document.getElementById("addUser");
		form.submit();
	}
}
</script>	
</body>
</html>