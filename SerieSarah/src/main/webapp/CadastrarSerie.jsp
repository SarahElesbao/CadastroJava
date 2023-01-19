<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="icon" href="img/Slogo.png" >
<link rel="stylesheet" href="css/serieStyle.css">

<meta charset="ISO-8859-1">
<title>SarahFLIX</title>
</head>
<body>
	<nav class="serieNav">
		<ul>
			<li>SarahFLIX</li>
		</ul>
	</nav>
	<main>
		<style>
			body{background-image: url("seriesfundo.jpg");}
		</style>
		
		<form action="cadastrar" name= "frmSerie" method="post" class="serieForm">
				<h2>vamos cadastrar uma s�rie?</h2><br>
				<input type= "text" name = "nomeSerie" placeholder = "Nome da S�rie"><br>
				<input type= "text" name = "genero" placeholder = "G�nero"><br>
				<input type= "text" name = "sinopse" placeholder = "Sinopse"><br>
				<input type= "text" name = "nome" placeholder = "Nome do Ator"><br>
				<input type= "text" name = "idade" placeholder = "Idade"><br>
				<input type= "text" name = "personagem" placeholder = "Personagem"><br>
				<input type= "text" name = "nomeLugar" placeholder = "Nome do Local gravado na s�rie"><br>
				<input type= "text" name = "pais" placeholder = "Pa�s origem da s�rie"><br>
				<input type= "text" name = "estacaoAno" placeholder = "Esta��o do ano"><br>
			<div>
				<input id="serieButton" type="submit" name="salvar" value="Cadastrar S�rie" onclick="validar()">
			</div>
		</form>
		<script src="scripts/validador.js"></script>
	</main>
</body>
</html>