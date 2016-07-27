<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/TextBox.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/division.css" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/button.css" media="screen" />
<title>Account View</title>
</head>
<body>
<%
String Name=session.getAttribute("UserName").toString();
String Email=session.getAttribute("Email").toString();
%>
<b>Hi </b><b><%=Name %></b></br>
<img src="../../Images/kk.jpg"style="width:200px;height:200px"></br>
<a href=#>Edit My Proile Picture</a></br>

Your Registered Email Id:-<b><%=Email %></b>
<form action="${pageContext.request.contextPath}/C_L3_GetAccountDetails" method="post">
<input type="hidden" name="Email" value="<%=Email %>" >
<input type="submit" value="View Details" class="myButton">
</form>
</body>
</html>