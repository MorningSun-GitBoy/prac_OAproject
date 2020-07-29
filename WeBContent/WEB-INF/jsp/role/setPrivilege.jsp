<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 5.01 Transitonal//EN">
<html>
	<head>
		<%@include file="/WEB-INF/jsp/public/header.jsp"%>
		<title>OA 权限设置</title>
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
			<form action="role_privilege" namespace="/" method="post">
				<s:hidden name="id"></s:hidden>
				<div class="ItemBlock_Title1"><div class="ItemBlock_Title1">
					<img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.png" />正在为【${name}】配置权限</div>
				</div>
				<div class="ItemBlockBorder">
					<div class="ItemBlock">
						<table cellpadding="0" cellspacing="0" class="mainForm">
							<thead>
								<tr align="LEFT" valign="MIDDLE" id="Table_Title">
									<td width="300px" style="padding-left:7px">
										<input type="CHECKBOX" id="cbSelectAll" onClick="selectAll(this.checked)"/>
										<label for="cbSelectAll">全选</label>
									</td>
								</tr>
							</thead>
							<tbody id="TableData">
								<tr class="TableDetail">
									<td><s:checkboxlist name="priviIds" list="priviList" listKey="id" listValue="name"></s:checkboxlist></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<div id="InputDetailBar">
					<input type="image" src="${pageContext.request.contextPath}/style/images/save.png"/>
					<a href="javascript:history.go(-1)"><img src="${pageContext.request.contextPath}/style/images/goBack.png" alt=""></a>
				</div>
			</form>
		</div>
		<div class="Description">
			说明：<br/>
			1.选中一个权限时：<br/>
			&nbsp;a.应该选中，他的所有直系上级<bt/>
			&nbsp;b.应该选中，他的所有直系下级<bt/>
			2.取消选择一个权限时：<br/>
			&nbsp;a.应该取消选择，他的所有直系下级<bt/>
			&nbsp;b.如果同级的权限都是未选择的状态，就应该取消选择他的上级，并递归向上这个操作<bt/>
			3.全选/取消全选<br/>
			4.默认选择当前岗位以有的权限<br/>
		</div>
	</body>
</html>