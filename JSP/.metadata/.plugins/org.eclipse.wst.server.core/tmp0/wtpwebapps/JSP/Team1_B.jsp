<%@page import="java.net.URLDecoder"%>
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
 			int num1 = Integer.parseInt(request.getParameter("num1"));
			int num2 = Integer.parseInt(request.getParameter("num2"));

		%>
		
		첫번째 수 : <input type="text" value=<%=num1 %> readonly="readonly" size="15"><br>
		두번째 수 : <input type="text" value=<%=num2 %> readonly="readonly" size="15"><br>
		<%=num1 %> + <%=num2 %> = <% out.print(num1 + num2); %><br>


		<form action="http://192.168.150.130:8080/JSP/Team1_C.jsp"  method="get">
			<input type="hidden" name="num1" value=<%=num1%>>
			<input type="hidden" name="num2" value=<%=num2%>>
			
			<input type="submit" value="뺄셈">
		</form> 

<!-- 		<form action="Team1_B_1.jsp>"  method="get">
			<input type="submit" value="뺄셈">
		</form> -->
	</body>
</html>