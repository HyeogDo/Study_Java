<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>인사하기</title>
	</head>
	<body>
		<c:choose>
			<c:when test="${param.num1 == 0 }">
				처음 뵙겠습니다.
			</c:when>
			<c:when test="${param.num1 == 1 }">
				반갑습니다.
			</c:when>
			<c:when test="${param.num2 == 2 }">
				안녕하세요.
			</c:when>
			<c:otherwise>
				default 값입니다.
			</c:otherwise>
		</c:choose>
	
		
	</body>
</html>