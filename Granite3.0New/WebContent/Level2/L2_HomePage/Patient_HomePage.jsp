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
<title>Patient Home Page</title>
<h1>AB HealthSmart</h1>
</head>

<body>
<ul id="menu-bar">
 <li class="active"><a href="index.jsp">Home</a></li>
 <li><a href="../../Level1/L1_mapNsearch/MapSearch.jsp">Map</a></li>
 <li><a href="../../Level3/Level3_PatientConnection/SeeConnections.jsp">Connections</a></li>
  <li><a href="#">Documents</a>
  <ul>
   <li><a href="../../Level3/Level3_FileUpload/V_L3_FileUpload.jsp" target="iframe_a">Upload</a></li>
   <li><a href="#">Share</a></li>
   <li><a href="../../Level3/Level3_FileDownload/V_L3_ShowDocs.jsp" target="iframe_a">Download</a></li>
  </ul>
 </li>
 <li><a href="#">Calender</a></li>
 <li><a href="../L2_Logout/V_L2_Logout.jsp">LogOut</a></li>
 <li><a href="../../Level3/Level3_AccountUpdate_Patient/V_L3_ViewAccount.jsp" target="iframe_a"><%=session.getAttribute("UserName").toString() %>Account</a></a></li>
</ul>
<div class="map">
<iframe width="100%" height="600px" name="iframe_a"></iframe>
</div>

</body>
</html>