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
        <script src="<c:url value="/resources/js/jquery-3.2.1.slim.min.js"/>"></script>

            <script>
	            function onlyNumber() {
	            	if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;
	            }
            </script>
            
            <script>
	            $(window).on( "load", function() {
				var chars = "0123456789"; 
				var lon = 4;
				var code = ""; 
				for (x=1; x <= lon; x++){ 
				rand = Math.floor(Math.random()*chars.length); 
				code += chars.substr(rand, 1); 
				} 
				$("#clave").val(code); 
				}); 
			</script>
    </head>
    <body>

        <jsp:include page="../Reduce/Head.jsp" />

        <br>

        <div class="JumboT jumbotron-fluid">
            <div class="container">
                <center><h1 class="display-4">Ingresar Postulante/Curriculum </h1></center>
            </div>
        </div>
        
		<form:form id="validacion-live" class="form-horizontal" action="guardarPostulante" method="post" modelAttribute="postulante">
        <div class="container">

            <div style="height: auto"  class="JumboT jumbotron Transp">
                <div class="container">
                    <div class="row">
                        <div class="col-md-2"></div>
                        <div class="col-md-4">
                                <div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1">Nombre:</span>
                                    <input id="nombre" name="nombre" type="text" class="form-control" placeholder="nombre" aria-label="nombre" aria-describedby="basic-addon1" required>
                                </div>
                        </div>
                        <div class="col-md-4">
                        		<div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1">Apellido:</span>
                                    <input id="apellido" name="apellido" type="text" class="form-control" placeholder="apellido" aria-label="apellido" aria-describedby="basic-addon1" required>
                                </div>
                        </div>
                        <div class="col-md-2"></div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-md-2"></div>
                        <div class="col-md-4">
                                <div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1">RUT:</span>
                                    <input id="rut" name="rut" type="text" class="form-control" placeholder="RUT" aria-label="Username" aria-describedby="basic-addon1" onKeypress="onlyNumber()" required>
                                </div>
                        </div>
                        <div class="col-md-4">
                        		<div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1">Edad:</span>
                                    <input id="edad" name="edad" type="text" class="form-control" placeholder="edad" aria-label="edad" aria-describedby="basic-addon1" onKeypress="onlyNumber()" required>
                                </div>
                        </div>
                        <div class="col-md-2"></div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-md-2"></div>
                        <div class="col-md-4">
                                <div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1">Años Experiencia:</span>
                                    <input id="anos_exp" name="anos_exp" type="text" class="form-control" placeholder="Ej: 2" aria-label="anos_exp" aria-describedby="basic-addon1" onKeypress="onlyNumber()" required>
                                </div>
                        </div>
                        <div class="col-md-4">
                        		<div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1">Pretencion de Sueldo:</span>
                                    <input id="pretencion_sueldo" name="pretencion_sueldo" type="text" class="form-control" placeholder="Ej: 1.000.000" aria-label="pretencion_sueldo" aria-describedby="basic-addon1" onKeypress="onlyNumber()" required>
                                </div>
                        </div>
                        <div class="col-md-2"></div>
                    </div>
                    <br>
                    <div class="row">
                        <div class="col-md-2"></div>
                        <div class="col-md-4">
                                <div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1">Telefono:</span>
                                    <input id="telefono" name="telefono" type="text" class="form-control" placeholder="telefono" aria-label="telefono" aria-describedby="basic-addon1" onKeypress="onlyNumber()" required>
                                </div>
                        </div>
                        <div class="col-md-4">
                        		<div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1">Direccion:</span>
                                    <input id="direccion" name="direccion" type="text" class="form-control" placeholder="direccion" aria-label="direccion" aria-describedby="basic-addon1" required>
                                </div>
                        </div>
                        <div class="col-md-2"></div>
                    </div>
                    <br>
<!--                     <div class="row"> -->
<!--                         <div class="col-md-4"></div> -->
<!--                         <div class="col-md-4"> -->
<!--                                 <div class="input-group"> -->
<%--                                     <span class="input-group-addon" id="basic-addon1">Correo:</span> --%>
<!--                                     <input id="Email" name="Email" type="text" class="form-control" placeholder="Email" aria-label="Email" aria-describedby="basic-addon1" required> -->
<!--                                 </div> -->
<!--                         </div> -->
<!--                         <div class="col-md-4"></div> -->
<!--                     </div> -->
<!--                     <br> -->
                    <div class="row">
                        <div class="col-md-4"></div>
                        <div class="col-md-4">
                                <div class="input-group">
                                    <span class="input-group-addon" id="basic-addon1">Contraseña Generada:</span>
                                    <input readonly id="clave" name="clave" type="text" class="form-control" placeholder="Ej: 2" aria-label="clave" aria-describedby="basic-addon1" onKeypress="onlyNumber()" required>
                                </div>
                        </div>
                        <div class="col-md-4"></div>
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
                            <input id="input-b6" name="input-b6[]" type="file" class="file" required>
                        </div>
                        <div class="col-md-4"></div>
                    </div>
                    <br><hr>
                    <div class="row">
                        <div class="col-md-4"></div>
                        <div class="col-md-4">
                            <button type="submit" id="btn" class="btn btn-primary btn-lg">Guardar Postulante »</button>
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
                $("form#validacion-live #rut").rut({formatOn: 'keyup', validateOn: 'keyup'}).on('rutInvalido', function () {
                    $("#rut").addClass("is-invalid");
                }).on('rutValido', function () {
                    $("#rut").removeClass("is-invalid");
                    $("#rut").addClass("is-valid");
                });
            });
            
//             $("#btn").click(function (e) {
//                 e.preventDefault();
//                 alert($("#contraseña").val());
//             });
        </script>
    </body>
</html>
