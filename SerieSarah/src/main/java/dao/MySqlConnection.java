package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.Ator;
import model.LocalDaSerie;
import model.Serie;

public class MySqlConnection {
	private String driver = "com.mysql.cj.jdbc.Driver";
    private String url ="jdbc:mysql://localhost:3306/mvc?useTimezone=true&serverTimezone=UTC";
    private String user = "root";
    private String password = "1234567890";

    public Connection createConnection() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	public void inserirSerie(Serie serie) {
		String create = "insert into serie (codSerie, nomeSerie, genero, sinopse) values (null, ?, ?, ?)";
		try {
			Connection con = createConnection();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, serie.getNomeSerie());
			pst.setString(2, serie.getGenero());
			pst.setString(3, serie.getSinopse());
			pst.execute();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void inserirAtor(Ator ator) {
		String create2 = "insert into ator (codAtor, nome, personagem, idade) values (null, ?, ?, ?)";
		try {
			Connection con = createConnection();
			PreparedStatement pst = con.prepareStatement(create2);
			pst.setString(1, ator.getNome());
			pst.setString(2, ator.getPersonagem());
			pst.setString(3, ator.getIdade());
			pst.execute();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void inserirLocal(LocalDaSerie local) {
		String create3 = "insert into localdaserie (codLocal, nomeLugar, pais, estacaoAno) values (null, ?, ?, ?)";
		try {
			Connection con = createConnection();
			PreparedStatement pst = con.prepareStatement(create3);
			pst.setString(1, local.getNomeLugar());
			pst.setString(2, local.getPais());
			pst.setString(3, local.getEstacaoAno());
			pst.execute();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}