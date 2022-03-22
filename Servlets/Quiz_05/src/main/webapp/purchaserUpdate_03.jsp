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
		<h3><b>수정 후 확인 버튼을 누르세요!</b></h3>

		<form action="purchaserUpdate_04.jsp" method="post">
			<table>
				<tr>
					<td align="right">사용자 ID</td>
					<td> : <input type="text" name="userId" size="10" value="${USERID }" readonly="readonly"></td>
				</tr>
				<tr>
					<td align="right">성명</td>
					<td> : <input type="text" name="userName" size="10" value="${USERNAME }"></td>
				</tr>
				<tr>
					<td align="right">전화번호</td>
					<td> : <input type="text" name="userPhone" size="10" value="${USERPHONE }"></td>
				</tr>
				<tr>
					<td align="right">주소</td>
					<td> : <input type="text" name="userAddress" size="60" value="${USERADDRESS }"></td>
				</tr>
			</table>
			<br>
			<br>
			<br>
			&emsp;&emsp;&emsp;&emsp;&emsp;
			<input type="submit" value="확인">
		</form>
		</div>
	</body>
</html>