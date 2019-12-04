<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html>
<head>
<style type="text/css">
body{
  background: url(C:/Users/100923376/git/lami/Lami/WebContent/login.jpg) no-repeat;
  background-size: 1000px 1000px;
}
</style>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Lamis</title>
<jsp:useBean id="repositorio" class="br.ucsal.lamis.util.Repositorio"
	scope="application" />
</head>
<body>

	<div align="center">
		<div>
			<h1 style="Text-align: center,">Sistema de Controle de Lamis</h1>
			<br>
			
				<form action="./Login" method="post">
					${erro} <br><br> Login: <input name="login" type="text"> <br><br>
					Senha: <input name="senha" type="password"> <br><br><br>
					<button type="submit">Entrar</button><br><br><br><br>
					
				</form>
<a href="./ReservaLista"><button type="submit">Clique aqui para consultar lamis</button></a><br>
			
		</div>
	</div>
</body>
</html>

