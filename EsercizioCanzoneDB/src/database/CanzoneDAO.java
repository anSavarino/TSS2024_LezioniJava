package database;

import java.util.ArrayList;

import demo.Canzone;



public interface CanzoneDAO {

	String ADD = "INSERT into canzoni(titolo, autore) values(?,?)";
	String DELETE = "DELETE from canzoni where id = ?";
	String GET_ALL = "select * from canzoni";
	String GET_BY_ID = "select * from canzoni where id = ?";
	String GET_BY_YEAR = "select * from canzoni where anno = ?";
	
	
	
	void addCanzone(Canzone c);
	void updateCanzone(Canzone c);
	void deleteCanzone(Canzone c);
	
	Canzone getCanzoneById();
	ArrayList<Canzone> getCanzoni();
	ArrayList<Canzone> getCanzoniByAnno(int anno);
}
