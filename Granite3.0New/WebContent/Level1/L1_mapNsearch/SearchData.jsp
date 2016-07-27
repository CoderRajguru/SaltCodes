
<%@page import="hs.Model.Level1.Map.M_L1_Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>
<%@page import="hs.Model.Level1.Map.*" %>
<%@page import="hs.Model.Level1.Map.M_L1_Map" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3px" bordercolor="blue">
<tr><td>Index</td><td>Name</td><td>Department</td><td>Contact</td></tr>
<%
M_L1_GetList Object_Key=(M_L1_GetList)request.getAttribute("Object");
LinkedList<M_L1_Map.Node> DataList = new LinkedList<M_L1_Map.Node>();
DataList=Object_Key.getList();
Iterator<M_L1_Map.Node> Data=DataList.iterator();
int Count=0;

	while (Data.hasNext()) 
	{
		Count++;
		M_L1_Map.Node Ref=Data.next();
		out.print("<tr><td>"+Count+"</td><td>"+Ref.Name+"</td><td>"+Ref.Department+"</td><td>"+Ref.Contact+"</td></tr>");
	}
%>
</table>
<div class="map">
<iframe width="100%" height="600px" name="iframe_a"></iframe>
</div>
</body>
</html>