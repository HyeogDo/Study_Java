<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>

		수량 : <%=request.getAttribute("quantity") %><br>
		크기 : <%=request.getAttribute("size") %><br>
		색상 : <%=request.getAttribute("color") %><br>
	</body>
</html>