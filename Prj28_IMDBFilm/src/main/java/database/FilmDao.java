package database;

import java.util.List;

import model.Film;

public interface FilmDao {

	String GET_ALL = "SELECT * from imdb_top_top250";
	String GET_BY_ID = "SELECT * from imdb_top_top250 where id = ?";
	
	List<Film> getFilm();
	Film getFilmByID(int id);
	
}
