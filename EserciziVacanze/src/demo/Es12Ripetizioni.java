package demo;
import java.util.Scanner;

public class Es12Ripetizioni {

	public static void main(String[] args) {
		/*
		 1.12. Esercizio Ripetizioni
		Scrivere un programma Ripetizioni che chiede all’utente di inserire una sequenza di
		caratteri (chiedendo prima quanti caratteri voglia inserire) e li ristampa man mano che
		vengono inseriti.
		L’intero procedimento (chiedere quanti caratteri voglia inserire, leggere i caratteri e man
		mano stamparli) dovrà essere ripetuto 5 volte.
		*/
		
		Scanner mioscanner = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Quanti caratteri vuoi inserire?");
			int numChar = mioscanner.nextInt();
			System.out.println("Inserisci "+numChar+" caratteri");
			char carattere = ' ';
			for (int j = 0; j < numChar; j++) {
				carattere = mioscanner.next().charAt(0);
				System.out.println(carattere);
			}
		}
		System.out.println("Programma Terminato");
	}

}
