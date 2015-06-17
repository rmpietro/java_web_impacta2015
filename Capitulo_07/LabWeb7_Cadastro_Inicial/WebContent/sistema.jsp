<%-- Inserir imports na diretiva page --%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="pt">
<head>

<%--Inserir a página header.jsp nesse ponto por meio da diretiva include --%>

<title>Cadastro de Alunos - Sistema</title>
</head>

<body>
	<!-- TOP BAR -->
	<div id="top-bar">
		<div class="page-full-width cf">
			<form method="POST" action="sair">
				<ul id="nav" class="fl">
					<li><input type="submit" class="round button dark menu-logoff image-left" value="Sair" /></li>
				</ul>
			</form>
		</div>
	</div>

	<!-- HEADER -->
	<div id="header-with-tabs">
		<div class="page-full-width cf">
			<ul id="tabs" class="fl">
				<li><a href="sistema.jsp" class="active-tab">Cadastro</a></li>
				<li><a href=#>Outra página qualquer</a></li>
			</ul>
			<!-- end tabs -->

			<a href="#" id="company-branding-small" class="fr"><img
				src="images/logo_impacta.jpg" alt="Impacta" /></a>
		</div>
	</div>
	<!-- FIM header -->

	<!-- CONTEÚDO PRINCIPAL -->
	<div id="content">
		<div class="page-full-width cf">
			<div class="content-module">
				
				<div class="content-module-heading cf">
					<h3 class="fl">Cadastro Geral de Alunos</h3>
					<span class="fr expand-collapse-text">Clique para comprimir</span> <span
						class="fr expand-collapse-text initial-expand">Clique para expandir</span>
				</div>
				<!-- FIM content-module-heading -->

				<div class="content-module-main">
					<table>
						<thead>
							<tr>
								<th><input type="checkbox" id="table-select-all"></th>
								<th>Nome</th>
								<th>Sobrenome</th>
								<th>Email</th>
								<th>Idade</th>
								<th>Ações</th>
							</tr>
						</thead>
						<tfoot>
							<tr>
								<td colspan="5" class="table-footer"><label
									for="table-select-actions">Executar nos itens selecionados:</label> 
									<select id="table-select-actions">
										<option value="option1">Apagar</option>
										<option value="option2">Exportar</option>
										<option value="option3">Arquivar</option>
									</select> 
									<a href="#" class="round button blue text-upper small-button">
										Aplicar a todos os selecionados
									</a>
								</td>
							</tr>
						</tfoot>

						<tbody>
							<%--Início do bloco de repetição --%>
							<tr>
								<td><input type="checkbox"></td>
								<td><%--Nome do aluno vai aqui --%></td>
								<td><%--Usuário do aluno vai aqui --%></td>
								<td><a href="#"><%--Email do aluno vai aqui --%></a></td>
								<td><%--Idade do aluno vai aqui --%></td>
								<td><a href="#" class="table-actions-button ic-table-edit"></a>
									<a href="#" class="table-actions-button ic-table-delete"></a></td>
							</tr>
							<%--Fim do bloco de repetição --%>
						</tbody>
					</table>

					<div class="stripe-separator">
						<!--  -->
					</div>
				<p> Em caso de qualquer problema, contacte o Administrador.
				</div>
				<!-- FIM content-module-main -->

			</div>
			<!-- FIM content-module -->

			<div class="content-module">
				<div class="content-module-heading cf">
					<h3 class="fl">Cadastro Geral de Professores</h3>
					<span class="fr expand-collapse-text">Clique para comprimir</span> <span
						class="fr expand-collapse-text initial-expand">Clique para expandir</span>
				</div>
				<div class="content-module-main">
					<h3>Funcionalidades a serem inseridas no futuro...</h3>
				</div>
			</div>
	
		</div>
		<!-- FIM Content-module adicional -->

	</div>
	<!-- FIM content -->
</body>
</html>