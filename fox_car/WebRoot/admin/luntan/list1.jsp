<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 


<html>
<head>
<title>��������</title>

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
	private int status;//0 ������1�Ĵ��� ��2�⳵��  3 ��ȡ��
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
				<td  class="altbg1" align="center" width="5%"><font color="red" size="3" style="font-weight:bold;font-style:italic;">ͳ��(���)</font></td>
				<td class="altbg1" align="center" colspan="5"><font color="red" size="3" style="font-weight:bold;font-style:italic;">�泵��(-)�ϼ�:${money1_1 }Ԫ</font></td>
				<td class="altbg1" align="center" colspan="5"><font color="red" size="3" style="font-weight:bold;font-style:italic;">�⳵����(+)�ϼ�:${money1_2 }Ԫ</font></td>
			</tr>
		<tr>

				<td  class="altbg1" align="center" width="5%"><font color="blue" size="3" style="font-weight:bold;font-style:italic;">ͳ��(����)</font></td>
				<td class="altbg1"  align="center" colspan="2"><font color="blue" size="3" style="font-weight:bold;font-style:italic;">�⳵��:${fn:length(list1_2)}</font></td>
				<td class="altbg1" align="center" colspan="2"><font color="blue" size="3" style="font-weight:bold;font-style:italic;">�Ĵ���:${fn:length(list1_1)}</font></td>
				<td class="altbg1" align="center" colspan="2"><font color="blue" size="3" style="font-weight:bold;font-style:italic;">������:${fn:length(list1_0)}</font></td>
				<td class="altbg1" align="center" colspan="2"><font color="blue" size="3" style="font-weight:bold;font-style:italic;">��ȡ��:${fn:length(list1_3)}</font></td>
				<td class="altbg1" align="center" colspan="2"><font color="blue" size="3" style="font-weight:bold;font-style:italic;">�ѽ���:${fn:length(list1_4)}</font></td>
			</tr>
		
		
			<tr class="header">

				<td align="center" width="5%">���</td>
				<td align="center" width="10%">���ƺ�</td>
				<td align="center" width="10%">Ʒ��</td>
				<td align="center" width="10%">�泵�û�</td>
				<td align="center" width="10%">�泵ʱ��</td>
				<td align="center" width="10%">ȡ��ʱ��</td>
				<td align="center" width="10%">�泵����</td>
				<td align="center" width="10%">״̬</td>
				<td align="center" width="10%">Ӧ�����</td>
				<td align="center" width="10%">�⳵����</td>
				<td align="center" width="13%">ͼƬ</td>
				<td align="center">����</td>
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
									�⳵��
								</c:if>
								<c:if test="${tmp.status == 1 }">
									�Ĵ���
								</c:if>
								<c:if test="${tmp.status == 0 }">
									������
								</c:if>
								<c:if test="${tmp.status == 3 }">
									��ȡ��
								</c:if>
								<c:if test="${tmp.status == 4 }">
									�ѽ���
								</c:if>
							
							
							</td>
							<td class="altbg1" align="center">	${tmp.money }</td>
							<td class="altbg1" align="center">	${tmp.money2 }</td>
							<td class="altbg1" align="center">
								<img alt="ͼƬ����" src="${pageContext.request.contextPath}/${tmp.image_url }" width="100px" height="100px">
								</img>
							</td>
							<td class="altbg1" align="center">
										
										
									<a target="mainFrame"
										href="${pageContext.request.contextPath}/fox_del1.action?cunche.id=${tmp.id }">ɾ��
									</a>
							
							</td>
						
			
						</tr>
			</c:forEach>
		</tbody>
	</table>

	<a name="bottom" />
</body>
</html>
