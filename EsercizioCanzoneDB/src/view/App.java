package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import demo.Canzone;


public class App {

	public static void main(String[] args) throws IOException {
		ArrayList<Canzone> canzoni = new ArrayList<>();
		
		File f = new File("files/canzoni2020.csv");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String riga = null;
		
		while ((riga = br.readLine()) != null) {
			String[] split = riga.split(",");
			
			String titolo = split[0];
			String autore = split[1]!= null ? split[1]: "Vari";
			
			Canzone canz = new Canzone(titolo, autore);
			
			canzoni.add(canz);
		}
	}

}
