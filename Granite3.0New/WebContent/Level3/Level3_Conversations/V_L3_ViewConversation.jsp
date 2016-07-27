<%@page import="hs.Model.Level3.SendMessage.M_L3_ViewConversation"%>
<%@page import="java.util.*"%>
<%@page import="hs.Model.Level3.SendMessage.M_L3_ConversationList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Conversation</title>
</head>
<body>
<%

int Doctor_Id=0;
String Patient_Email=session.getAttribute("Email").toString();

M_L3_ConversationList Object_GetList=(M_L3_ConversationList)request.getAttribute("Object");
LinkedList<M_L3_ViewConversation.Node> DataList = new LinkedList<M_L3_ViewConversation.Node>();
DataList=Object_GetList.getList();
Iterator<M_L3_ViewConversation.Node> Data=DataList.iterator();
int Count=0;
	out.println("<table>");
	while (Data.hasNext()) 
	{
		
		Count++;
		M_L3_ViewConversation.Node Ref=Data.next();
		Doctor_Id=Ref.Doctor_id;
		out.println("<tr><td>"+Ref.Sender+":-</td><td>On</td><td>"+Ref.Send_Date+"</td><td>:"+Ref.Message+"</td>");
	}
	out.println("</table>");
%>

	<form action="${pageContext.request.contextPath}/C_L3_Message" method="post">
	<table>
	<tr><td><input type="text"  name="Message"></td></tr>
	<tr><td><input type="hidden" name="Doctor_Id" value="<%=Doctor_Id%>">
	<tr><td><input type="hidden" name="Pat_Email" value="<%=Patient_Email%>">
	<tr><td><input type="Submit" name="Button" value="Reply"></td></tr>
	</table>
	</form>
</body>
</html>