package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Canzone;

public class FilmDAOImpl implements FilmDAO {
	
	private Connessione connessione;
	private Statement statement;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public FilmDAOImpl() {
		this.connessione = new Connessione();
		this.connessione.connetti();
	}
	
	
	@Override
	public void addFilm(Canzone f) {
		
		try {
//			Preparo la query parametrica
			this.ps = this.connessione.getConn().prepareStatement(ADD);
//			binding parameters
			this.ps.setString(1, f.getTitolo());
			this.ps.setInt(2, f.getAnno());
			this.ps.setDouble(3, f.getRating());
			
			this.ps.execute();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateFilm(Canzone f) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteFilm(Canzone f) {
		// TODO Auto-generated method stub

	}

	@Override
	public Canzone getFilmById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Canzone> getFilms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Canzone> getFilmsByAnno(int anno) {
		ArrayList<Canzone> filmDaRitornare = new ArrayList<Canzone>();
		try {
			this.ps = this.connessione.getConn().prepareStatement(GET_BY_YEAR);
			this.ps.setInt(1, anno);
			this.rs = this.ps.executeQuery();
			
			while (this.rs.next()) {
				Canzone f = new Canzone();
				f.setTitolo(rs.getString("titolo"));
				f.setAnno(rs.getInt("anno"));
				f.setId(rs.getInt("id"));
				f.setRating(rs.getDouble("rating"));
				
				filmDaRitornare.add(f);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return filmDaRitornare;
	}

}
