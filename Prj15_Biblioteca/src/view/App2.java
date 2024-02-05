package view;

import java.io.File;
import java.util.ArrayList;

import controller.Libreria;
import model.Libro;
import util.LeggiScriviFile;

public class App2 {

	public static void main(String[] args) {
		Libreria libRagazzi = new Libreria("Libri per ragazzi");
		File sorgente = new File("Z:\\biblioteca2.csv");
		ArrayList<String> lettura =LeggiScriviFile.leggi(sorgente);
		
		for (String string : lettura) {
			System.out.println(string);
		}
	}

}
