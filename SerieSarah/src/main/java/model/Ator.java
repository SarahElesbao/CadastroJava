package model;

import dao.MySqlConnection;

public class Ator {
	private Integer codAtor;
	private String nome;
	private String idade;
	private String personagem;
	
	public Ator() {
		
	}
	
	public Ator(int codAtor, String nome, String idade, String personagem) {
		this.codAtor = codAtor;
		this.nome = nome;
		this.idade = idade;
		this.personagem = personagem;	
	}
	
	public Ator(String nome, String idade, String personagem) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.personagem = personagem;
	}

	public Integer getCodAtor() {
		return codAtor;
	}
	
	public void setCodAtor(Integer codAtor) {
		this.codAtor = codAtor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public void setIdade(String string) {
		this.idade = string;
	}
	
	public String getPersonagem() {
		return personagem;
	}
	
	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}
	
	public void salvar() {
		new MySqlConnection().inserirAtor(this);
	}
}
