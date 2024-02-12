package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import demo.Canzone;

public class CanzoneDAOImpl implements CanzoneDAO {
	
	private Connessione connessione;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public CanzoneDAOImpl() {
		this.connessione = new Connessione();
		this.connessione.connetti();
	}
	
	@Override
	public void addCanzone(Canzone c) {
		try {
//			Preparo la query parametrica
			this.ps = this.connessione.getConn().prepareStatement(ADD);
//			binding parameters
			this.ps.setString(1, c.getTitolo());
			this.ps.setString(2, c.getAutore());
			
			this.ps.execute();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateCanzone(Canzone c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCanzone(Canzone c) {
		// TODO Auto-generated method stub

	}

	@Override
	public Canzone getCanzoneById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Canzone> getCanzoni() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Canzone> getCanzoniByAnno(int anno) {
		// TODO Auto-generated method stub
		return null;
	}

}
