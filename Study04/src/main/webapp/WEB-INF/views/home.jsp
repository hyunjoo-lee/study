<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
${aa[0].id}
${aa[0].password}
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
