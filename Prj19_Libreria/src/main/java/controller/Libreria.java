package controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Libro;

@WebServlet("/libri")
public class Libreria extends HttpServlet{
	
	private ArrayList<Libro> libri;
	
	public Libreria() {
		System.out.println("Ho creato Servlet Libreria");	
		this.libri = new ArrayList<Libro>();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("libri", libri);
		request.getRequestDispatcher("libreria.jsp").forward(request, response);
		
//		response.setContentType("text/html");
//		
//		response.getWriter().print("<h1>Libri</h1>");
//		response.getWriter().print("<ul>");
//			
//		for (Libro libro : libri) {
//			response.getWriter().println("<li>"+libro+"</li>");
//		}
//		response.getWriter().print("</ul>");
		
		
		//response.getWriter().append("<h1>Hai chiamato la pagina Libri via Get</h1>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("titolo")!=null) {
			System.out.println("Dentro if");
			String titolo = request.getParameter("author");
			String autore = request.getParameter("name");
			int id = Integer.parseInt(request.getParameter("id"));
			
			System.out.println(id);
			System.out.println(titolo);
			System.out.println(autore);
			
			Libro l = new Libro();
			l.setId(id);
			l.setTitolo(titolo);
			System.out.println(l);
			libri.add(l);
			
		}
		
//		response.getWriter().append("<h1>Hai chiamato la pagina Libri via Post</h1>");
		doGet(request, response);
	
	}
	
	
}
