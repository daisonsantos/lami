<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<meta charset="ISO-8859-1">
<title>Reserva lista</title>
</head>
<body>
<div align="center">
		<div>
			<h1 style="Text-align: center,">Sistema de Controle de Lamis</h1>
			<br>



	<table border="1">
		<thead>
			<tr>
				<th>Lami</th>
				<th>inicio da reserva</th>
				<th>final da reserva</th>
				<th>Professor</th>
				<th>Disciplina</th>
				<th>Data</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="r" items="${reservas}">
				<tr>
					<td>${r.lami.nome}</td>
					<td>${r.horaInicio}</td>
					<td>${r.horaFinal}</td>
					<td>${r.objetivo} </td>
					<td>${r.descricao} </td>
					<td>${r.data} </td>
					<td><a href="ReservaExcluir?id=${r.id}">Excluir</a></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<br><br><br>
	<a href="ReservaForm"><button type="button">Nova Reserva</button></a><br><br><br>

<a href="Painel"><button type="button">Voltar</button></a><br><br>
		</div>
	</div>
</body>
</html>