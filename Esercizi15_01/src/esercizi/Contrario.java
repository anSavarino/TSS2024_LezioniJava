package esercizi;

import java.util.Scanner;

public class Contrario {

	public static void main(String[] args) {
		/*Scrivere un programma Contrario che chiede all’utente di inserire una stringa e la stampa al contrario.
		Per esempio, se si immette la stringa "Viva Java", il programma stampa "avaJ aviV"*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa");
		String stringa = scanner.nextLine();
		char[] arrayStringa = stringa.toCharArray();
		char[] arrayRisultato = new char[arrayStringa.length];
		for (int i = 0; i < arrayRisultato.length; i++) {
			arrayRisultato[i] = arrayStringa[arrayStringa.length-i-1];
		}
		
		for (int i = 0; i < arrayRisultato.length; i++) {
		System.out.print(arrayRisultato[i]);
		}
	}

}
