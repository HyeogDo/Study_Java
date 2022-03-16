<%@page import="java.util.GregorianCalendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		GregorianCalendar gCalendar = new GregorianCalendar();

	%>
	현재일은 <%=String.format("%TY년 %Tm월 %Td일", gCalendar, gCalendar, gCalendar) %> 입니다. <br>
	현재 시각은 <%=String.format("%TH시 %TM분 %TS초", gCalendar, gCalendar, gCalendar) %> 입니다. <br>
