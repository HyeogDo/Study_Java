<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
<%	
	request.setCharacterEncoding("UTF-8");
	String userId = request.getParameter("userId");
	String userPwd = request.getParameter("userPwd");
	String userName = request.getParameter("userName");
	
	session.setAttribute("USERID", userId);
	session.setAttribute("USERPWD", userPwd);
	session.setAttribute("USERNAME", userName);
%>
		<div style="position: absolute; left: 40%; top: 20%;">
		<h1><b>약관</b></h1><br>
		
		----------------------------------------------<br>
		1. 회원 정보는 웹사이트의 운영을 위해서만 사용 됩니다.<br>
		2. 웹사이트의 정상 운영을 방해하는 회원은 탈퇴 처리 합니다.<br>
		----------------------------------------------<br>
		위의 약관에 동의 하십니까?<br>
		<br>
		<form action="userInsert_03.jsp">
			<input type="radio" name="agreement" value="agree" checked="checked"> 동의 함 
			<input type="radio" name="agreement" value="disagree"> 동의 하지 않음 <br>
			<br>
			<input type="submit" value="확인">
		</form>
		</div>
	</body>
</html>