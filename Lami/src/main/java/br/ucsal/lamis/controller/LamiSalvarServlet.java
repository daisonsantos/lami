package br.ucsal.lamis.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.lamis.model.Lami;
import br.ucsal.lamis.util.Repositorio;

/**
 * Servlet implementation class LaboratorioSalvarServlet
 */
@WebServlet("/LamiSalvar")
public class LamiSalvarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sId = request.getParameter("id");

		String nome = request.getParameter("nome");
		
		String descricao = request.getParameter("descricao");
		
		String sIdBloco = request.getParameter("bloco");

		Repositorio repositorio = (Repositorio) request.getSession().getServletContext().getAttribute("repositorio");

		Lami lami = null;
		if(sId != null && !sId.trim().isEmpty() ) {
			lami = repositorio.obterLami(Integer.parseInt(sId));
		}else {
			lami = new Lami();
		}
		lami.setNome(nome);
		lami.setDescricao(descricao);
		lami.setBloco(repositorio.obterBloco(Integer.parseInt(sIdBloco)));
		repositorio.salvarLami(lami);
		
		response.sendRedirect("./lamiLista");
		
	}

}
