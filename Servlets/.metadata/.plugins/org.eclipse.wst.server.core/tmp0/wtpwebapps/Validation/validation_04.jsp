<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<script type="text/javascript">
		function checkLogin() {
			var form = document.loginForm
			for(i=0; i<form.id.value.length;i++){
				var ch = form.id.value.charAt(i);
				var ch2 = form.passwd.value.charAt(i);
				if((ch < 'a' || ch > 'z') && (ch > 'A' || ch < 'Z') && (ch > '0' || ch < '9')) {
					alert("아이디는 영문 소문자만 입력 가능 합니다.")
					form.id.select()
					return
				}else if ( ch2 < '0' || ch2 > '9') {
					alert("숫자만 입력 가능합니다")
					form.passwd.select()
					return
				}
				form.submit()
			}
		}
	</script>
	<body>
		<form name="loginForm" action="validation_02p.jsp" method="post">
			아이디 : <input type="text" name="id"><br>
			비밀번호 : <input type="password" name="passwd"> <br>
			<input type="button" value="ok" onclick="checkLogin()">
		</form>
	</body>
</html>