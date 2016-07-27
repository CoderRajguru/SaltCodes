<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="hs.Model.Level1.Login.M_L1_LoginGetName"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/mystyles.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/button.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/division.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/TextBox.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/NewButton.css" media="screen" />
<title>Doctor Home Page</title>
<h1>AB HealthSmart</h1>
</head>

<body>
<ul id="menu-bar">
 <li class="active"><a href="index.jsp">Home</a></li>
 <li><a href="#">Map</a></li>
 <li><a href="../../Level3/Level3_DoctorConnections/SeeRequests.jsp" target="iframe_right">Connections</a></li>
  <li><a href="#">Documents</a>
  <ul>
   <li><a href="#">Upload</a></li>
   <li><a href="#">Share</a></li>
   <li><a href="#">Download</a></li>
  </ul>
 </li>
 <li><a href="#">Calender</a></li>
 <li><a href="../Level1/L1_Logout/V_L1_Logout.jsp">LogOut</a></li>
 <li><a href="#"><%=session.getAttribute("UserName").toString() %>Account</a>
</ul>
<div id="RightExtreme">
<iframe width="100%" height="600px" name="iframe_right"></iframe>
</div>
</body>
</html>