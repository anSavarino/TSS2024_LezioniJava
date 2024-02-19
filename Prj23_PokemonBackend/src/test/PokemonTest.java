package test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import controller.PokemonController;
import database.PokemonDAO;
import database.PokemonDAOImpl;
import model.Pokemon;

public class PokemonTest {

	public static void main(String[] args) {
	
		try {
			PokemonController ctrl = new PokemonController();
			
			ArrayList<Pokemon> pokedex = ctrl.leggiFile();
			pokedex.forEach(p -> System.out.println(p));
			
			ctrl.scriviFile("./files/la_mia_lista_pokemon.txt", pokedex);
			
			PokemonDAO dao = new PokemonDAOImpl();
			
			ArrayList<Pokemon> pFuoco = new ArrayList<Pokemon>();
			for (Pokemon pokemon : pokedex) {
				if (pokemon.getTipo().toLowerCase().contains("fuoco")) {
					pFuoco.add(pokemon);
				}
			}
			
			ctrl.scriviFile("./files/pokemon_fuoco.txt", pFuoco);
			for (Pokemon pokemon : pokedex) {
				dao.addPokemon(pokemon);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
