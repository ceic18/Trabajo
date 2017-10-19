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
                <center><h1 class="display-4">Ver Postulaciones</h1></center>
            </div>
        </div>

        <div class="container">

            <div style="height: auto"  class="JumboT jumbotron Transp">
                <div class="container">

                    <div style="text-align: left" class="container">
                        <table class="table table-striped table-inverse table-bordered table-sm ">
                            <thead>
                                <tr class="bg-primary">
                                    <th>ID</th>
                                    <th>Usuario</th>
                                    <th>Contraseña</th>
                                    <th>Nombre</th>
<!--                                     <th>Fecha</th> -->
<!--                                     <th>Puntos</th> -->
<!--                                     <th>Ficha</th> -->
                                </tr>
                            </thead>
                            <tbody>
	                            <c:forEach items="${datos}" var="dato">
	                            	 <tr>
	                                    <th scope="row"><c:out value="${dato.id}"></c:out></th>
	                                    <th scope="row"><c:out value="${dato.user}"></c:out></th>
	                                    <th scope="row"><c:out value="${dato.pass}"></c:out></th>
	                                    <th scope="row"><c:out value="${dato.nombre}"></c:out></th>
	                                </tr>
	                            </c:forEach>
                            </tbody>
                        </table>
                    </div>

                </div>
            </div>
        </div>



        <jsp:include page="../Reduce/Footer.jsp" />
    </body>
</html>
