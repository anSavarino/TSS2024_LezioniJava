package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Film;

public class FilmDAOImpl implements FilmDao {

	private Connessione myConn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public FilmDAOImpl() {
		this.myConn = new Connessione();
		
	}
	
	
	@Override
	public List<Film> getFilm() {
		
		List<Film> film = new ArrayList<>();
		
		try {
			this.ps = myConn.getConn().prepareStatement(GET_ALL);
			this.rs = this.ps.executeQuery();
			while (this.rs.next()) {
				Film f = new Film();
				f.setId(rs.getInt("id"));
				f.setAnno(rs.getInt("year"));
				f.setTitolo(rs.getString("title"));
				f.setRating(rs.getDouble("rating"));
				film.add(f);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return film;
		
	}

	@Override
	public Film getFilmByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
