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
		개인 정보를 입력하세요
		<br>
		<br>
		<form action="userInsert_02.jsp">
		<table>
			<tr>
				<td>아이디</td>
				<td> : <input type="text" name="userId"></td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td> : <input type="password" name="userPwd"></td>
			</tr>
			<tr>
				<td>이름</td>
				<td> : <input type="text" name="userName"></td>
			</tr>
		</table>
		<br>
		<br>
		<input type="submit" value="확인">
		</form>
		</div>
	</body>
</html>