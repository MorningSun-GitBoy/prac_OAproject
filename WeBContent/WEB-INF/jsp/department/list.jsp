<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitonal//EN">
<html>
	<head>
		<title>OA 部门管理</title>
		<%@include file="/WEB-INF/jsp/public/header.jsp"%>
	</head>
	<body>
		<div id="Title_bar">
			<div id="Title_bar_Head">
				<div id="Title_Head"></div>
				<div id="Title">
					<img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.png"/>
				</div>
				<div id="Title_End"></div>
			</div>
		</div>
		<div id="MainArea">
			<table cellspacing="0" cellpadding="0" class="TableStyle">
				<thead>
					<tr align="CENTER" valign="MIDDLE" id="TableTitle">
						<td width="150px">部门名称</td>
						<td width="150px">上级部门</td>
						<td width="200px">职能说明</td>
						<td>相关操作</td>
					</tr>
				</thead>
				<tbody id="TableData" class="dataContainer" datakey="departmentList">
					<s:iterator value="list">
					<tr class="TableDetail template">
						<td>${department.name}&nbsp;</td>
						<td>${department.parent.name}&nbsp;</td>
						<td>${department.description}&nbsp;</td>
						<td><s:a onClick="return window.confirm('这将删除所有下级部门，确定删除此项？')" action="depar_delete?id=%{id}" namespacr="/">删除</s:a>
							<s:a action="depar_editUI?id=%{id}" namespace="/">修改</s:a>
						</td>
					</tr>
					</s:iterator>
				</tbody>
			</table>
			<div id="TableTail">
				<div id="TableTail_inside">
					<s:a action="depar_addUI" namespace="/"><img src="${pageContext.request.contextPath}/style/images/creatNew.png"></s:a>
				</div>
			</div>
			<div id="Description">
				说明：<br/>
				1.列表页面只显示同一层的（同级的）部门数据，默认显示最顶级的部门列表。<br/>
				2.点击部门名称，可以查看部门相应的下级部门列表。<br/>
				3.删除部门时，同时删除此部门的所有下级部门<br/>
				<!-- 正常情况下会引入判断 -->
			</div>
	</body>
</html>