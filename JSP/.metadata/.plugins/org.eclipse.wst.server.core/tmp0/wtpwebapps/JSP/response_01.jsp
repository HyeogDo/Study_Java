<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>사이트명 입력</title>
	</head>
	<body>
		<div style="text-align: center; margin-top: 10%;">
		이동하고자 하는 사이트 명을 입력하고 확인 버튼을 누르세요.
		<br>
		<br>
		<form action="response_02.jsp" method="post">
			사이트명 : <input type="text" name="siteName"> 
					<input type="submit" value="확인">
					(ex: naver, daum, google, 네이버, 다음, 구글)
		</form>
		</div>
	</body>
</html>