<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div style="text-align: center; margin-top: 100px;">
		<%
			int weight;
			double height;
			weight = Integer.parseInt(request.getParameter("weight"));
			height = Double.parseDouble(request.getParameter("height")) * 0.01;
			double bmi =  weight / (height * height);
			
		%>
		<%!
			public String bmiStatus(double bmi) {
				String res = "null";
				if (bmi < 18.5) {
					res = "저체중입니다. 조금 더 몸무게를 늘릴 필요가 있습니다.";
				} else if (bmi < 23) {
					res = "정상입니다. 이대로 유지하세요!";
				} else if (bmi < 25) {
					res = "과체중입니다. 조금 더 몸무게를 줄일 필요가 있습니다.";
				} else {
					res = "비만입니다.";					
				}
				return res;
			}
		%>
		
		<img alt="bmiTable" src="./imgsrc/bmiTable.png" width="500">
		<h1>당신의 BMI는 <%=String.format("%2.2f", bmi) %>입니다.</h1><br>
		<h1>당신은 <%=bmiStatus(bmi) %></h1>
		<% if ( bmi >= 25) {
				%><%@include file="./Quiz_10_bmi25.jsp" %><% 
			}
		%>
		</div>
	</body>
</html>