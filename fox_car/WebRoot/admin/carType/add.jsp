<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="GBK"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
<head>
<title>添加车辆类型</title>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="keywords"
	content="Discuz!,Board,Comsenz,forums,bulletin board,">


<meta name="MSSmartTagsPreventParsing" content="TRUE">
<meta http-equiv="MSThemeCompatible" content="Yes">

<style type="text/css">
<!--
a {
	text-decoration: none;
	color: #000000
}

a:hover {
	text-decoration: underline
}

body {
	scrollbar-base-color: #F3F6FA;
	scrollbar-arrow-color: #4D76B3;
	font-size: 12px;
	background-color: #ffffff
}

table {
	font: 12px Verdana, Tahoma;
	color: #000000
}

input,select,textarea {
	font: 11px Verdana, Tahoma;
	color: #000000;
	font-weight: normal;
	background-color: #F3F6FA
}

select {
	font: 11px Verdana, Tahoma;
	color: #000000;
	font-weight: normal;
	background-color: #F3F6FA
}

.nav {
	font: 12px Verdana, Tahoma;
	color: #000000;
	font-weight: bold
}

.nav a {
	color: #000000
}

.header {
	font: 11px Verdana, Tahoma;
	color: #FFFFFF;
	font-weight: bold;
	background-image: url("images/green/bg01.gif")
}

.header a {
	color: #FFFFFF
}

.category {
	font: 11px Verdana, Tahoma;
	color: #000000;
	background-color: #EFEFEF
}

.tableborder {
	background: #4D76B3;
	border: 0px solid #4D76B3
}

.singleborder {
	font-size: 0px;
	line-height: 0px;
	padding: 0px;
	background-color: #F3F6FA
}

.smalltxt {
	font: 11px Verdana, Tahoma
}

.outertxt {
	font: 12px Verdana, Tahoma;
	color: #000000
}

.outertxt a {
	color: #000000
}

.bold {
	font-weight: bold
}

.altbg1 {
	background: #F3F6FA
}

.altbg2 {
	background: #FFFFFF
}
-->
</style>
<script language="JavaScript" src="images/common.js"></script>
<style type="text/css" id="defaultPopStyle">
.cPopText {
	font-family: Tahoma, Verdana;
	background-color: #FFFFCC;
	border: 1px #000000 solid;
	font-size: 12px;
	padding-right: 4px;
	padding-left: 4px;
	height: 20px;
	padding-top: 2px;
	padding-bottom: 2px;
	visibility: hidden;
	filter: Alpha(Opacity = 80)
}
</style>
</head>
<body leftmargin="0" rightmargin="0" topmargin="0"
	onkeydown="if(event.keyCode==27) return false;">
	<div id="popLayer" style="position: absolute; z-index: 1000;"
		class="cPopText"></div>
	<br>

	<form action="biotech_saveCarType.action" method="post" enctype="multipart/form-data">
		
		<input name="carType.id" value="${carType.id}" type="hidden" />

		<table class="tableborder" align="center" cellpadding="4"
			cellspacing="1" width="97%">
			<tbody>
				<tr>
					<td colspan="2" class="header">添加车辆类型</td>
				</tr>
				<tr>
					<td class="altbg1" width="20%">能源类型</td>
					<td class="altbg2">
						<select name="carType.type">
							<option value="新能源">新能源</option>
							<option value="油车">油车</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="altbg1" width="20%">品牌</td>
					<td class="altbg2">		<input name="carType.pinpai" value="${carType.pinpai}" type="text" /></td>
				</tr>
				<tr>
					<td class="altbg1" width="20%">车辆类型</td>
					<td class="altbg2">
						<select name="carType.daxiao">
							<option value="小型车">小型车</option>
							<option value="紧凑型车">紧凑型车</option>
							<option value="中型车">中型车</option>
							<option value="大型车">大型车</option>
						</select>
					</td>
				</tr>



			</tbody>
		</table>
		<br>
		<center>
			<input name="regsubmit" value="提交" type="submit">
		</center>
	</form>



</body>
</html>