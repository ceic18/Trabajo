<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@page session="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<title>Sistema de Reclutamiento</title>
<link rel="icon" type="image/x-icon"
	href="<s:url value="/resources/img/favicon.ico"/>" />
<link href="<c:url value="/resources/css/open-iconic-bootstrap.css" />"
	rel="stylesheet">
	
<script language="JavaScript">
	
	setTimeout("update()",5000);
	
	function update(){
		document.location.href="menu"
	}
</script>
</head>

<body>
	<div class="container">
	<br>
		<img src="<c:url value="/resources/img/403.png"/>" class="img-fluid" />
		<h1>Lo Sentimos... No tienes Acceso a este Contenido</h1>
	</div>
</body>
</html>
