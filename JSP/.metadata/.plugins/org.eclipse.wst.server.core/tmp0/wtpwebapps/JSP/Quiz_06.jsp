<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="Quiz_06_sum.jsp" method="post">
		<table >
			<tr>
				<td colspan="2" align="center"><p>숫자를 입력하세요</p></td>
			</tr>
			<tr>
				<td>N1 : </td>
				<td><input type="text" name="number1"></td>
			</tr>
			<tr>
				<td>N2 : </td>
				<td><input type="text" name="number2"></td>
			</tr>
			<tr>
				<td></td>
				<td align="right"><input type="submit" value="더하기" style="height: 10px; width: 20px;"></td>
				
			</tr>
			
		</table>
		</form>

	</body>
</html>