<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div style="position: absolute; left: 40%; top: 20%;">
			<h1><b>미성년자</b></h1>
			<br>
			당신의 나이는 <%=request.getParameter("age") %>살 이므로 주류 구매가 불가능합니다.
			<br>
			<a href="http://localhost:8080/JSP/Quiz_11.jsp">처음으로 돌아가기</a>
		</div>
	</body>
</html>