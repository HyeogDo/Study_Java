	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<h1> Include Page 01</h1>
	<% int i = 1; %>
	<%!
		public int hello() {
			int j = 1;
			return j;
		}
	%>