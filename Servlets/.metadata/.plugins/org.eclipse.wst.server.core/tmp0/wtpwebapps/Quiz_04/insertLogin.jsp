<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<script type="text/javascript">
		function loginCheck() {
			var f = document.formLogin
			var regExpId = /^[a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/
			var regExpPhone = /^\d{3}-\d{3,4}-\d{4}$/
			var regExpName = /^[가-힣]*$/
			
			var id = f.userId.value
			if (id == ""){
				alert("아이디를 입력해 주세요")
				f.userId.select();
				return
			} else if (!regExpId.test(id)){
				alert("아이디는 문자로 시작해 주세요")
				f.userId.select();
				return
			}
			
			var name = f.userName.value
			if (name == ""){
				alert("이름을 입력해 주세요")
				f.userName.select();
				return
			}else if (!regExpName.test(name)){
				alert("이름은 한글만 입력해주세요")
				f.userName.select();
				return
			}
			
			var phone = f.phone1.value + "-" + f.phone2.value + "-" + f.phone3.value
			if (!regExpPhone.test(phone)){
				alert("연락처 입력을 확인해 주세요")
				f.phone2.select();
				return
			}
			
			var address = f.userAddress.value
			if (address == ""){
				alert("주소를 입력해 주세요")
				f.userAddress.select();
				return
			}
			f.submit()

		}
	</script>
	<body>
	<div style="position: absolute; left: 40%; top: 20%;">
		<h3><b>아래의 항목을 입력 후 확인 버튼을 누르세요!</b></h3>
		<form action="todbLogin.jsp" method="post" name="formLogin">
			<table>
				<tr>
					<td align="right">사용자 ID</td>
					<td> : <input type="text" name="userId" size="10"></td>
				</tr>
				<tr>
					<td align="right">성명</td>
					<td> : <input type="text" name="userName" size="10"></td>
				</tr>
				<tr>
					<td align="right">전화번호</td>
					<td> : <select name="phone1">
								<option value="010">010</option>
								<option value="011">011</option>
								<option value="016">016</option>
								<option value="017">017</option>
								<option value="018">018</option>
								<option value="019">019</option>
							</select>
							- <input type="text" maxlength="4" size="4" name="phone2">
							- <input type="text" maxlength="4" size="4" name="phone3">
					</td>
				</tr>
				<tr>
					<td align="right">주소</td>
					<td> : <input type="text" name="userAddress" size="60"></td>
				</tr>
			</table>
			<br>
			<br>
			<br>
			&emsp;&emsp;&emsp;&emsp;&emsp;
			<input type="button" value="확인" onclick="loginCheck()">
		</form>
		</div>
	</body>
</html>