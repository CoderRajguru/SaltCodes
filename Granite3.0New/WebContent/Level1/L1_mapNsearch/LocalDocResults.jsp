<%@page import="hs.Model.Level1.Map.M_L1_LocalDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>
<%@page import="hs.Model.Level1.Map.*" %>
<%@page import="hs.Model.Level1.Map.M_L1_Map" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/TextBox.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/division.css" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/button.css" media="screen" />
<title>Local Doctors Result</title>
</head>
<body>
<table border="3px" bordercolor="blue">
<tr><td>Index</td><td>Name</td><td>Department</td><td>Contact</td></tr>

<%
String PatientEmail=session.getAttribute("Email").toString();
M_L1_GetLocalList Object_Key=(M_L1_GetLocalList)request.getAttribute("Object");
LinkedList<M_L1_LocalDB.Node> DataList = new LinkedList<M_L1_LocalDB.Node>();
DataList=Object_Key.getList();
Iterator<M_L1_LocalDB.Node> Data=DataList.iterator();
int Count=0;
	while (Data.hasNext()) 
	{
		Count++;
		M_L1_LocalDB.Node Ref=Data.next();
		out.print("<form action='C_L3_ConnectionRequest'method='post'> ");
		out.print("<tr><td>"+Count+"</td><td>"+Ref.Name+"</td><td>"+Ref.Department+"</td><td>"+Ref.Contact+"</td>");
		out.print("<td><input type='hidden' name='Doc_Login_id' value='"+Ref.Login_id+"'</td>");
		out.print("<td><input type='hidden' name='Patient_Email' value='"+PatientEmail+"'</td>");
		out.print("<td><input type='submit' class='myButton' value='Connect'></td></tr>");
		out.print("</form>");
			
	}
%>
</body>
</html>