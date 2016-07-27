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
<table border="3px" bordercolor="blue">
<tr><td>Index</td><td>Name</td><td>Gender</td><td>Contact</td></tr>
<%
String Doc_Email=session.getAttribute("Email").toString();
M_L3_GetPatientList Object_GetList=(M_L3_GetPatientList)request.getAttribute("Object");
LinkedList<M_L3_ViewRequests.Node> DataList = new LinkedList<M_L3_ViewRequests.Node>();
DataList=Object_GetList.getList();
Iterator<M_L3_ViewRequests.Node> Data=DataList.iterator();
int Count=0;

	while (Data.hasNext()) 
	{
		Count++;
		M_L3_ViewRequests.Node Ref=Data.next();
		out.print("<form action='C_L3_RequestResponse' method='post'> ");
		out.print("<tr><td>"+Count+"</td><td>"+Ref.Name+"</td><td>"+Ref.Gender+"</td><td>"+Ref.Contact+"</td></tr>");
		out.print("<tr><td><input type='hidden' name='Patient_Id' value='"+Ref.Pat_id+"'></td></tr>");
		out.print("<tr><td><input type='hidden' name='Doc_Email' value='"+Doc_Email+"'></td></tr>");
		out.print("<tr><td><input type='submit' name='Response' value='Confirm'></td><td><input type='submit' name='Response' value='Reject'></td></tr>");
		out.print("</form>");
	}
%>
</table>
</body>
</html>