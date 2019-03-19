<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Chat</title>
</head>
<body>
<center>
<textarea cols="50" rows="30"><% if(application.getAttribute("canal")!=null){ %>
<%=application.getAttribute("canal")%>
<%} %>
</textarea>

<form action="/Chat1.0/ChatServlet" method="post" >
	Memsagem: <input name="mensagem" type="text"> <button type="submit">Enviar</button> 
</form>
</center>
</body>
</html>