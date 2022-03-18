<%@page import="java.util.GregorianCalendar"%>
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
	GregorianCalendar now = new GregorianCalendar();
	String date = String.format("%TY년 %Tm월 %Td일", now, now, now);
	String time = String.format("%Tp, %TR", now, now);
	
%>
	[현재 시각] <%=date %> <%=time %>
	</body>
</html>