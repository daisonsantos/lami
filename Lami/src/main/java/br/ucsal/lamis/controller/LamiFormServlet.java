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
 * Servlet implementation class LaboratorioForm
 */
@WebServlet("/lamiForm")
public class LamiFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sid = request.getParameter("id");
		Lami lami = null;
		Repositorio repositorio = (Repositorio) request.getSession().getServletContext().getAttribute("repositorio");
		if(sid !=null ) {
			lami = repositorio.obterLami(Integer.parseInt(sid));
		}
		request.setAttribute("lami", lami);
		request.setAttribute("blocos", repositorio.getBlocos());
		request.getRequestDispatcher("lamiForm.jsp").forward(request, response);
		
	}


}
