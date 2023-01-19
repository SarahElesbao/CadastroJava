package model;

import dao.MySqlConnection;

public class Serie {
	private Integer codSerie;
	private String nomeSerie;
	private String genero;
	private String sinopse;
	
	public Serie() {
		
	}
	
	public Serie(String nomeSerie, String genero, String sinopse) {
		super();
		this.nomeSerie = nomeSerie;
		this.genero = genero;
		this.sinopse = sinopse;
	}

	public Serie(Integer codSerie, String nomeSerie, String genero, String sinopse) {
		super();
		this.codSerie = codSerie;
		this.nomeSerie = nomeSerie;
		this.genero = genero;
		this.sinopse = sinopse;
	}

	public Integer getCodSerie() {
		return codSerie;
	}
	
	public void setCodSerie(Integer codSerie) {
		this.codSerie = codSerie;
	}
	
	public String getNomeSerie() {
		return nomeSerie;
	}
	
	public void setNomeSerie(String nomeSerie) {
		this.nomeSerie = nomeSerie;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public void salvar() {
		new MySqlConnection().inserirSerie(this);
	}
}
