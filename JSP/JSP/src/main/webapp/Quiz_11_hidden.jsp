<%@page import="java.net.URLEncoder"%>
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
			int age = Integer.parseInt(request.getParameter("age"));
			String ageRes = "null";
			String possible = "null";
			
/* 			if ( age >= 19 ) {
				response.sendRedirect("http://localhost:8080/JSP/Quiz_11_adult.jsp?age=" + age);
			} else {
				response.sendRedirect("http://localhost:8080/JSP/Quiz_11_child.jsp?age=" + age);
			} */
			if ( age >= 19 ) {
				ageRes = "성인";
				possible = "가능";
			} else {
				ageRes = "미성년자";
				possible = "불가능";
			}
			ageRes = URLEncoder.encode(ageRes, "UTF-8");
			possible = URLEncoder.encode(possible, "UTF-8");
			response.sendRedirect("http://localhost:8080/JSP/Quiz_11_whole.jsp?age=" + age + "&ageRes=" + ageRes + "&possible=" + possible);
		%>
	
	</body>
</html>