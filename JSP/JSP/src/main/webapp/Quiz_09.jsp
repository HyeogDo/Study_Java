<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="Quiz_09_result.jsp" method="post">
			<table>
				<tr>
					<td colspan="2">숫자를 입력해주세요</td>
				</tr>
				<tr>
					<td>N1 : </td>
					<td>
						<select name="num1">
							<%@include file="./Quiz_09_for.jsp"%>
						</select>
					</td>
				</tr>
				<tr>
					<td>N2 : </td>
					<td>						
						<select name="num2">
							<%@include file="./Quiz_09_for.jsp"%>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="2">행동을 선택해주세요</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="checkbox" name="calculator" value="addition" checked="checked" >Addition<br>
						<input type="checkbox" name="calculator" value="subtraction" >subtraction<br>
						<input type="checkbox" name="calculator" value="multiplication" >multiplication<br>
						<input type="checkbox" name="calculator" value="division" >division<br>
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