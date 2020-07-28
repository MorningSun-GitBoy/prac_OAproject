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
			<form action="list.html">
				<div class="ItemBlock_Title1"><div class="ItemBlock_Title1">
					<img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.png" />正在为【${name}】配置权限</div>
				</div>
				<div class="ItemBlockBorder">
					<div class="ItemBlock">
					</div>
				</div>
			</form>
		</div>
	</body>
</html>