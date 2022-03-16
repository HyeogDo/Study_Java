<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Function</title>
	</head>
	<body>
		<%!
			public int sum(int a, int b) {
				return a+b;
			}
		%>
		<%
			for (int i = 2; i <= 5; i++ ) {
				out.print(i + " + 1 = " + sum(i, 1) + "<br>");
			}
		%>
	</body>
</html>