<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
  background: url(C:/Users/100923376/git/lami/Lami/WebContent/login.jpg) no-repeat;
  background-size: 1000px 1000px;
}
</style>
<meta charset="UTF-8">
<title>Lista Lamis</title>
</head>
<body>
<div align="center">
		<div>
			<h1 style="Text-align: center,">Sistema de Controle de Lamis</h1>
			
			<br>
	<table border="1">
		<thead>
			<tr>
				<th>Nome do lami</th>
				  <th>Prédio escolhido</th>  
				<th>editar/excluir</tr>
		</thead>
		<tbody>
			<c:forEach var="l" items="${lamis}">
			<tr>
				<td>${l.nome}</td>
				<td>${l.bloco.nome}</td>
				<td><a href='./lamiForm?id=${l.id}'><button type="button">Editar</button></a></td>
				<td><a href='./LamiExcluir?id=${l.id}'><button type="button">Excluir</button></a></td>
			</tr>
			</c:forEach>
		</tbody>

	</table><br><br>
	<a href="./lamiForm" ><button type="button">Registrar Novo Lami</button></a><br><br>
	<div align="right"><br><br>
	<a href="./Painel"><button type="button">Voltar</button></a><br><br>
	</div>
	
	
		</div>
	</div>
</body>
</html>