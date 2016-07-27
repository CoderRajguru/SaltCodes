<%@page import="org.json.simple.*"%>
<%
String Name=request.getParameter("Name");
String Email=request.getParameter("Email");
String Password=request.getParameter("Password");
String Customer_Type=request.getParameter("Customer_Type");
%>

<jsp:useBean id="Registration" scope="request"
                    class="hs.Model.Level1.Register.M_L1_Register"> 
   <jsp:setProperty name="Registration" property="name"
                    value="<%=Name%>"/>
   <jsp:setProperty name="Registration" property="email"
                    value="<%=Email%>"/>
   <jsp:setProperty name="Registration" property="password"
                    value="<%=Password%>"/>
   <jsp:setProperty name="Registration" property="customer_Type"
                    value="<%=Customer_Type%>"/>
</jsp:useBean>

<%
JSONObject jsonobj=new JSONObject();
int Response=Registration.Confirm_Register();


if(Response==0)
{
	
    
	jsonobj.put("Response","Duplicate Email");
	out.print(jsonobj);
}
else if(Response==1)
{
	
     jsonobj.put("Response","Registration Failed While Inserting");
 	out.print(jsonobj);
}

else if(Response==2)
{
	
     jsonobj.put("Response","Registration Failed While Inserting");
 	out.print(jsonobj);
}
else if(Response==100)
{
     
     jsonobj.put("Response","Registration Success");
 	out.print(jsonobj);
}



%>