<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<script type="text/javascript">
		function checkForm() {
			alert("아이디 : " + document.loginForm.id.value + "\n" +
					"비밀번호 : " + document.loginForm.passwd.value)
		}
	</script>
	<body>
		<form action="#" name="loginForm">
			아이디 : <input type="text" name="id"><br>
			비밀번호 : <input type="password" name="passwd"><br>
			<input type="button" value="전송" onclick="checkForm()"><br>
		</form>
	</body>
</html>