<%-- 
    Document   : ver
    Created on : 17-08-2017, 11:45:54
    Author     : cesar.ibarra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/sticky-footer.css" />" rel="stylesheet">
        <title>Sistema de Reclutamiento</title>
        <link rel="icon" type="image/x-icon"   href="<s:url value="/resources/img/favicon.ico"/>" />
    </head>
    <body>

        <jsp:include page="../Reduce/Head.jsp" />

        <br>

        <div class="JumboT jumbotron-fluid">
            <div class="container">
                <center><h1 class="display-4">Prueba de Conocimiento</h1></center>
            </div>
        </div>

        <div class="container">

            <div style="height: auto"  class="JumboT jumbotron Transp">
                <div class="container">

                    <div class="alert alert-danger" role="alert">
                        <b>INSTRUCCIONES:</b><br><br>
                        <b>*</b> Solo tienes 300 segundos para completar la prueba<br>
                        <b>*</b> Solo puedes realizar la prueba que habilita la secretaria<br>
                        <b>*</b> Puedes Realizarla una <b>UNICA</b> vez.
                    </div>
                    <hr>
                    <div class="row">
                        <div class="col-md-4"></div>
                        <div class="col-md-4">
                            <button type="button" class="btn btn-primary btn-lg">Comenzar »</button>
                        </div>
                        <div class="col-md-4"></div>
                    </div>
                </div>
            </div>
        </div>


        <jsp:include page="../Reduce/Footer.jsp" />
    </body>
</html>
