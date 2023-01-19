package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Ator;
import model.LocalDaSerie;
import model.Serie;

@WebServlet(urlPatterns ={"/ControllerSerie", "/cadastrar"})
public class ControllerSerie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerSerie() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request,response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset-UTF-8");
		
		System.out.println("nomeSerie");
		System.out.println("nomeAtor");
		System.out.println("pais");
		
		System.out.println(request.getParameter("nomeSerie"));
		System.out.println(request.getParameter("nome"));
		System.out.println(request.getParameter("pais"));
		
		request.getRequestDispatcher("CadastrarSerie.jsp");
		if ((request.getParameter("nomeSerie") != null && !request.getParameter("nomeSerie").isEmpty()) &&
				(request.getParameter("genero") != null && !request.getParameter("genero").isEmpty()) &&
				(request.getParameter("sinopse") != null && !request.getParameter("sinopse").isEmpty()) && 
				(request.getParameter("nome") != null && !request.getParameter("nome").isEmpty()) && 
				(request.getParameter("idade") != null && !request.getParameter("idade").isEmpty()) && 
				(request.getParameter("personagem") != null && !request.getParameter("personagem").isEmpty()) && 
				(request.getParameter("nomeLugar") != null && !request.getParameter("nomeLugar").isEmpty()) && 
				(request.getParameter("pais") != null && !request.getParameter("pais").isEmpty()) && 
				(request.getParameter("estacaoAno") != null && !request.getParameter("estacaoAno").isEmpty())) {
			
			String nomeSerie = request.getParameter("nomeSerie");
			String genero = request.getParameter("genero");
			String sinopse = request.getParameter("sinopse");
			
			String nomeAtor = request.getParameter("nome");
			String idade = request.getParameter("idade");
			String personagem = request.getParameter("personagem");
			
			String nomeLugar = request.getParameter("nomeLugar");
			String pais = request.getParameter("pais");
			String estacaoAno = request.getParameter("estacaoAno");

			Serie serie = new Serie(nomeSerie, genero, sinopse);
			serie.salvar();
			
			Ator ator = new Ator(nomeAtor, idade, personagem);
			ator.salvar();
			
			LocalDaSerie local = new LocalDaSerie(nomeLugar, pais, estacaoAno);
			local.salvar();
		}
	}
}