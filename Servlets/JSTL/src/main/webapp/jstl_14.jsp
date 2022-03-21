<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="date" value="<%=new Date() %>"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>세계 시간</title>
	</head>
	<body>
		서울 : <fmt:formatDate value="${date }" type="both"/><br>
		<fmt:timeZone value="Europe/London">
			런던 : <fmt:formatDate value="${date }" type="both"/><br>
		</fmt:timeZone>
		<fmt:timeZone value="America/New_York">
			뉴욕 : <fmt:formatDate value="${date }" type="both"/><br>
		</fmt:timeZone>
	</body>
</html>