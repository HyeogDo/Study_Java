<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>반갑습니다.</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("UTF-8");
		%>
		<p>안녕하세요</p>
		<%=request.getParameter("userName") %>님!!
		
	</body>
</html>