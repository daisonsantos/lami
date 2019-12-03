<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reserva lista</title>
</head>
<body>
<div align="center">
		<div>
			<h1 style="Text-align: center,">Sistema de Controle de Lamis</h1>
			<br>
			<fieldset>



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
					<td>${r.laboratorio.nome}</td>
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
	<br><br>
	<a href="ReservaForm"><button type="button">Nova Reserva</button></a><br><br>

<a href="Painel"><button type="button">Voltar</button></a><br><br>
	</fieldset>
		</div>
	</div>
</body>
</html>