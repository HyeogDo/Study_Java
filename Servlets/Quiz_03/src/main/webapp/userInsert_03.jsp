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
	String agree = request.getParameter("agreement");

	if (agree.equals("agree")) {
		response.sendRedirect("userInsert_04.jsp");
	} else if (agree.equals("disagree")) {
		session.invalidate();
		response.sendRedirect("userInsert_01.jsp");
	}
%>
	</body>
</html>