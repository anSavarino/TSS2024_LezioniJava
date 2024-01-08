package modelli;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class RegistroProva {
	public static void main(String[] args) throws FileNotFoundException {
	
		Registro reg1 = new Registro();
		
		Scanner scanner = new Scanner(new File("studenti.txt")); 
		int pos = 0;
		while (scanner.hasNextLine()) {
			String riga = scanner.nextLine();
			String[] parole = riga.split(",");
			
			String nome = parole[0];
			String cognome = parole[1];
			int annoNascita = Integer.parseInt(parole[2]);
			
			Studente temp = new Studente(nome, cognome, annoNascita);
			reg1.aggiungiStudente(temp, pos++);
		}
		
//		Studente s1 = new Studente("Angelo", "Savarino", 1993);
//		Studente s2 = new Studente("Mario", "Rossi", 1991);
		
//		s1.nome = "Pippo";
//		s2.nome = "Paperino";
		
		reg1.nomeCorso = "Corso A";
//		reg1.aggiungiStudente(s1, 0);
//		reg1.aggiungiStudente(s2, 1);
		
		reg1.faiAppello();
	}
}
