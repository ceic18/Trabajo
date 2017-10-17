<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>  

<nav class="navbar navbar-expand-lg navbar-light bg-light sticky-top">
    <a class="navbar-brand" href="<c:url value = "/menu.htm"/>">
        <img src="<s:url value="/resources/img/Home.png"/>" width="30" height="30" class="d-inline-block align-top" alt="">

    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
        <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Menu Secretaria
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="<c:url value = "/menuSecretaria.htm"/>">Ingresar Curriculum</a>
                    <a class="dropdown-item" href="<c:url value = "/menuPsicologo.htm"/>">Modificar Curriculum</a>
                    <a class="dropdown-item" href="<c:url value = "/menuRecursosHumanos.htm"/>">Buscar Curriculum</a>
                </div>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Menu Psicologo
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="<c:url value = "/menuSecretaria.htm"/>">Realizar Prueba Psicologica</a>
                    <a class="dropdown-item" href="<c:url value = "/menuPsicologo.htm"/>">Realizar Evaluacion Postulante</a>
                </div>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Menu Recursos Humanos
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="<c:url value = "/menuSecretaria.htm"/>">Ver Postulaciones</a>
                </div>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Menu Usuario
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="<c:url value = "/menuSecretaria.htm"/>">Realizar Prueba de Conocimiento</a>
                    <a class="dropdown-item" href="<c:url value = "/menuPsicologo.htm"/>">Ver estado Postulacion</a>
                </div>
            </li>
        </ul>
        <form action="/Sistema-de-reclutamiento-master/index.htm" class="form-inline my-2 my-lg-0">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Cerrar Sesion</button>
        </form>
    </div>
</nav>
