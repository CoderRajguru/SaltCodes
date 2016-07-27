<%@page import="hs.Model.Level3.SendMessage.M_L3_ViewConversation_Doc"%>
<%@page import="hs.Model.Level3.SendMessage.M_L3_ConversationList_Doc,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

int Patient_Id=0;
String Doctor_Email=session.getAttribute("Email").toString();

M_L3_ConversationList_Doc Object_GetList=(M_L3_ConversationList_Doc)request.getAttribute("Object");
LinkedList<M_L3_ViewConversation_Doc.Node> DataList = new LinkedList<M_L3_ViewConversation_Doc.Node>();
DataList=Object_GetList.getList();
Iterator<M_L3_ViewConversation_Doc.Node> Data=DataList.iterator();
int Count=0;
	out.println("<table>");
	while (Data.hasNext()) 
	{
		
		Count++;
		M_L3_ViewConversation_Doc.Node Ref=Data.next();
		Patient_Id=Ref.Patient_Id;
		out.println("<tr><td>"+Ref.Sender+":-</td><td>On</td><td>"+Ref.Send_Date+"</td><td>:"+Ref.Message+"</td>");
	}
	out.println("</table>");
%>

	<form action="${pageContext.request.contextPath}/C_L3_Message_Doc" method="post">
	<table>
	<tr><td><input type="text"  name="Message"></td></tr>
	<tr><td><input type="hidden" name="Patient_Id" value="<%=Patient_Id%>">
	<tr><td><input type="hidden" name="Doc_Email" value="<%=Doctor_Email%>">
	<tr><td><input type="Submit" name="Button" value="Reply"></td></tr>
	</table>
	</form>
</body>
</html>