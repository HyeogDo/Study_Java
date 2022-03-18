<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="student" class="com.javalec.base.Student" scope="session"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
			이름 : <jsp:getProperty property="name" name="student"/><br>
			나이 : <jsp:getProperty property="age" name="student"/><br>
			학년 : <jsp:getProperty property="grade" name="student"/><br>
			번호 : <jsp:getProperty property="studentNum" name="student"/><br>
			
			<%session.invalidate(); %>
			
	</body>
</html>