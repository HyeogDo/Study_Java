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
			<table>
				<tr>
					<td align="right">사용자 ID</td>
					<td> : ${USERID }</td>
				</tr>
				<tr>
					<td align="right">성명</td>
					<td> : ${USERNAME }</td>
				</tr>
				<tr>
					<td align="right">전화번호</td>
					<td> : ${USERPHONE }</td>
				</tr>
				<tr>
					<td align="right">주소</td>
					<td> : ${USERADDRESS }</td>
				</tr>
			</table>
			<br>
			<br>
			상기 정보로 입력되었습니다. 감사합니다.
		</div>
		<% session.invalidate(); %>
</body>
</html>