<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 


<html>
<head>
<title>订单管理</title>

<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<meta name="keywords"
	content="Discuz!,Board,Comsenz,forums,bulletin board,">

<meta name="generator" content="Discuz! 4.0.0RC4 with Templates 4.0.0">
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
	color: #000000;
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
	filter: Alpha(Opacity =   80)
}
</style>

<script>
function confirmd() {  
            var msg = "Are You Sure Delete?";  
            if (confirm(msg)==true){  
                return true;  
            }else{  
                return false;  
            }  
           }
</script>
</head>

<body leftmargin="0" rightmargin="0" topmargin="0"
>


	
	<br>
<!-- 
	private int id;
	private int userid;
	private String username;
	private Date cunche_start_date;
	private Date cunche_end_date;
	private String cunche_start_date_str;
	private String cunche_end_date_str;
	private int status;//0 待处理，1寄存中 ，2租车中  3 已取车
	private float money;
	private String fileFileName;
	private File file;
	private String image_url;
	private String car_no;


 -->

	<table class="tableborder" align="center" cellpadding="4"
		cellspacing="1" width="97%">
		<tbody>
				<tr>
				<td  class="altbg1" align="center" width="5%"><font color="red" size="3" style="font-weight:bold;font-style:italic;">统计(金额)</font></td>
				<td class="altbg1" align="center" colspan="5"><font color="red" size="3" style="font-weight:bold;font-style:italic;">存车费(-)合计:${money1_1 }元</font></td>
				<td class="altbg1" align="center" colspan="5"><font color="red" size="3" style="font-weight:bold;font-style:italic;">租车收入(+)合计:${money1_2 }元</font></td>
			</tr>
		<tr>

				<td  class="altbg1" align="center" width="5%"><font color="blue" size="3" style="font-weight:bold;font-style:italic;">统计(数量)</font></td>
				<td class="altbg1"  align="center" colspan="2"><font color="blue" size="3" style="font-weight:bold;font-style:italic;">租车中:${fn:length(list1_2)}</font></td>
				<td class="altbg1" align="center" colspan="2"><font color="blue" size="3" style="font-weight:bold;font-style:italic;">寄存中:${fn:length(list1_1)}</font></td>
				<td class="altbg1" align="center" colspan="2"><font color="blue" size="3" style="font-weight:bold;font-style:italic;">待处理:${fn:length(list1_0)}</font></td>
				<td class="altbg1" align="center" colspan="2"><font color="blue" size="3" style="font-weight:bold;font-style:italic;">已取车:${fn:length(list1_3)}</font></td>
				<td class="altbg1" align="center" colspan="2"><font color="blue" size="3" style="font-weight:bold;font-style:italic;">已结算:${fn:length(list1_4)}</font></td>
			</tr>
		
		
			<tr class="header">

				<td align="center" width="5%">编号</td>
				<td align="center" width="10%">车牌号</td>
				<td align="center" width="10%">品牌</td>
				<td align="center" width="10%">存车用户</td>
				<td align="center" width="10%">存车时间</td>
				<td align="center" width="10%">取车时间</td>
				<td align="center" width="10%">存车天数</td>
				<td align="center" width="10%">状态</td>
				<td align="center" width="10%">应付金额</td>
				<td align="center" width="10%">租车收入</td>
				<td align="center" width="13%">图片</td>
				<td align="center">操作</td>
			</tr>
			
			<!-- 
			
			 -->
			<c:forEach var="tmp" items="${list1}" varStatus="index">
						<tr>
							
							
							<td class="altbg1" align="center">	${index.count }</td>
							<td class="altbg1" align="center">	
							
							${tmp.car_no }
							
							</td>
							<td class="altbg1" align="center">

									${tmp.car_pinpai }

							</td>
							<td class="altbg1" align="center">${tmp.username }</td>
							<td class="altbg1" align="center">	${tmp.cunche_start_date_str}</td>
							<td class="altbg1" align="center">	${tmp.cunche_end_date_str}</td>
							<td class="altbg1" align="center">	${tmp.days}</td>
							<td class="altbg1" align="center">	
							
								<c:if test="${tmp.status == 2 }">
									租车中
								</c:if>
								<c:if test="${tmp.status == 1 }">
									寄存中
								</c:if>
								<c:if test="${tmp.status == 0 }">
									待处理
								</c:if>
								<c:if test="${tmp.status == 3 }">
									已取车
								</c:if>
								<c:if test="${tmp.status == 4 }">
									已结算
								</c:if>
							
							
							</td>
							<td class="altbg1" align="center">	${tmp.money }</td>
							<td class="altbg1" align="center">	${tmp.money2 }</td>
							<td class="altbg1" align="center">
								<img alt="图片下载" src="${pageContext.request.contextPath}/${tmp.image_url }" width="100px" height="100px">
								</img>
							</td>
							<td class="altbg1" align="center">
										
										
									<a target="mainFrame"
										href="${pageContext.request.contextPath}/fox_del1.action?cunche.id=${tmp.id }">删除
									</a>
							
							</td>
						
			
						</tr>
			</c:forEach>
		</tbody>
	</table>

	<a name="bottom" />
</body>
</html>
