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
<title>Novo Lami </title>
</head>
<body>
<div align="center">
		<div>
			<h1 style="Text-align: center,">Sistema de Controle de Lamis</h1>
			<br>
	<form action="./LamiSalvar" method="post">
		<input name="id" type="hidden" value="${lami.id}"> <br><br>
		Nome: <input
			type="text" name="nome" value="${lami.nome}"> <br>
		
			<br><br>
		Pavilhão: <select name="bloco">
					<option value="">Selecione</option>
					<c:forEach var="bloco" items="${blocos}">
						<option value="${bloco.id}" ${ bloco.id == lami.bloco.id ? 'selected' : ''} >${bloco.nome} </option>
					</c:forEach>

		</select><br>
<br><br>
		<button type="submit">Salvar</button><br><br>
		<div align="right"><br><br>
		<a href="./lamiLista"><button type="button">Voltar</button></a><br><br>
		
	</form>

		</div>
	</div>
</body>
</html>