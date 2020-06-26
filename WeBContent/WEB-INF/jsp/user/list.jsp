<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitonal//EN">
<html>
	<head>
		<title>OA 用户列表</title>
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
						<td width="100px">登录名</td>
						<td width="100px">姓名</td>
						<td width="100px">所属部门</td>
						<td width="200px">岗位</td>
						<td>相关操作</td>
					</tr>
				</thead>
				<tbody id="TableData" class="dataContainer" datakey="roleList">
					<s:iterator value="list">
					<tr class="TableDetail template">
						<td>${user.loginName}&nbsp;</td>
						<td>${user.name}&nbsp;</td>
						<td>${user.department.name}&nbsp;</td>
						<td>
							<s:iterator value="roles">${name}&nbsp;</s:iterator>
						</td>
						<td>${user.description}&nbsp;</td>
						<td><s:a onClick="return window.confirm('确定删除此项？')" action="user_delete?id=%{id}" namespacr="/">删除</s:a>
							<s:a action="user_editUI?id=%{id}" namespace="/">修改</s:a>
							<s:a onClick="return window.confirm('确定初始化%{name}的密码吗？')" action="user_initPW" namespace="/">初始化密码</s:a>
						</td>
					</tr>
					</s:iterator>
				</tbody>
			</table>
			<div id="TableTail">
				<div id="TableTail_inside">
					<s:a action="user_addUI"><img src="${pageContext.request.contextPath}/style/images/createNew.png"/></s:a>
				</div>
			</div>
		</div>
	</body>
</html>