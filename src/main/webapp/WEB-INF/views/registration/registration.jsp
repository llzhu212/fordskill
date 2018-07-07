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
	float: left;
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

input[type=checkbox] {
	visibility: hidden;
}

.checkboxforget {
	top: 0px;
	float: left;
	width: 20px;
	height: 20px;
	background: #05a0e0;
	margin: 0 5px 0 0;
	border-radius: 100%;
	position: relative;
}

.checkboxforget label {
	display: block;
	width: 18px;
	height: 18px;
	border-radius: 100px;
	-webkit-transition: all .5s ease;
	-moz-transition: all .5s ease;
	-o-transition: all .5s ease;
	-ms-transition: all .5s ease;
	transition: all .5s ease;
	cursor: pointer;
	position: absolute;
	top: 1px;
	left: 1px;
	z-index: 1;
	background: #fff;
}

.checkboxforget input[type=checkbox]:checked+label {
	background: #05a0e0;
	width: 20px;
	height: 20px;
	top: 0px;
	left: 0px;
}

.inp_radio {
	float: left;
	line-height: 48px;
}

input[type=radio] {
	visibility: hidden;
}

.checkboxforget1 {
	top: 13px;
	float: left;
	width: 20px;
	height: 20px;
	background: #AFAFAF;
	margin: 0 5px 0 0;
	border-radius: 100%;
	position: relative;
	/*            -webkit-box-shadow: 0px 1px 1px rgba(0,0,0,0.5);
-moz-box-shadow: 0px 1px 1px rgba(0,0,0,0.5);
box-shadow: 0px 1px 1px rgba(0,0,0,0.5);*/
}

.checkboxforget1 label {
	display: block;
	width: 18px;
	height: 18px;
	border-radius: 100px;
	-webkit-transition: all .5s ease;
	-moz-transition: all .5s ease;
	-o-transition: all .5s ease;
	-ms-transition: all .5s ease;
	transition: all .5s ease;
	cursor: pointer;
	position: absolute;
	top: 1px;
	left: 1px;
	z-index: 1;
	background: #fff;
	/*            -webkit-box-shadow:inset 0px 1px 1px rgba(0,0,0,0.5);
-moz-box-shadow:inset 0px 1px 1px rgba(0,0,0,0.5);
box-shadow:inset 0px 1px 1px rgba(0,0,0,0.5);*/
}

.checkboxforget1 input[type=radio]:checked+label {
	background: #05a0e0;
	width: 20px;
	height: 20px;
	top: 0px;
	left: 0px;
}

.red {
	color: #ff6600;
	display: inline-block;
}
</style>


</head>

