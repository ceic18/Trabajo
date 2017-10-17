<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<meta http-equiv="refresh" content="60; url=<c:url value = "/index.htm"/>" />-->
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/sticky-footer.css" />" rel="stylesheet">
        <title>Sistema de Reclutamiento</title>
        <link rel="icon" type="image/x-icon"   href="<s:url value="/resources/img/favicon.ico"/>" />
    </head>
    <body>

        <jsp:include page="Reduce/Head.jsp" />

        <br>
        <div class="container">

            <div class="JumboT jumbotron-fluid">
                <div class="container">
                    <center><h1 class="display-4" href="menuPsicologo">Sistema de Selección de Personal</h1></center>
                </div>
            </div>
            <img class="img-resp" width="700" height="320" src="<s:url value="/resources/img/rc.png"/>"  >
        </div>

        <jsp:include page="Reduce/Footer.jsp" />
    </body>
</html>
