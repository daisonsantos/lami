<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Painel</title>
</head>
<body>

 Bem vindo, ${usuario.login}
 
<div align="right"><br>


</div>
<br>
<div align="center">
		<div>
			<h1 style="Text-align: center,">Sistema de Controle de Lamis</h1>
			<br>
			<fieldset>
<a href="./lamiLista"><button type="button">Lista de Lamis</button></a><br><br>
 <a href="./ReservaLista"><button type="button">Reserva de Lamis</button></a><br><br>
 	<a href="./consultaLami"><button type="submit">Clique aqui para consultar lamis</button></a><br><br>
 <a href="./Logout" ><button type="button">Sair</button></a><br><br>
				

			</fieldset>
		</div>
	</div>
</body>
</html>