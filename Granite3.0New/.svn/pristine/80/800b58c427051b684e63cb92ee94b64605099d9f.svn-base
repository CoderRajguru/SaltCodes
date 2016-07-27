<%@page import="hs.Model.Level1.Login.M_L1_GetCustomerType"%>
<%@page import="hs.Model.Level1.Login.M_L1_LoginGetName"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginPage</title>
</head>
<h1>AB-HealthSmart</h1>
<body>

<%  
M_L1_LoginGetName Object_getName=(M_L1_LoginGetName)request.getAttribute("Object_Name");  
M_L1_GetCustomerType Object_getCustomerType=(M_L1_GetCustomerType)request.getAttribute("Object_CustomerType");
String Customer=Object_getCustomerType.getCustomerType();
out.print(Customer);
String Name=Object_getName.getName();
String Email=Object_getName.getEmail();

session.setAttribute("UserName", Name);
session.setAttribute("Email", Email);


if(Customer.equals("P "))
{
	response.sendRedirect("Level2/L2_HomePage/Patient_HomePage.jsp");
}
if(Customer.equals("D "))
{
	response.sendRedirect("Level2/L2_HomePage/Doctor_HomePage.jsp");
}

//out.print("<b>Welcome, "+Object_getName.getName());  
%>

</body>
</html>
