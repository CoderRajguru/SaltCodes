<%@page import="org.json.simple.*"%>
<%
String Email=request.getParameter("Email");
String Password=request.getParameter("Password");
%>

<jsp:useBean id="Login" scope="request"
                    class="hs.Model.Level1.Login.M_L1_Login"> 
   <jsp:setProperty name="Login" property="email"
                    value="<%=Email%>"/>
   <jsp:setProperty name="Login" property="password"
                    value="<%=Password%>"/>
</jsp:useBean>

<%
JSONObject jsonobj=new JSONObject();
Boolean Status=Login.Login_Validate();
if(Status)
{
	Login.getLoginId();
	String Customer_Type=Login.getCustomerType();
	String Name=Login.getLoggerName();
	jsonobj.put("status",Status);
	jsonobj.put("name",Name);
	out.print(jsonobj);
}
else
{
	jsonobj.put("status",Status);
}

%>