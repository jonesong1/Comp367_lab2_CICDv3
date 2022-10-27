<!-- 
 * Author: Timothy Jones Ong 300983486
 * COMP367 Lab 2
 * Date started: Oct 26, 2022
-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.tjo.lab.java.Welcome"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Comp 367 Lab 2 by TJO</title>
</head>
<body>
	<jsp:useBean id="welcome" class="com.tjo.lab.java.Welcome" scope="session">
	</jsp:useBean>
    
    <h1><%= welcome.getSetTimePeriod() %><jsp:getProperty name="welcome" property="NAME" />. Welcome to COMP367</h1>
</body>
</html>