<body sroll="no" onclick="onload">
<div class="container" style="background-image: url(../static/img/bg3.jpg)">
<form name="form1"  action="<%=path%>/registration/addRegistration.action" method="post" onSubmit="return checkreg()">
	<div class="regis layui-anim layui-anim-up">
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span>经销商</span>
			</div>
			<div class="div_c_r">
				<input type="text"  id="name" value="${agent.name}" 
					disabled="disabled"></input>
				<input type="hidden" name="name" value="${agent.name}" />
			</div>
		</div>
		<div style="clear:both"></div>
	</div>
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span>经销商代码</span>
			</div>
			<div class="div_c_r">
				<input type="text" name="code" id="code" value="${agent.code}" 
					disabled="disabled"></input>
				<input type="hidden" name="code" value="${agent.code}" />
			</div>
		</div>
		<div style="clear:both"></div>
	</div>
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span>经销商区域</span>
			</div>
			<div class="div_c_r">
				<input type="text" name="region" id="region" value="${agent.region}" 
					disabled="disabled"></input>
				<input type="hidden" name="region" value="${agent.region}" />
			</div>
		</div>
		<div style="clear:both"></div>
	</div>
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span> 姓名一</span>
			</div>
			<div class="div_c_r">
				<input type="text" name="users[0].name" id="username1" placeholder="请输入姓名">
					<span style="float: right;margin-top: -30px;margin-right: 10px" id="tish"></span>
				</input>
			</div>
		</div>
		<div style="clear:both"></div>
	</div>
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span style="width:70px;">电话</span>
			</div>
			<div class="div_c_r"><input type="tel"  name="users[0].phone" onkeydown="" id="phone1" value="" placeholder="请输入手机">
				<span style="float: right;margin-top: -30px;margin-right: 10px" id="tss"></span>
			</div>
		</div>
		<div style="clear:both"></div>
	</div>
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span>性别</span>
			</div>
			<div class="div_c_r" style="padding: 0;">
				<div style="margin-left: 28px;" class="inp_radio">
					<div class="checkboxforget1">
						<input type="radio" id="Remember1" name="users[0].sex" id="sex" value="0" checked />
						<label for="Remember1"></label>
					</div>
					<font color="white">男</font>
				</div>
				<div style="margin-left: 8px;" class="inp_radio">
					<div class="checkboxforget1">
						<input type="radio" id="Remember2" name="users[0].sex" id="sex" value="1" />
						<label for="Remember2"></label>
					</div>
					<font color="white">女</font>
				</div>
			</div>
		</div>
		<div style="clear:both"></div>
	</div>
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span> 姓名二</span>
			</div>
			<div class="div_c_r"><input type="text" name="users[1].name" id="username2" placeholder="请输入姓名">
				<span style="float: right;margin-top: -30px;margin-right: 10px" id="tish2"></span></input>
			</div>
		</div>
		<div style="clear:both"></div>
	</div>
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span style="width:70px;">电话</span>
			</div>
			<div class="div_c_r"><input type="tel" id="phone2" name="users[1].phone" onkeydown="" value="" placeholder="请输入手机">
				<span style="float: right;margin-top: -30px;margin-right: 10px" id="tss2"></span>
			</div>
		</div>
		<div style="clear:both"></div>
	</div>
	<div class="div_f">
		<div class="div_col" id="me">
			<div class="div_c_l"><span>性别</span>
			</div>
			<div class="div_c_r" style="padding: 0;">
				<div style="margin-left: 28px;" class="inp_radio">
					<div class="checkboxforget1">
						<input type="radio" id="Remember3"  name="users[1].sex" id="sex3" value="0" checked />
						<label for="Remember3"></label>
					</div>
					<font color="white">男</font>
				</div>
				<div style="margin-left: 8px;" class="inp_radio">
					<div class="checkboxforget1">
						<input type="radio" id="Remember4"  name="users[1].sex" id="sex4" value="1" />
						<label for="Remember4"></label>
					</div>
					<font color="white">女</font>
				</div>
			</div>
		</div>
		<div style="clear:both"></div>
	</div>
	<button id="submit" type="submit" class="btn_1" >提交</button>
	</div>
</form>
</div>

<script type="text/javascript">
function checkreg() {
	var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\d{8})$/;
	var flag = true;
	if(document.form1.username1.value == "") {
		//alert("请输入您的用户名!");
		document.getElementById("tish").innerHTML = "<font color='red'>请输入您的姓名!</font>";
		form1.username1.focus();
		flag = false;
	}
	if(document.form1.phone1.value == "") {
		//alert("请输入您的用户名!");
		document.getElementById("tss").innerHTML = "<font color='red'>请输入手机号码!</font>";
		form1.phone1.focus();
		flag = false;
	}else{
		if(!myreg.test(document.form1.phone1.value)) {
			document.getElementById("tss").innerHTML = "<font color='red'>手机号码错误</font>";
			form1.phone1.focus();
			return false;
		}

	}
	
	if(document.form1.username2.value == "") {
		//alert("请输入您的用户名!");
		document.getElementById("tish2").innerHTML = "<font color='red'>请输入您的姓名!</font>";
		form1.username2.focus();
		flag = false;
	}
	if(document.form1.phone2.value == "") {
		//alert("请输入您的用户名!");
		document.getElementById("tss2").innerHTML = "<font color='red'>请输入手机号码!</font>";
		form1.phone2.focus();
		flag = false;
	}else{
		if(!myreg.test(document.form1.phone2.value)) {
			document.getElementById("tss2").innerHTML = "<font color='red'>手机号码错误</font>";
			form1.phone2.focus();
			return false;
		}
	}
	return flag;
}

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