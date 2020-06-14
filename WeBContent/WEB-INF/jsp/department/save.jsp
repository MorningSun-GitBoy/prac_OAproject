<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitonal//EN">
<html>
	<head>
		<title>OA 部门设置</title>
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
			<s:form action="depar_%{id==null?'add':'edit'}" namespace="/" method="post">
				<s:hidden name="id"></s:hidden>
				<div class="ItemBlock_Title1">
					<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="${pageContext.request.contextPath}/style/blue/images/item_point.gif"/>
				</div>
				<div class="ItemBlockBorder">
					<div class="ItemBlock">
						<table cellpadding="0" cellspacing="0" class="mainForm">
							<tr>
								<td width="100">上级部门</td>
								<td>
									<s:select list="deparList" listkey="id" listvalue="name" headkey="0" headvalue="请选择部门" name="parentId" cssClass="SelectStyle"></s:select>
								</td>
							</tr>
							<tr>
								<td>部门名称</td>
								<td><s:textarea name="name" cssClass="InputStyle" ></s:textarea>*</td>
							</tr>
							<tr>
								<td>职能说明</td>
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
		<div class="Description">
			说明：<br/>
			1.上级部门的列表是有层次结构的（树形）。<br/>
			2.如果修改：上级部门列表中不能显示当前修改的子孙部门。<br/>
			<!-- 因为不能让自己或子部门作为上级部门 -->
		</div>
	</body>
</html>