<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="pt">

<head>
	<jsp:include page="header.jsp">
		<jsp:param value="Cadastro de Alunos - Login" name="title"/>
	</jsp:include>
</head>
<body>
	<!-- Header -->
	<div id="header">
		
		<div class="page-full-width cf">
	
			<div id="login-intro" class="fl">
			
				<h1>Acesso ao Sistema</h1>
				<h5>Entre com os dados de acesso abaixo</h5>
			
			</div> <!-- login-intro -->
			
			<!-- Logo da Aplicação -->
			<!-- Esse logo será automaticamente redimensionado para 39px height. -->
			<a href="#" id="company-branding" class="fr"><img src="images/logo_impacta.jpg" alt="Impacta" /></a>
			
		</div> <!-- end full-width -->	

	</div> <!-- fim header -->
	
	<!-- Formulário Principal -->
	<div id="content">
		<form action="validaServlet" method="POST" id="login-form">
			<fieldset>
			
				<p>
					<label for="login-username">Usuário: </label>
					<input type="text" id="login-username" class="round full-width-input" autofocus name="login" />
				</p>

				<p>
					<label for="login-password">Senha: </label>
					<input type="password" id="login-password" class="round full-width-input" name="senha"/>
				</p>
				
				<p><a href="#">Esqueci minha senha.</a></p>
				
				<input type="submit" class="button round blue image-right ic-right-arrow" value="Acessar">

				<%
					//String message = (String)request.getAttribute("message");
					//if(!(message == null || message.equals(""))) {
				%>
				
				<c:if test="${not empty message or message == ''}" >
					<br /><br />
						<div class="error-box round">
							${message}
						</div>
				</c:if>
						
				<%
					//}
				%>
				
			</fieldset>
		</form>
		
	</div> <!-- fim formulário principal -->
	
</body>
</html>