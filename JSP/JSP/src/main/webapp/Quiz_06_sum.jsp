<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%int sumResult = Integer.parseInt(request.getParameter("number2")) + Integer.parseInt(request.getParameter("number1"));  %>
		<table>
			<tr>
				<td>두 수 의 합은 </td>
				<td>		
					<form action="#" method="post">
						<input type="text" value="<%=sumResult%>" readonly="readonly" size="5">입니다.
					</form>
				</td>
			</tr>
		</table>
	</body>
</html>