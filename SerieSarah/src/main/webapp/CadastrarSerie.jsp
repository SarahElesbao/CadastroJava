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
				<h2>vamos cadastrar uma série?</h2><br>
				<input type= "text" name = "nomeSerie" placeholder = "Nome da Série"><br>
				<input type= "text" name = "genero" placeholder = "Gênero"><br>
				<input type= "text" name = "sinopse" placeholder = "Sinopse"><br>
				<input type= "text" name = "nome" placeholder = "Nome do Ator"><br>
				<input type= "text" name = "idade" placeholder = "Idade"><br>
				<input type= "text" name = "personagem" placeholder = "Personagem"><br>
				<input type= "text" name = "nomeLugar" placeholder = "Nome do Local gravado na série"><br>
				<input type= "text" name = "pais" placeholder = "País origem da série"><br>
				<input type= "text" name = "estacaoAno" placeholder = "Estação do ano"><br>
			<div>
				<input id="serieButton" type="submit" name="salvar" value="Cadastrar Série" onclick="validar()">
			</div>
		</form>
		<script src="scripts/validador.js"></script>
	</main>
</body>
</html>