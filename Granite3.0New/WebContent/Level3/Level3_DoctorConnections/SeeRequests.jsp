<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Request and Connections</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/C_L3_ViewRequests" method="post">
<input type="text" name="Email" value="<%=session.getAttribute("Email") %>">
<input type="submit" value="See Requests">
</form>

<form action="${pageContext.request.contextPath}/C_L3_ViewConnections_Doc" method="post">
<input type="text" name="Email" value="<%=session.getAttribute("Email") %>">
<input type="submit" value="See Connections">
</form>
</body>
</html>