<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div style="position: absolute; top: 20%; left: 40%;"  >
		<form action="Quiz_10_result.jsp" method="post" >
			<table >
				<tr>
					<td align="center" colspan="2"><b>BMI 계산기</b></td>
				</tr>				
				<tr>
					<td>키 : </td>
					<td><input type="text" name="height" maxlength="5"> cm</td>
				</tr>
				<tr>
					<td>몸무게 : </td>
					<td><input type="text" name="weight" maxlength="5"> kg</td>
				</tr>
				<tr align="center">
					<td></td>
					<td><input type="submit" value="계산">	<input type="reset" value="재입력"></td>
				</tr>
			</table>
		</form>
		</div>
	</body>
</html>