<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/TextBox.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/division.css" media="screen" />
<link rel="stylesheet" type="text/css" href="css/button.css" media="screen" />
<title>RegistrationForm</title>
<h1>AB-HealthSmart</h1>
<script type="text/javascript">
function validate()
{
   if( document.myForm.Name.value == "" )
   {
     alert( "Please provide your name!" );
     document.myForm.Name.focus() ;
     return false;
   }
   if( document.myForm.Email.value == "" )
   {
     alert( "Please provide your Email!" );
     document.myForm.Email.focus() ;
     return false;
     
   }
   var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;

   if (reg.test(document.myForm.Email.value) == false) 
   {
       alert('Invalid Email Address');
       return false;
   }
  

   if( document.myForm.Password.value == "")
   {
	   alert( "Please provide your Password!" );
	   document.myForm.Password.focus() ;
	   return false;
   }
   
   if( document.myForm.ConfirmPassword.value == "")		 
   {
	   alert( "Please Confirm your Password!" );
	   document.myForm.ConfirmPassword.focus() ;
	   return false;
   }
   
   if( document.myForm.Password.value.length<6 || document.myForm.Password.value.length>16 )	
	{
	   alert( "Password Should be between 6 to 16 characters" );
	   document.myForm.Password.focus();
	   return false;
	}
   if( document.myForm.ConfirmPassword.value != document.myForm.Password.value )		 
   {
	   alert( "Password and Confirm Password didnt Match" );
	   document.myForm.ConfirmPassword.focus() ;
	   document.myForm.Password.focus();
	   return false;
   }
   
   	   chosen = "";
	   len = document.myForm.Customer_Type.length;

	   for (i = 0; i <len; i++) 
	   {
	   if (document.myForm.Customer_Type[i].checked)
	   {
	   chosen = document.myForm.Customer_Type[i].value;
	   }
	   }

	   if (chosen == "") 
	   {
	   alert("No Option selected");
	   return false;
	   }
   return true;
 }

</script>
</head>
<body>
<b>REGISTER</b>
<form action="${pageContext.request.contextPath}/C_L1_Register" method="post" name="myForm"  onsubmit="return(validate());">
<table>
<tr><td><input type="text" placeholder="Name"   class="textbox" name="Name"></td></tr>
<tr><td><input type="text" placeholder="Email" class="textbox" name="Email"></td></tr>  
<tr><td><input type="password"  placeholder="Password" class="textbox" name="Password"></td></tr> 
<tr>><td><input type="password" placeholder="Confirm"  class="textbox" name="ConfirmPassword"></td></tr> 
<tr><td>Are you a Doctor?<td><input type='radio' name='Customer_Type' id='P' value='P'>No<input type='radio' name='Customer_Type' id='D' value='D'>Yes</td></tr>
<tr><td><input type="submit" value="Register" class="myButton"></td></tr>
</table>
</form>
</body>
</html>