package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import model.EccezionePersonalizzata;

public class ProvaEccezioni2 {

	public static void main(String[] args) {

		File f = new File("studenti.txt");
		
		try(Scanner input = new Scanner(f);
			PrintWriter pw = new PrintWriter(f);
			) { //try-with-resources (si chiude da solo)
			
			String[] giorni = {
					"Lunedì",
					"Martedì",
					"Mercoledì",
					"Giovedì",
					"Venerdì",
					"Sabato",
					"Domenica"
			};
			
			for (String giorno : giorni) {
				pw.println(giorno);
				if (giorno.equals("Giovedì")) {
					throw new EccezionePersonalizzata("Giovedì non lavoro!");
				}
			}
			
		} catch (FileNotFoundException e) {
		
			System.err.println("Si è verificato un errore nella lettura/scrittura");
		} catch (EccezionePersonalizzata e) {
			
			System.err.println(e.getMessage());
		}
		System.out.println("Game Over");
	}

}
