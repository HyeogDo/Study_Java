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
		<b>회원 가입 결과</b><br>
		<br>
		가입 되었습니다.<br>
		<br>
		<b>가입 내용</b>
		<br>
		<br>
		<table>
			<tr>
				<td>아이디</td>
				<td> : <%=session.getAttribute("USERID") %></td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td> : <%=session.getAttribute("USERPWD") %></td>
			</tr>
			<tr>
				<td>성명</td>
				<td> : <%=session.getAttribute("USERNAME") %></td>
			</tr>
		</table>

		<% session.invalidate(); %>
		</div>
	</body>
</html>