<%@page import="hs.Model.Level1.Register.M_L1_Register"%>
<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!--  -->
<html>
<head>
<script type="text/javascript">

function my_code(){
alert("Click ok to Login with Your Username and Password");
location.href='index.jsp';
}
</script>
<title>Registration Success</title>
</head>
<Body onLoad=my_code()>

<%
/*

M_L1_Register Object=(M_L1_Register)request.getAttribute("Object_Email");
String Registered_Email=Object.getEmail();
Properties props = new Properties();
props.put("mail.smtp.host", "smtp.gmail.com");
props.put("mail.smtp.socketFactory.port", "465");
props.put("mail.smtp.socketFactory.class",
		"javax.net.ssl.SSLSocketFactory");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.port", "465");

Session sess = Session.getInstance(props,
	new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication("demohealthmail@gmail.com","demodemodemo");
		}
	});

try {
	Message message = new MimeMessage(sess);
	message.setFrom(new InternetAddress("demohealthmail@gmail.com"));
	message.setRecipients(Message.RecipientType.TO,
			InternetAddress.parse(Registered_Email));
	message.setSubject("Testing Subject");
	message.setText("12345678");

	Transport.send(message);

	System.out.println("Done");

} catch (MessagingException e) {
	throw new RuntimeException(e);
}

M_L1_Register Object=(M_L1_Register)request.getAttribute("Object");  
String Customer_Type=Object.getCustomer_Type();

if(Customer_Type.equals("P"))
{
	response.sendRedirect("Level2/Patient_HomePage.jsp");
}
if(Customer_Type.equals("D"))
{
	response.sendRedirect("Level2/Doctor_HomePage.jsp");
}
*/
%>  
 </body>
 </html>
