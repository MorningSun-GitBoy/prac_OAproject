<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitonal//EN">
<html>
	<head>
		<title>OA 用户设置</title>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
		<script language="javascript" src="${pageContext.request.contextPath}/script/jquery.js" charset="utf-8"></script>
		<script language="javascript" src="${pageContext.request.contextPath}/script/pageCommon.js" charset="utf-8"></script>
		<script language="javascript" src="${pageContext.request.contextPath}/script/PageUtils.js" charset="utf-8"></script>
		<script language="javascript" src="${pageContext.request.contextPath}/script/DataShowManager.js" charset="utf-8"></script>
		<link type="text/css" rel="stylesheet" href="../style/blue/pageCommon.css"/>
		<script type="text/javascript">
		</script>
	</head>
	<body>
		<div id="Title_bar">
			<div id="Title_bar_Head">
				<div id="Title_Head"></div>
				<div id="Title">
					<img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.png" />
				</div>
				<div id="Title_End"></div>
			</div>
		</div>
		<div id="MainArea">
			<s:form action="role_edit" namespace="/" method="post">
				<s:hidden name="id"></s:hidden>
				<div class="ItemBlock_Title1">
					<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="${pageContext.request.contextPath}/style/blue/images/item_point.gif"/>
				</div>
				<div class="ItemBlockBorder">
					<div class="ItemBlock">
						<table cellpadding="0" cellspacing="0" class="mainForm">
							<tr>
								<td width="100">岗位名称</td>
								<td><s:textfield name="name" cssClass="InputStyle"></s:textfield>*</td>
							</tr>
							<tr>
								<td>岗位说明</td>
								<td><s:textarea name="description" cssClass="TextareaStyle" ></s:textarea></td>
							</tr>
						</table>
					</div>
				</div>
				<div id="InputDetailBar">
					<input type="image" src="${pageContext.request.contextPath}/style/images/save.png"/>
					<a href="javascript:history.go(-1)"><img src="${pageContext.request.contextPath}/style/images/goBack.png" alt=""></a>
				</div>
			</s:form>
		</div>
	</body>
</html>