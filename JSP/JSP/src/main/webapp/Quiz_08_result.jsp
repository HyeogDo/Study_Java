<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
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
			int num1, num2;
			String calculator;
			
			num1 = Integer.parseInt(request.getParameter("num1"));
			num2 = Integer.parseInt(request.getParameter("num2"));
			calculator = request.getParameter("calculator");
		%>
		
		<p>계산 결과값입니다.</p>
		
		<%
			switch(calculator) {
			case "addition":
				out.print("덧셈 : " + (num1 + num2));
				break;
			case "subtraction":
				out.print("뺄셈 : " + (num1 - num2));
				break;
			case "multiplication":
				out.print("곱셈 : " + (num1 * num2));
				break;
			case "division":
 				try {
					out.print("나눗셈 : " + ((double) num1 / num2));
				} catch(Exception e) {
					out.print("0으로 나눌수는 없습니다.");
				}

				break;
			default:
				break;
					
			}
				
		%>
	</body>
</html>