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
				int quantity = Integer.parseInt(request.getParameter("quantity"));
				String size = request.getParameter("size");
				String color = request.getParameter("color");
				
				request.setAttribute("size", size);
				request.setAttribute("quantity", quantity);
				request.setAttribute("color", color);
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("Quiz_12_data.jsp");
				dispatcher.forward(request, response);
			%>
	</body>
</html>