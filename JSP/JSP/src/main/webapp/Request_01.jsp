<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>이름 입력</title>
	</head>
	<body>
		<p>이름을 입력하고 확인 버튼을 누르세요</p>
		<form action="Request_02.jsp" method="post">
			<p>이름 : <input name="userName" type="text" maxlength="10" > <input type="submit" value="확인"></p>
		</form>
	</body>
</html>