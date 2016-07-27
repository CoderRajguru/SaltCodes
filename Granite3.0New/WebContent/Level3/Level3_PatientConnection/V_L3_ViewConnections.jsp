<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="hs.Model.Level3.Connection.*,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Patient Requests</title>
</head>
<body>


<%
String Patient_Email=session.getAttribute("Email").toString();
M_L3_ConnectionList Object_GetList=(M_L3_ConnectionList)request.getAttribute("Object");
LinkedList<M_L3_ViewConnections.Node> DataList = new LinkedList<M_L3_ViewConnections.Node>();
DataList=Object_GetList.getList();
Iterator<M_L3_ViewConnections.Node> Data=DataList.iterator();
int Count=0;

	while (Data.hasNext()) 
	{
		Count++;
		M_L3_ViewConnections.Node Ref=Data.next();
		out.print("<table>");
		out.print("<form action='C_L3_Message' method='post'> ");
		out.print("<tr><td>"+Count+"</td><td>"+Ref.Name+"</td><td>"+Ref.Department+"</td><td>"+Ref.Contact+"</td></tr>");
		out.print("<tr><td><input type='hidden' name='Doctor_Id' value='"+Ref.Doc_id+"'></td>");
		out.print("<td><input type='hidden' name='Pat_Email' value='"+Patient_Email+"'></td></tr>");
		out.print("<tr><td><input type='text' name='Message'></td>");
		out.print("<td><input type='submit' name='Button' value='Send Message'></td>");
		out.print("<td><input type='submit' name='Button' value='View Conversation'></td></tr>");
		out.print("</form>");
		out.print("</table>");
	}
%>

</body>
</html>