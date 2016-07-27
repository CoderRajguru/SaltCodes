<%@page import="hs.Model.Level3.AccountUpdate.M_L3_GetAccountDetails.AccountDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="hs.Model.Level3.AccountUpdate.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
M_L3_GetAccountDetails Object_GetDetails=(M_L3_GetAccountDetails)request.getAttribute("Object_GetDetails");

out.print(Object_GetDetails.Acc_Details);
%>
</body>
</html>