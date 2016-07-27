<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AB-HealthSmart</title>
</head>
<h1>AB-HealthSmart</h1>
<body>
<b>LOGIN</b>
<form action="C_L1_Login" method="post">  
<table>
<tr><td>Email:</td><td><input type="text" name="Email"><br></td></tr>
<tr><td>Password:</td><td><input type="password" name="Password"><br></td></tr>
<tr><td><input type="submit" value="login"></td></tr>
<tr><td><a href="Level1/L1_Login/V_L1_Forgot.jsp"></a>
</table>
</form>
<a href='Level1/L1_Login/V_L1_Forgot.jsp'><b>Forgot Password</a></br>
<a href='Level1/L1_Register/V_L1_RegistrationForm.jsp'><b>Click Here To Register</a>
</body>
</html>