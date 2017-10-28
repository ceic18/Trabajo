<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>  
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@page session="true"%>

<nav style="text-align: left" class="navbar navbar-expand-lg navbar-light bg-light sticky-top">
    <a class="navbar-brand" href="<c:url value = "/menu"/>">
        <img src="<s:url value="/resources/img/Home.png"/>" width="30" height="30" class="d-inline-block align-top" alt="">

    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    
    	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>
    
    

    <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
        <sec:authorize access="hasAnyRole('ROLE_SECRETARIA', 'ROLE_ADMIN')">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Menu Secretaria
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="<c:url value = "ingresarCurriculum"/>">Ingresar Curriculum</a>
                    <a class="dropdown-item" href="<c:url value = "modificarCurriculum"/>">Modificar Curriculum</a>
                    <a class="dropdown-item" href="<c:url value = "buscarCurriculum"/>">Buscar Curriculum</a>
                </div>
            </li>
         </sec:authorize>
         <sec:authorize access="hasAnyRole('ROLE_PSICOLOGO', 'ROLE_ADMIN')">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Menu Psicologo
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="<c:url value = "pruebaPsicologica"/>">Realizar Prueba Psicologica</a>
                    <a class="dropdown-item" href="<c:url value = "evaluarPostulante"/>">Realizar Evaluacion Postulante</a>
                </div>
            </li>
          </sec:authorize>
          <sec:authorize access="hasAnyRole('ROLE_RRHH', 'ROLE_ADMIN')">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Menu Recursos Humanos
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="<c:url value = "verPostulaciones"/>">Ver Postulaciones</a>
                </div>
            </li>
          </sec:authorize>
          <sec:authorize  access="hasAnyRole('ROLE_USER', 'ROLE_ADMIN')">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Menu Usuario
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="<c:url value = "pruebaConocimiento"/>">Realizar Prueba de Conocimiento</a>
                    <a class="dropdown-item" href="<c:url value = "verEstado"/>">Ver estado Postulacion</a>
                </div>
            </li>
          </sec:authorize>
        </ul>
        <form action="/Sistema-de-reclutamiento-master/index.htm" class="form-inline my-2 my-lg-0">
            <button class="btn btn-outline-success my-2 my-sm-0" onclick="javascript:formSubmit()" type="button">Cerrar Sesion</button>
        </form>
    </div>
</nav>
