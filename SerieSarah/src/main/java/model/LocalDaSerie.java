package model;

import dao.MySqlConnection;

public class LocalDaSerie {
	private Integer codLocal;
	private String nomeLugar;
	private String pais;
	private String estacaoAno;
	
	public LocalDaSerie() {
		
	}
	
	public LocalDaSerie(String nomeLugar, String pais, String estacaoAno) {
		super();
		this.nomeLugar = nomeLugar;
		this.pais = pais;
		this.estacaoAno = estacaoAno;
	}

	public LocalDaSerie(Integer codLocal, String nomeLugar, String pais, String estacaoAno) {
		super();
		this.codLocal = codLocal;
		this.nomeLugar = nomeLugar;
		this.pais = pais;
		this.estacaoAno = estacaoAno;
	}

	public Integer getCodLocal() {
		return codLocal;
	}
	
	public void setCodLocal(Integer codLocal) {
		this.codLocal = codLocal;
	}
	
	public String getNomeLugar() {
		return nomeLugar;
	}
	
	public void setNomeLugar(String nomeLugar) {
		this.nomeLugar = nomeLugar;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getEstacaoAno() {
		return estacaoAno;
	}
	
	public void setEstacaoAno(String estacaoAno) {
		this.estacaoAno = estacaoAno;
	}
	
	public void salvar() {
		new MySqlConnection().inserirLocal(this);
	}
}
