package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import model.Pokemon;

public class PokemonController {
	private ArrayList<Pokemon> pokedex;
	private Scanner sc;
	private PrintWriter pw;
	private File f;
	
	public PokemonController() throws FileNotFoundException {
		this.pokedex = new ArrayList<Pokemon>();
		this.f = new File("files/Pokémon_Tipi.txt");
//		this.pw = new PrintWriter(f);
		this.sc= new Scanner(f);
	}
	
	public ArrayList<Pokemon> leggiFile(){
		this.pokedex.clear();
		while (sc.hasNextLine()) {
			String record = sc.nextLine();
			String parole[] = record.split("\\s+");
			if(parole.length>0 && parole[0].matches(".*\\d.*")) {
				int id = Integer.parseInt(parole[0]);
				String nome = parole[1];
				String tipo = parole[2];
				
				Pokemon p = new Pokemon(id, nome, tipo);
				this.pokedex.add(p);
			}
		}
		return this.pokedex;
	}
	
	public void scriviFile(String nomeFile, ArrayList<Pokemon> listaPokemon) throws FileNotFoundException {
		this.pw = new PrintWriter(new File(nomeFile));
		for (Pokemon p : listaPokemon) {
			pw.println(p.getNome());
		}
		pw.close();
	}
}
