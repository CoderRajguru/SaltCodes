<%@page import="hs.Model.Level3.FileUpload.M_L3_FileList"%>
<%@page import="hs.Model.Level3.FileUpload.M_L3_FileDownload"%>
<%@page import="java.util.*;" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Download</title>
</head>
<body>
<%
M_L3_FileList Object_GetFileList=(M_L3_FileList)request.getAttribute("Object");
LinkedList<M_L3_FileDownload.Node> DataList = new LinkedList<M_L3_FileDownload.Node>();
DataList=Object_GetFileList.getList();
Iterator<M_L3_FileDownload.Node> Data=DataList.iterator();
int Count=0;

	while (Data.hasNext()) 
	{
		Count++;
		M_L3_FileDownload.Node Ref=Data.next();
		out.print("<table>");
		out.print("<form action='C_L3_DownloadFile' method='post'> ");
		out.print("<tr><td>"+Count+"</td><td>"+Ref.Record_Name+"</td><td>"+Ref.Record_Type+"</td></tr>");
		out.print("<tr><td><input type='hidden' name='Record_Id' value='"+Ref.Record_Id+"'></td>");
	//	out.print("<td><input type='hidden' name='Doc_Email' value='"+Doctor_Email+"'></td></tr>");
	//	out.print("<tr><td><input type='text' name='Message'></td>");
		out.print("<td><input type='submit' name='Button' value='Download'></td>");
		out.print("<td><input type='submit' name='Button' value='Share'></td></tr>");
		out.print("</form>");
		out.print("</table>");
	}
%>
</body>
</html>