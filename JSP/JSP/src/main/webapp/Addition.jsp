<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Addition</title>
	</head>
	<body>
		<%
			int a = 30;
			int b = 20;
			int addition = a + b;
			int subtraction = a - b;
			int multiplication = a * b;
			int division = a / b;
			int remainder = a % b;
		%>		
		<%=a %> + <%=b %> = <%=addition %> <br>
		<% 
			out.println(a + " + " + b + " = " + addition + "<br>");
			out.println(a + " - " + b + " = " + subtraction + "<br>");
			out.println(a + " * " + b + " = " + multiplication + "<br>");
			out.println(a + " / " + b + " = " + division + "<br>");
			out.println(a + " % " + b + " = " + remainder + "<br>");
		%>

		
		<%
			int i = 0;
			while(true) {
				i++;
				out.println("2 X " + i + " = " + (2*i));
		%>
				<br>
				====================<br>
		<%
				if (i >= 9) {
					break;
				}
			}
		
		%>

		
		
	</body>
</html>