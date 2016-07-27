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
