<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/TextBox.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/division.css" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/button.css" media="screen" />
<title>Login Form</title>
</head>
<h1>Enter Login Details</h1>
<body>
<form action="${pageContext.request.contextPath}/C_L1_Login" method="post" name="myForm" target="_parent">
<table>
<tr><td><input type="text" placeholder="Email" class="textbox" name="Email"></td></tr>
<tr><td><input type="password" placeholder="Password" class="textbox" name="Password"></td></tr>
<tr><td><input type="submit" value="login" class="myButton"></td></tr>
<tr><td><a href="../L1_Register/V_L1_RegistrationForm.jsp" target="iframe_a">Register With Us </a>
</table>
</form>
</body>
</html>