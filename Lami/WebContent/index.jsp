<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Laboratorios</title>
<jsp:useBean id="repositorio" class="br.ucsal.lamis.util.Repositorio"
	scope="application" />
</head>
<body>
	<div align="center">
		<div>
			<h1 style="Text-align: center,">Sistema de Controle de Lamis</h1>
			<br>
			<fieldset>
				<form action="./Login" method="post">
					${erro} <br><br> Login: <input name="login" type="text"> <br><br>
					Senha: <input name="senha" type="password"> <br><br>
					<button type="submit">Entrar</button><br><br>
					
				</form>
<a href="./consultaLami"><button type="submit">Clique aqui para consultar lamis</button></a><br>
			</fieldset>
		</div>
	</div>
</body>
</html>

