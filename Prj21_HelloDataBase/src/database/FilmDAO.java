package database;

import java.util.ArrayList;

import model.Canzone;

public interface FilmDAO {
	
	String ADD = "INSERT into film(titolo, anno, rating) values(?,?,?)";
	String DELETE = "DELETE from film where id = ?";
	String GET_ALL = "select * from film";
	String GET_BY_ID = "select * from film where id = ?";
	String GET_BY_YEAR = "select * from film where anno = ?";
	
	
	
	void addFilm(Canzone f);
	void updateFilm(Canzone f);
	void deleteFilm(Canzone f);
	
	Canzone getFilmById();
	ArrayList<Canzone> getFilms();
	ArrayList<Canzone> getFilmsByAnno(int anno);
	
	
}
