<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
 			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));
			response.sendRedirect("http://192.168.150.130:8080/JSP/Team1_C.jsp?num1=" + num1 + "&num2=" + num2);

		%>

</body>
</html>