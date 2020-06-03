<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitonal//EN">
<html>
	<head>
		<title>OA 岗位列表</title>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
		<script language="javascript" src="${pageContext.request.contextPath}/script/jquery.js" charset="utf-8"></script>
		<script language="javascript" src="${pageContext.request.contextPath}/script/pageCommon.js" charset="utf-8"></script>
		<script language="javascript" src="${pageContext.request.contextPath}/script/PageUtils.js" charset="utf-8"></script>
		<script language="javascript" src="${pageContext.request.contextPath}/script/DataShowManager.js" charset="utf-8"></script>
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/blue/pageCommon.css"/>
		<script type="text/javascript">
		</script>
	</head>
	<body>
		<div id="Title_bar">
			<div id="Title_bar_Head">
				<div id="Title_Head"></div>
				<div id="Title">
					<img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/>
				</div>
				<div id="Title_End"></div>
			</div>
		</div>
		<div id="MainArea">
			<table cellspacing="0" cellpadding="0" class="TableStyle">
				<thead>
					<tr align="CENTER" valign="MIDDLE" id="TableTitle">
						<td width="200px">岗位名称</td>
						<td width="300px">岗位说明</td>
						<td>相关操作</td>
					</tr>
				</thead>
				<tbody id="TableData" class="dataContainer" datakey="rolelist">
					<s:iterator value="list">
					<tr class="TableDetail template">
						<td>${role.name}&nbsp;</td>
						<td>${role.description}&nbsp;</td>
						<td><s:a onClick="return window.confirm('确定删除此项？')" action="role_delete?id=%{id}" namespacr="/">删除</s:a>
							<s:a action="role_editUI?id=%{id}" namespacr="/">修改</s:a>
							<s:a href="setPrivilegeUI.html">设置权限</s:a>
						</td>
					</tr>
					</s:iterator>
				</tbody>
			</table>
			<div id="TableTaile">
				<div id="TableTail_inside">
					<a href="saveUI.html"><img src="${pageContext.request.contextPath}/style/images/createNew.png"/></a>
				</div>
			</div>
		</div>
	</body>
</html>