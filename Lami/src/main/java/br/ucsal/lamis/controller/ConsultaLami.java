package br.ucsal.lamis.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.lamis.util.Repositorio;
@WebServlet("/ConsultaLami")
public class ConsultaLami {
	private static final long serialVersionUID = 1L;
    
	   

    public ConsultaLami() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Repositorio repositorio = (Repositorio) request.getSession().getServletContext().getAttribute("repositorio");
		request.setAttribute("consultas", repositorio.getconsultas());
		request.getRequestDispatcher("consultaLami.jsp").forward(request, response);
	}
	
}
