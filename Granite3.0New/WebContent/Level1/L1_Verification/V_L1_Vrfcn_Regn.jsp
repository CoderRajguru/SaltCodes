
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="hs.Model.Level1.Register.M_L1_Register"%>
<%@page import="hs.Other.Functions.Random_Id"%>
<%@page import="hs.Other.Functions.Vrfcn_Id_Insertion"%>
<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Verification Page</title>
</head>
<body>
<%
M_L1_Register Object=(M_L1_Register)request.getAttribute("Object");
String Registered_Email=Object.getEmail();

Properties props = new Properties();
props.put("mail.smtp.host", "smtp.gmail.com");
props.put("mail.smtp.socketFactory.port", "465");
props.put("mail.smtp.socketFactory.class",
		"javax.net.ssl.SSLSocketFactory");
props.put("mail.smtp.auth", "true");
props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");
props.put("mail.smtp.port", "465");


Session sess = Session.getInstance(props,
	new javax.mail.Authenticator() {
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication("demohealthmail@gmail.com","demodemodemo");
		}
	});

String Verification_Id=Random_Id.getRandomString(12);
Vrfcn_Id_Insertion object_Verification_id=new Vrfcn_Id_Insertion();
object_Verification_id.Vrfcn_Id_Insert(Registered_Email, Verification_Id);

try {
	Message message = new MimeMessage(sess);
	message.setFrom(new InternetAddress("demohealthmail@gmail.com"));
	message.setRecipients(Message.RecipientType.TO,
			InternetAddress.parse(Registered_Email));
	message.setSubject("Testing Subject");
	message.setText(Verification_Id);

	Transport.send(message);


} catch (MessagingException e) {
	throw new RuntimeException(e);
}
%>

<form action="V_L1_Vrfcn_Valdn.jsp" method="post">
Enter Verification Id:<input type="text" name="Verification_id">
<input type="hidden" name="Email" value="<%=Registered_Email %>">
<input type="submit" value="Verify">
</form>

 
</body>
</html>