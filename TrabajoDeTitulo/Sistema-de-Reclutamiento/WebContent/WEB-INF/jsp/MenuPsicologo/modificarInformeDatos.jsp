<%-- 
    Document   : ver
    Created on : 17-08-2017, 11:45:54
    Author     : cesar.ibarra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/css/sticky-footer.css" />" rel="stylesheet">
        <title>Sistema de Reclutamiento</title>
        <link rel="icon" type="image/x-icon"  href="<s:url value="/resources/img/favicon.ico"/>" />
    </head>
    <body>

        <jsp:include page="../Reduce/Head.jsp" />

        <br>

        <div class="JumboT jumbotron-fluid">
            <div class="container">
                <center><h1 class="display-4">Evaluar Prueba Psicologica</h1></center>
            </div>
        </div>
		<form:form id="validacion-live" class="form-horizontal" action="guardarCambiosInforme" method="post" modelAttribute="informe">
        <div class="container">

            <div style="height: auto"  class="JumboT jumbotron Transp">
                <div class="container">

                    <div class="row">
						<input type="hidden" id="id_informe" name="id_informe" value="${informe.id_informe}"/>
                        <div class="col-md-4"></div>
                        <div class="col-md-4">
                                <div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1">RUT Postulante:</span>
                                    <input value="${informe.rut_postulante}" id="rut_postulante" name="rut_postulante" type="text" class="form-control" placeholder="RUT" aria-label="Username" aria-describedby="basic-addon1" required>
                                </div>
                        </div>
                        <div class="col-md-4"></div>
                    </div>
                    <br>
                    <div class="row">

                        <div class="col-md-4"></div>
                        <div class="col-md-4">
                                <div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1">Nota Postulante:</span>
                                    <input value="${informe.nota}" id="nota" name="nota" type="text" class="form-control" placeholder="Nota" aria-label="nota" aria-describedby="basic-addon1" required>
                                </div>
                        </div>
                        <div class="col-md-4"></div>
                    </div>
                    <br>
                    <div class="row">

                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                        <div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1">Comentario:</span>
                                   <textarea id="comentario" name="comentario" class="form-control" rows="5">${informe.comentario}</textarea>
                        </div>
                        </div>
                        <div class="col-md-3"></div>
                    </div>
                    <br>
<!--                     <div class="row"> -->
<!--                         <div class="col-md-2"></div> -->
<!--                         <div class="col-md-8"> -->
<!--                             <div class="alert alert-danger" role="alert"> -->
<!--                                 <b>*</b> Adjuntar archivos escaneados en formato PDF <br> -->
<!--                                 <b>*</b> Nombrar archivo .PDF con PS + el RUT del postulante sin puntos con Guion<br> -->
<!--                                 <b>*</b> Ejemplo: PS12345678-0.PDF<br> -->
<!--                             </div> -->
<!--                         </div> -->
<!--                         <div class="col-md-2"></div> -->
<!--                     </div> -->
<!--                     <br> -->
<!--                     <div class="row"> -->
<!--                         <div class="col-md-4"></div> -->
<!--                         <div class="col-md-4"> -->
<!--                             <input id="input-b6" name="input-b6[]" type="file" class="file" required> -->
<!--                         </div> -->
<!--                         <div class="col-md-4"></div> -->
<!--                     </div> -->
                    
                    <br><hr>
                    <div class="row">
                        <div class="col-md-4"></div>
                        <div class="col-md-4">
                            <button type="submit" class="btn btn-primary btn-lg">Guardar »</button>
                        </div>
                        <div class="col-md-4"></div>
                    </div>

                </div>
            </div>
        </div>
        </form:form>


        <jsp:include page="../Reduce/Footer.jsp" />

        <script src="<c:url value="/resources/js/Rut/jquery.rut.js"/>"></script>
        <script type="text/javascript">
            $(function () {
                $("form#validacion-live input").rut({formatOn: 'keyup', validateOn: 'keyup'}).on('rutInvalido', function () {
                    $("#rut").addClass("is-invalid");
                }).on('rutValido', function () {
                    $("#rut").removeClass("is-invalid");
                    $("#rut").addClass("is-valid");
                });
            });
        </script>
    </body>
</html>
