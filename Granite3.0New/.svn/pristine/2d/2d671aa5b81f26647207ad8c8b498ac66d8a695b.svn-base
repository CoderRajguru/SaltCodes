<%@page import="hs.Model.Level3.Connection.M_L3_ViewConnections_Doc"%>
<%@page import="hs.Model.Level3.Connection.M_L3_ConnectionList_Doc,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Doctor Connections</title>
</head>
<body>
<%
String Doctor_Email=session.getAttribute("Email").toString();
M_L3_ConnectionList_Doc Object_GetList=(M_L3_ConnectionList_Doc)request.getAttribute("Object");
LinkedList<M_L3_ViewConnections_Doc.Node> DataList = new LinkedList<M_L3_ViewConnections_Doc.Node>();
DataList=Object_GetList.getList();
Iterator<M_L3_ViewConnections_Doc.Node> Data=DataList.iterator();
int Count=0;

	while (Data.hasNext()) 
	{
		Count++;
		M_L3_ViewConnections_Doc.Node Ref=Data.next();
		out.print("<table>");
		out.print("<form action='C_L3_Message_Doc' method='post'> ");
		out.print("<tr><td>"+Count+"</td><td>"+Ref.Name+"</td><td>"+Ref.Gender+"</td><td>"+Ref.Contact+"</td></tr>");
		out.print("<tr><td><input type='hidden' name='Patient_Id' value='"+Ref.Patient_Id+"'></td>");
		out.print("<td><input type='hidden' name='Doc_Email' value='"+Doctor_Email+"'></td></tr>");
		out.print("<tr><td><input type='text' name='Message'></td>");
		out.print("<td><input type='submit' name='Button' value='Send Message'></td>");
		out.print("<td><input type='submit' name='Button' value='View Conversation'></td></tr>");
		out.print("</form>");
		out.print("</table>");
	}
%>

</body>
</html>
</body>
</html>