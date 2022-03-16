<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

		<%
			for (int i = 0; i <= 100; i++) {
				out.print("<option value=" + i + "> " + i + "</option>");
			}
		%>
