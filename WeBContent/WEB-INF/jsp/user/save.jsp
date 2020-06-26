<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitonal//EN">
<html>
	<head>
		<title>OA 用户信息</title>
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
			<s:form action="user_%{id==null?'add':'edit'}" namespace="/" method="post">
				<s:hidden name="id"></s:hidden>
				<div class="ItemBlock_Title1">
					<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="${pageContext.request.contextPath}/style/blue/images/item_point.gif"/>
				</div>
				<div class="ItemBlockBorder">
					<div class="ItemBlock">
						<table cellpadding="0" cellspacing="0" class="mainForm">
							<tr>
								<td width="100">所属部门</td>
								<td>
									<s:select list="treeList" name="deparId" listKey="id" listValue="name" headKey="" headValue="请选择部门" cssClass="SelectStyle"></s:select>
								</td>
							</tr>
							<tr><td>登录名</td>
								<td><s:textfield name="loginName" cssClass="InputStyle"></s:textfield>*(登录名要唯一)</td>
							</tr>
							<tr><td>姓名</td>
								<td><s:textfield name="name" cssClass="InputStyle"></s:textfield>*</td>
							</tr>
							<tr><td>性别</td>
								<td><s:radio name="gender" list="#{'1':'男','0':'女'}"></s:radio>*</td>
							</tr>
							<tr><td>联系电话</td>
								<td><s:textfield name="phoneNumber" cssClass="InputStyle"></s:textfield></td>
							</tr>
							<tr><td>e-mail</td>
								<td><s:textfield name="email" cssClass="InputStyle"></s:textfield></td>
							</tr>
							<tr><td>备注</td>
								<td><s:textarea name="description" cssClass="TextareaStyle" ></s:textarea></td>
							</tr>
						</table>
					</div>
				</div>
				<div class="ItemBlockBorder">
					<div class="ItemBlock">
						<table cellpadding="0" cellspacing="0" class="mainForm">
							<tr>
								<td width="100px">岗位</td>
								<td>按住Ctrl可以多选或取消选择</td>
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