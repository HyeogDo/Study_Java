<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="Quiz_07_result.jsp" method="get">
			<table>
				<tr>
					<td colspan="2">숫자를 입력해주세요</td>
				</tr>
				<tr>
					<td>N1 : </td>
					<td><input type="text" name="num1" ></td>
				</tr>
				<tr>
					<td>N2 : </td>
					<td><input type="text" name="num2" ></td>
				</tr>
				<tr>
					<td colspan="2">행동을 선택해주세요</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="radio" name="calculator" value="addition" checked="checked" >Addition<br>
						<input type="radio" name="calculator" value="subtraction" >subtraction<br>
						<input type="radio" name="calculator" value="multiplication" >multiplication<br>
						<input type="radio" name="calculator" value="division" >division<br>
					</td>
				</tr>
				<tr>
					<td><input type="submit" value="계산"></td>
					<td align="center"><input type="reset" value="다시입력"></td>
				</tr>
				
							
			</table>
		</form>
	</body>
</html>