<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 

    %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	<body>
	<div style="position: absolute; left: 40%; top: 20%;">
		<h3><b>삭제할 고객정보를 확인 후 버튼을 누르세요!</b></h3>
		<form action="purchaserDelete_04.jsp" method="post" name="formSend">
			<table>
				<tr>
					<td align="right">사용자 ID</td>
					<td> : <input type="text" size="10" value="${USERID }" readonly="readonly"></td>
				</tr>
				<tr>
					<td align="right">성명</td>
					<td> : <input type="text" size="10" value="${USERNAME }" readonly="readonly"></td>
				</tr>
				<tr>
					<td align="right">전화번호</td>
					<td> : <input type="text" size="10" value="${USERPHONE }" readonly="readonly"></td>
				</tr>
				<tr>
					<td align="right">주소</td>
					<td> : <input type="text" size="60" value="${USERADDRESS }" readonly="readonly"></td>
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