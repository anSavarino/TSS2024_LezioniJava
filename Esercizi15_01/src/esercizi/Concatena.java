package esercizi;

import java.util.Scanner;

public class Concatena {

	public static void main(String[] args) {
		/*Scrivere un programma Concatena che chiede all'utente di inserire tre singole parole e le ristampa
		interponendovi un asterisco.
		Per esempio, se l'utente inserisce "gatto", "cane" e "topo" il programma stamperà
		gatto*cane*topo.
		Per concatenare le tre parole si utilizzi un metodo ausiliario che prende due stringhe e restituisce la stringa
		ottenuta concatenando la prima parola ricevuta, un asterisco e la seconda parola ricevuta.*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci 3 singole parole");
		String parola1 = scanner.nextLine();
		String parola2 = scanner.nextLine();
		String parola3 = scanner.nextLine();
		
		System.out.println(concatenaAusiliario(concatenaAusiliario(parola1, parola2), parola3));
	}

	private static String concatenaAusiliario(String parola1, String parola2) {
		// TODO Auto-generated method stub
		return parola1 + "*" + parola2;
		
	}

}
