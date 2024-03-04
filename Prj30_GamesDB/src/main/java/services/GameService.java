package services;

import java.util.Collection;
import java.util.Map;

import entities.Game;
import repos.GameDAOImpl;
import repos.GameDAO;

public class GameService {

	private GameDAO dao;
	private Map<Integer, Game> games;
	
	public GameService() {
		this.dao = new GameDAOImpl();
		this.games = this.dao.findAll();
	}
	
	public Map<Integer, Game> getGames() {
		return games;
	}
	
	public Collection<Game> getGamesCollection(){
		return this.games.values();
	}
	
	public Game getGameByID(Integer id) {
		return this.games.get(id);
	}
}
