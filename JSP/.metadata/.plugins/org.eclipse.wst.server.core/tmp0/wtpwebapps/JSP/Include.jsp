<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Include Page</h1>
		<%@include file = "Include_01.jsp"%>
		<h1>다시 Include Page</h1>
		<%=i %>
		<%=hello()%>
	</body>
</html>