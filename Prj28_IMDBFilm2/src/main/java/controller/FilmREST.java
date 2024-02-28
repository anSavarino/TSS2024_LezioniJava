package controller;

import java.io.IOException;

import org.json.JSONArray;

import database.FilmDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/all")
public class FilmREST extends HttpServlet {

	FilmDAOImpl dao = new FilmDAOImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		System.out.println(dao.getFilm());
		
		JSONArray arrayFilm;
		
		if(req.getParameter("dal")!= null && req.getParameter("al")!= null) {
			int dal = Integer.parseInt(req.getParameter("dal"));
			int al = Integer.parseInt(req.getParameter("al"));
			
			arrayFilm = new JSONArray(dao.getFilmByYears(dal, al));
			
		}else {
			arrayFilm = new JSONArray(dao.getFilm());
		}
		
		resp.setContentType("application/json");
		
		resp.getWriter().print(arrayFilm.toString());
	}
	
	
}
