<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.sql.*" %>
<%
	request.setCharacterEncoding("utf-8");
	String userName = request.getParameter("userName");
	String userPhone = request.getParameter("userPhone");
	String userAddress = request.getParameter("userAddress");
	
	session.setAttribute("USERNAME", userName);	
	session.setAttribute("USERPHONE", userPhone);	
	session.setAttribute("USERADDRESS", userAddress);	
	
	String url_mysql = "jdbc:mysql://localhost:3306/customer?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql = "qwer1234";
	PreparedStatement ps = null;
	
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		

		
		String update = "update purchaserinfo set name = ?, tel = ?,address = ? where userid=?";
		
		ps = conn_mysql.prepareStatement(update);
		ps.setString(1, userName);
		ps.setString(2, userPhone);
		ps.setString(3, userAddress);
		ps.setString(4, (String) session.getAttribute("USERID"));
		ps.executeUpdate();
		
		
		conn_mysql.close();
		
	} catch(Exception e) {
		e.printStackTrace();
	}
	
	response.sendRedirect("purchaserUpdate_05.jsp");
%>