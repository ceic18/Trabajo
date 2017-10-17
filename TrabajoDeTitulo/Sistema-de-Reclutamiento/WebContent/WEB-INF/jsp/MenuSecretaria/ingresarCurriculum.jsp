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
        <link rel="icon" type="image/x-icon"  href="<s:url value="/resources/img/favicon.ico"/>" />

        <script>
            $(document).ready(function () {
                $("#input-b6").fileinput({
                    showUpload: true,
                    maxFileCount: 3,
                    mainClass: "input-group-lg"
                            alert("AQUI");
                });
            });
        </script>
    </head>
    <body>

        <jsp:include page="../Reduce/Head.jsp" />

        <br>

        <div class="JumboT jumbotron-fluid">
            <div class="container">
                <center><h1 class="display-4">Ingresar Curriculum</h1></center>
            </div>
        </div>


        <div class="container">

            <div style="height: auto"  class="JumboT jumbotron Transp">
                <div class="container">

                    <div class="row">

                        <div class="col-md-4"></div>
                        <div class="col-md-4">
                            <form id="validacion-live" class="form-horizontal">
                                <div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1">RUT Postulante:</span>
                                    <input id="rut" name="rut" type="text" class="form-control" placeholder="RUT" aria-label="Username" aria-describedby="basic-addon1">
                                </div>
                            </form>
                            <div class="col-md-4"></div>
                        </div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6">
                            <div class="alert alert-danger" role="alert">
                                <b>*</b> Adjuntar archivos escaneados Comprimidos en un .RAR <br>
                                <b>*</b> Nombrar archivo .RAR con el RUT del postulante<br>
                                <b>*</b> Ejemplo: 12345678-0.rar<br>
                            </div>
                        </div>
                        <div class="col-md-3"></div>
                    </div>

                    <div class="row">
                        <div class="col-md-4"></div>
                        <div class="col-md-4">
                            <input id="input-b6" name="input-b6[]" type="file" class="file">
                        </div>
                        <div class="col-md-4"></div>
                    </div>
                    <br><hr>
                    <div class="row">
                        <div class="col-md-4"></div>
                        <div class="col-md-4">
                            <button type="button" class="btn btn-primary btn-lg">Guardar Curriculum »</button>
                        </div>
                        <div class="col-md-4"></div>
                    </div>
                </div>
            </div>
        </div>


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
