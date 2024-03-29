package database;

import java.sql.SQLException;
import java.util.List;

import model.Studente;

public interface StudenteDAO {

	String GET_ALL = "SELECT * FROM studenti";
	String GET_ONE = "SELECT * FROM studenti where id = ";
	
	List<Studente> findAll() throws SQLException;
	Studente findStudenteByID(int id);
	
}
