<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");
	String userid = request.getParameter("userid");
	
	String url_mysql = "jdbc:mysql://localhost:3306/customer?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql = "qwer1234";
	
	String query = "select name, tel, address from purchaserinfo where userid = '" + userid + "'";
	String userName = "";
	String userPhone = "";
	String userAddress = "";
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		ResultSet rs = stmt_mysql.executeQuery(query);
		
		while(rs.next()) {
			userName = rs.getString(1);
			userPhone = rs.getString(2);
			userAddress = rs.getString(3);
		}
		conn_mysql.close();
		session.setAttribute("USERID", userid);	
		session.setAttribute("USERNAME", userName);	
		session.setAttribute("USERPHONE", userPhone);	
		session.setAttribute("USERADDRESS", userAddress);	
		
	} catch(Exception e) {
		e.printStackTrace();
	}
	response.sendRedirect("purchaserUpdate_03.jsp");
	
%>
