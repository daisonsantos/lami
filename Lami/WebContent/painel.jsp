<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>Painel</title>
</head>
<body>

 Bem vindo, ${usuario.login}
 

<br>
<div align="center">
		<div>
			<h1 style="Text-align: center,">Sistema de Controle de Lamis</h1>
			<br><br><br>
<a href="./lamiLista"><button type="button">Lista de Lamis</button></a><br><br><br>
 <a href="./ReservaLista"><button type="button">Reserva de Lamis</button></a><br><br><br>
 <a href="./ReservaLista"><button type="submit">Consultar lamis</button></a><br><br><br>
 
 
				

		</div>
	</div>
	<div align="right"><br>
<a href="./Logout" ><button type="button">Sair</button></a><br><br>

</div>
</body>
</html>