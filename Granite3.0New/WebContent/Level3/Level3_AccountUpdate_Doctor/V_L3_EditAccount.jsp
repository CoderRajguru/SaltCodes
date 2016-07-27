<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/TextBox.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/division.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/button.css" media="screen" />
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script>
  $(function() {
    $( "#datepicker" ).datepicker();
  });
</script>
<script>
    $(document).ready(function() {
        $('#country').change(function(event) {  
        var $country=$("select#country").val();
           $.get('${pageContext.request.contextPath}/C_getStates',{countryname:$country},function(responseJson) {   
            var $select = $('#states');                           
               $select.find('option').remove();                          
               $.each(responseJson, function(key, value) {               
                   $('<option>').val(key).text(value).appendTo($select);      
                    });
            });
        });
    }); 
    
    $(document).ready(function() {
        $('#states').change(function(event) {  
        var $state=$(this).find('option:selected').text();
        document.getElementById('show').innerHTML=state;
           $.get('${pageContext.request.contextPath}/C_getCities',{statename:$state},function(responseJson) {   
            var $select = $('#cities');                           
               $select.find('option').remove();                          
               $.each(responseJson, function(key, value) {               
                   $('<option>').val(key).text(value).appendTo($select);      
                    });
            });
        });
    }); 
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../css/TextBox.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/division.css" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/button.css" media="screen" />
<title>Account Update</title>
</head>
<body>
<%
String Name=session.getAttribute("UserName").toString();
String R_Email=session.getAttribute("Email").toString();
%>
<b>Hi </b><b><%=Name %></b></br>
<img src="../Images/kk.jpg"style="width:200px;height:200px"></br>
<a href=#>Edit My Proile Picture</a></br>

Your Registered Email Id:-<b><%=R_Email %></b>
<form action="${pageContext.request.contextPath}/C_L3_AccountUpdate" method="post">
<table>
<%
String Email=session.getAttribute("Email").toString();
%>
<tr><td><input type="text" placeholder="<%=Email %>" class="textbox" name="Email" value="<%=Email%>">NonEditable</td></tr>
<tr><td><input type="text" placeholder="First Name"   class="textbox" name="first_name" value></td></tr>
<tr><td><input type="text" placeholder="Middle Name"   class="textbox" name="middle_name"></td></tr>
<tr><td><input type="text" placeholder="Last Name"   class="textbox" name="last_name"></td></tr>
<tr><td><input type='radio' name='gender' value='M'>Male</input><input type='radio' name='gender' value='F'>Female</input></td></tr>
<!--  <tr><td><select name="country" id="country" onchange="getCountry();"><option value="#">Select Country</option>
				<option value="US">United States</option>
</select>
-->
<tr><td><input type="text" placeholder="House Flat Apartment "class="textbox" name="address1"></td></tr>
<tr><td><input type="text"placeholder="Date Of Birth" class="textbox" name="DOB" id="datepicker"></td></tr>
<tr><td>
Select Country:
</td>
<td>
<select id="country" name="country">
<option>Select Country</option>
<option value="United States">United States</option>
</select>
</td></tr>
<tr><td>
Select State:
</td><td>
<select id="states" name="state">
<option>Select State</option>
</select>
</td></tr>
<tr><td>
Select City:
</td><td>
<select id="cities"  name="city">
<option>Select City</option>
</select>
</td></tr>

<tr><td>State<input type="text" id='show' name="statec"></td></tr>
<tr><td><input type="text" placeholder="House Flat Apartment "class="textbox" name="address1"></td></tr>
<tr><td><input type="text" placeholder="Street Area "class="textbox" name="address2"></td></tr>
<tr><td><input type="text" placeholder="Pin Code" class="textbox" name="zipcode"></td></tr>
<tr><td><input type="text" placeholder="Contact" class="textbox" name="phone_number"></td></tr>

<tr><td><input type="submit" class="myButton" value="UpdateData">
</table>
</form>
</body>
</html>