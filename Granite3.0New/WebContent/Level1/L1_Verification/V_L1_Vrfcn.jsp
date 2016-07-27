<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="hs.Other.Functions.Random_Id"%>
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

String Verification_Id=Random_Id.getRandomString(12);
try {
	Message message = new MimeMessage(sess);
	message.setFrom(new InternetAddress("demohealthmail@gmail.com"));
	message.setRecipients(Message.RecipientType.TO,
			InternetAddress.parse(""));
	message.setSubject("Testing Subject");
	message.setText(Verification_Id);

	Transport.send(message);

	System.out.println("Done");

} catch (MessagingException e) {
	throw new RuntimeException(e);
}
%>  
</body>
</html>