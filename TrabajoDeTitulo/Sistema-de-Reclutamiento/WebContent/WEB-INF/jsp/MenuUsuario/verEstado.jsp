<%-- 
    Document   : ver
    Created on : 17-08-2017, 11:45:54
    Author     : cesar.ibarra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
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
<script src="<c:url value="/resources/js/jquery-3.2.1.slim.min.js"/>"></script>
</head>
<body>

	<jsp:include page="../Reduce/Head.jsp" />

	<br>

	<div class="JumboT jumbotron-fluid">
		<div class="container">
			<center>
				<h1 class="display-4">Ver Estado Postulacion</h1>
			</center>
		</div>
	</div>
	<div class="container">

		<div style="height: auto" class="JumboT jumbotron Transp">
			<div class="container">

				<div style="text-align: left" class="container">
					<table
						class="table table-striped table-inverse table-bordered table-sm ">
						<thead>
							<tr class="bg-primary">
								<th>RUT</th>
								<th>Nombre</th>
								<th>Estado Postulacion</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>${postulante.rut}</td>
								<td>${postulante.nombre}</td>
								<td>${postulante.estado}</td>
							</tr>
						</tbody>
					</table>
				</div>

				<div style="text-align: left" class="container">
					<table
						class="table table-striped table-inverse table-bordered table-sm ">
						<thead>
							<tr class="bg-primary">
								<th>Paso 1</th>
								<th>Paso 2</th>
								<th>Paso 3</th>
								<th>Paso 4 (Final)</th>
								<th class="bg-danger">Paso N (Final)</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>Curriculum Ingresado</td>
								<td>Prueba de Conocimiento Realizado</td>
								<td>Entrevista con Psicologico Realizado</td>
								<td>RRHH Acepta al Candidato</td>
								<td class="bg-danger">RRHH Rechaza al Candidato</td>
							</tr>
						</tbody>
					</table>
				</div>


			</div>
		</div>
	</div>



	<jsp:include page="../Reduce/Footer.jsp" />
</body>
</html>
