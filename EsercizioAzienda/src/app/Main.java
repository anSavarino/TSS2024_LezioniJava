package app;
import model.Azienda;
import model.Impiegato;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Azienda azienda = new Azienda();
		
		System.out.println("Quanti impiegati vuoi aggiungere?");
		int numAggiunti = scanner.nextInt();
		
		for (int i = 0; i < numAggiunti; i++) {
			scanner.nextLine();
			System.out.println("Inserisci impiegato n"+(i+1));
			System.out.println("Nome:");
			String nome = scanner.nextLine();
			System.out.println("Cognome:");
			String cognome = scanner.nextLine();
			System.out.println("Anno di nascita:");
			int annoDiNascita = scanner.nextInt();
			System.out.println("Stipendio:");
			int stipendio = scanner.nextInt();
			Impiegato imp = new Impiegato();
			imp.setNome(nome);
			imp.setCognome(cognome);
			imp.setAnnoDiNascita(annoDiNascita);
			imp.setStipendio(stipendio);
			imp.setId();
			azienda.addImpiegato(imp);
		}
		
		System.out.println("Stipendio totale: "+azienda.stipendioTOT());

	}
	
}
