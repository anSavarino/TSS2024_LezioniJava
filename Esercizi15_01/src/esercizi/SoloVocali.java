package esercizi;

import java.util.Scanner;

public class SoloVocali {

	public static void main(String[] args) {
		/*Scrivere un programma SoloVocali che chiede all’utente di inserire una stringa e ne stampa le sole vocali.
		Per esempio, se si immette la stringa "Viva Java", il programma stampa "iaaa".*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci una stringa");
		
		String stringa = scanner.nextLine();
		for (int i = 0; i < stringa.length(); i++) {
			if( stringa.toLowerCase().charAt(i)=='a' || 
				stringa.toLowerCase().charAt(i)=='e' ||
				stringa.toLowerCase().charAt(i)=='i' ||
				stringa.toLowerCase().charAt(i)=='o' ||
				stringa.toLowerCase().charAt(i)=='u') {
				System.out.print(stringa.charAt(i));
			}
		}
	}
}
