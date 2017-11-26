<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@page session="true"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<title>Sistema de Reclutamiento</title>
<link rel="icon" type="image/x-icon"
	href="<s:url value="/resources/img/favicon.ico"/>" />
<link href="<c:url value="/resources/css/open-iconic-bootstrap.css" />"
	rel="stylesheet">
	
<style>
.error {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #a94442;
	background-color: #f2dede;
	border-color: #ebccd1;
}

.msg {
	padding: 15px;
	margin-bottom: 20px;
	border: 1px solid transparent;
	border-radius: 4px;
	color: #31708f;
	background-color: #d9edf7;
	border-color: #bce8f1;
}

#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
	
</head>

<body onload='document.loginForm.username.focus();'>
	<div class="container">
		<div class="row vertical-offset-100">
			<div class="col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="row-fluid user-row">
							<img src="<c:url value="/resources/img/imgLogin.png"/>" class="img-responsive" alt="" />
						</div>
					</div>
					<div class="panel-body">
					
					

		<c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
					
						<form name='loginForm' action="<c:url value='/login' />" method='POST'>
							<!--                             <form id="needs-validation" action="menu.htm" method="post" accept-charset="UTF-8" role="form" class="form-signin" novalidate> -->
							<fieldset>
								<label class="panel-login">
									<div class="login_result"></div>
								</label>
								<div class="input-group">
									<input style="margin-bottom: 5px;" class="form-control" name="username" placeholder="Usuario EJ: 1.234.567-0" id="username" type="text" required>
								</div>
									<input class="form-control" name="password" placeholder="Contraseña" id="password" type="password" required>
								<p></p>
								<br> <input class="btn btn-lg btn-success btn-block" name="submit" type="submit" id="login" value="Iniciar Sesion »">
							</fieldset>
							<br> 
							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />	
						</form>
						<!--                            <div class="card-footer text-muted">
                                <a href="<c:url value = "registrarse.htm"/>">Registrarseaaguygyguygyu</a>
                            </div>-->
					</div>

				</div>
			</div>
		</div>
	</div>



</body>
</html>
