/**
 * validar formulário
 */

 function validar(){
	 let nomeSerie = frmSerie.nomeSerie.value
	 let genero = frmSerie.genero.value
	 let sinopse = frmSerie.sinopse.value
	 let nomeAtor = frmSerie.nomeAtor.value
	 let personagem = frmSerie.personagem.value
	 let pais= frmSerie.pais.value
	 if(nomeSerie === ""){
		 alert('preencha o campo nome da série')
		 frmSerie.nomeSerie.focus()
		 return false
	 } else if(genero === ""){
		 alert('preencha o campo gênero')
		 frmSerie.genero.focus()
		 return false
	 } else if(sinopse === ""){
		 alert('preencha o campo sinopse')
		 frmSerie.sinopse.focus()
		 return false
	 } else if(nomeAtor === ""){
		 alert('preencha o campo nome do ator')
		 frmSerie.nomeAtor.focus()
		 return false
	 } else if(personagem === ""){
		 alert('preencha o campo personagem')
		 frmSerie.personagem.focus()
		 return false		 
	 } else if(pais === ""){
		 alert('preencha o campo país')
		 frmSerie.pais.focus()
		 return false		 
	 } else{
		 document.forms["frmSerie"].submit()
	 }
 }