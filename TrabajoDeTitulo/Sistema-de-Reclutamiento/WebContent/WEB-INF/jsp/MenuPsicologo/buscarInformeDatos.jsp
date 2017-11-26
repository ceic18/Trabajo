<%-- 
    Document   : ver2
    Created on : 17-08-2017, 11:45:54
    Author     : cesar.ibarra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/sticky-footer.css" />"
	rel="stylesheet">
<title>Sistema de Reclutamiento</title>
<link rel="icon" type="image/x-icon"
	href="<s:url value="/resources/img/favicon.ico"/>" />
</head>
<body>

	<jsp:include page="../Reduce/Head.jsp" />

	<br>

	<div class="JumboT jumbotron-fluid">
		<div class="container">
			<center>
				<h1 class="display-4">Buscar Informe</h1>
			</center>
		</div>
	</div>

	<div class="container">
		<div style="text-align: left" class="container">
			<table
				class="table table-striped table-inverse table-bordered table-sm ">
				<thead>
					<tr class="bg-primary">
						<th>ID</th>
						<th>Rut Postulante</th>
						<th>Nota</th>
						<th>Comentario</th>
						<th>Informe</th>
						<th>Accion</th>
					</tr>
				</thead>
				<tbody>
            <tr>
                <td>${informe.id_informe}</td>
                <td>${informe.rut_postulante}</td>
                <td>${informe.nota}</td>
                <td>${informe.comentario}</td>
            	<td><button class="btn btn-primary btn-sm centered" type="Button" value="">Descargar Informe</button></td>
				<td><a href="modificarInforme?rut_postulante=${informe.rut_postulante}" class="btn btn-primary btn-sm active" role="button" >Editar</a> | 
				<a href="eliminarInforme?rut_postulante=${informe.rut_postulante}" class="btn btn-warning btn-sm active" role="button" >Eliminar</a></td>
			</tr>       
				</tbody>
			</table>
		</div>
	</div>


	<jsp:include page="../Reduce/Footer.jsp" />

	<script src="<c:url value="/resources/js/Rut/jquery.rut.js"/>"></script>
	<script type="text/javascript">
		$(function() {
			$("form#validacion-live input").rut({
				formatOn : 'keyup',
				validateOn : 'keyup'
			}).on('rutInvalido', function() {
				$("#rut").addClass("is-invalid");
			}).on('rutValido', function() {
				$("#rut").removeClass("is-invalid");
				$("#rut").addClass("is-valid");
			});
		});
	</script>
</body>
</html>
