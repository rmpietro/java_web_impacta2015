<%@page language="java" contentType="text/html; charset=utf-8" 
	isErrorPage="true" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt">
<head>
	<jsp:include page="header.jsp">
		<jsp:param value="Cadastro de Alunos - Erro" name="title"/>
	</jsp:include>
</head>
<body>
	<!-- Header -->
	<div id="header">
		<div class="page-full-width cf">
			<div id="login-intro" class="fl">
				<h1>Erro!</h1>
				<h5>Ocorreu um erro na aplicação.</h5>
			</div> <!-- login-intro -->
			
			<!-- Logo da Aplicação -->
			<!-- Esse logo será automaticamente redimensionado para 39px height. -->
			<a href="#" id="company-branding" class="fr"><img src="images/logo_impacta.jpg" alt="Impacta" /></a>
		</div> <!-- end full-width -->
	</div> <!-- fim header -->
	
	<!-- Formulário Principal -->
	<div id="content">
		<h1>404 - A página solicitada não existe ou não está disponível!</h1>
		<h3>Descrição: Entre em contato com o administrador!</h3>
	</div> 
	<!-- fim formulário principal -->
</body>
</html>


