package router;

import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;

import org.json.JSONArray;

import database.PokemonDAO;
import database.PokemonDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Pokemon;

@WebServlet(value = { "/pokemon" })
public class PokemonMVC extends HttpServlet {

	private PokemonDAO dao;

	public PokemonMVC() {
		System.out.println("Oggetto Router costruito");
		this.dao = new PokemonDAOImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Chiamata get via GET");
		
		if (req.getParameter("tipo")!= null) {
			req.setAttribute("elenco",this.dao.getPokemonsByType(req.getParameter("tipo"))); //add attribute alla req dellapagina			
		}else {
			req.setAttribute("elenco", this.dao.getPokemons());
		}
		
		TreeSet<String> tipi = new TreeSet();
		for (Pokemon p : this.dao.getPokemons()) {
			String s = p.getTipo();
			tipi.add(s);
		}
		
		req.setAttribute("tipi",tipi); //add attribute alla req dellapagina
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
	}

}
