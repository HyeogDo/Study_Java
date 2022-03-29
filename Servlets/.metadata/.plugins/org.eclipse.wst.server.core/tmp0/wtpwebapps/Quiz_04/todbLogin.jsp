
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%	
	request.setCharacterEncoding("utf-8");
	String userId = request.getParameter("userId");
	String userName = request.getParameter("userName");
	String userPhone = request.getParameter("phone1") + "-" + request.getParameter("phone2") + "-" + request.getParameter("phone3");
	String userAddress = request.getParameter("userAddress");
	
	session.setAttribute("USERID", userId);
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
		
		String insertData = "insert into purchaserinfo(userid, name, tel, address,insertdate) values(?,?,?,?,now())";
		
		ps = conn_mysql.prepareStatement(insertData);
		ps.setString(1, userId);
		ps.setString(2, userName);
		ps.setString(3, userPhone);
		ps.setString(4, userAddress);
		ps.executeUpdate();
		
		conn_mysql.close();
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally{
		
	}
	
	response.sendRedirect("printLogin.jsp");
%>