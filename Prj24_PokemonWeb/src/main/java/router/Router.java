package router;

import java.io.IOException;

import org.json.JSONArray;

import database.PokemonDAO;
import database.PokemonDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(value = {"/", "/home","/indice"})
public class Router extends HttpServlet {
	
	private PokemonDAO dao;
	
	public Router() {
	System.out.println("Oggetto Router costruito");
	this.dao = new PokemonDAOImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		JSONArray array = new JSONArray(this.dao.getPokemons());
		resp.setContentType("application/json");
		resp.getWriter().print(array.toString());
		
//		resp.getWriter().print("Funziona" + this.dao.getPokemons().toString());
		
		System.out.println("Chiamata get via GET");
	}
	
	
}
