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
<title>Reserva salvar</title>
</head>
<body>
<div align="center">
		<div>
			<h1 style="Text-align: center,">Sistema de Controle de Lamis</h1>
			<br>
	<form action="ReservaSalvar" method="post">
	${erro}
	<br>
		<input type="hidden" name="idUsuario" value="${usuario.id}">
		Selecione o Lami:
		<select name="lami">
			<option>Selecione</option>
			<c:forEach var="lami" items="${lamis }">
				<option value="${lami.id}">${lami.nome}</option>
			</c:forEach>
		</select>
		<br><br>
		Data da reserva: <input type="date" name="data"><br><br>
		Hora de inicio: <input type="time" name="horaInicio"><br><br>
		Hora Final: <input type="time" name="horaFinal"><br><br>
		Professor: <input type="text" name="objetivo"><br><br>
		Disciplina: <input type="text" name="descricao"><br><br>
		<button type="submit">Salvar</button><br><br>
		<a href="./ReservaLista"><button type="button">Voltar</button></a><br><br>
		
	</form>
		</div>
	</div>
</body>
</html>