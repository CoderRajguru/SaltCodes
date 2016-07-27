<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="hs.Other.Functions.Vrfcn_Id_Validation"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Verification Validation</title>
</head>
<body>
<%
String Verification_id=request.getParameter("Verification_id");
String Email=request.getParameter("Email");
Vrfcn_Id_Validation object=new Vrfcn_Id_Validation();
boolean status=object.Verify_Id(Email, Verification_id);
if(status)
{
	out.print("success");
}
else
{
	out.print("not success");
}

%>
</body>
</html>