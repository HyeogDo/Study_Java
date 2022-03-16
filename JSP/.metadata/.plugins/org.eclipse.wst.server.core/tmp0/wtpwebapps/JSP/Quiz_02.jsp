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
			int sum = 0;
			int i = 0;
			while (true) {
				i++;
				sum += i;
				out.print(i);
				if ( i < 100 ) {
		%>
				 + 
		<%
				} else if (i == 100) {
					out.print(" = " + sum);
					break;
				}
			}
		%>
		
		<br>
		<%
			int sum2 = 0;
			int i2 = 0;
			while (i2 < 100) {
				i2++;
				sum2 += i2;
			}
		%>
		1 + 2 + 3 + ..... + 99 + 100 = <% out.print(sum2); %>
	
	</body>
</html>