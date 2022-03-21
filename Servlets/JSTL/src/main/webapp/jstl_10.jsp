<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>오늘의 식단 메뉴</title>
	</head>
	<body>
		<h3>점심 메뉴표</h3>
		<ul>
			<c:forEach var="dish" items="${MENU }">
				<li>${dish }</li>
			</c:forEach>
		</ul>
	</body>
</html>