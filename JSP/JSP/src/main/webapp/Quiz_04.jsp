<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%!
			public int power(int a, int b) {
				return a * b;
			}
		%>
		
		<%
			int res = 1;
			for (int i = 1; i <= 5; i++ ) {
				res = power(res,2);
				out.print(2 + " ^ " + i + " = " + res + "<br>");
			}
		%>
		
		<%
			int res2 = 1;
		%>
		2 ^ 1 = <%=res2 = power(res2,2) %><br>
		2 ^ 2 = <%=res2 = power(res2,2) %><br>
		2 ^ 3 = <%=res2 = power(res2,2) %><br>
		2 ^ 4 = <%=res2 = power(res2,2) %><br>
		2 ^ 5 = <%=res2 = power(res2,2) %><br>

	</body>
</html>