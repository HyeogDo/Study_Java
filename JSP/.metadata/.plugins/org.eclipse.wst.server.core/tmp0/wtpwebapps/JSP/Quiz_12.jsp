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
		<form action="Quiz_12_data.jsp">
			수량 : <input type="text" name="quantity"><br><br>
			크기 : 
			대<input type="radio" name="size" value="large" checked="checked"> 
			중<input type="radio" name="size" value="medium"> 
			소<input type="radio" name="size" value="small"><br><br>
			색상 :
			<select name="color">
				<option value="beige">베이지</option>
				<option value="brown">브라운</option>
				<option value="khaki">카키</option>
				
			</select>
			<br><br>
			<input type="submit" value="저장">
		</form>

		</div>
	
	</body>
</html>