package demo;

import java.util.Scanner;

public class Es08 {

	public static void main(String[] args) {
		/*1.8. Esercizio TuttiPositiviPari
		Scrivere un programma TuttiPositiviPari che chiede all’utente di inserire una
		sequenza di interi (chiedendo prima quanti numeri voglia inserire) e poi, al termine
		dell’inserimento dell’intera sequenza, stampa "Tutti positivi e pari" se i numeri inseriti
		sono tutti positivi e pari, altrimenti stampa "NO".
		*/
		
		
		tuttiPositiviPari();
	}

	private static void tuttiPositiviPari() {
		try (
		Scanner mioscanner = new Scanner(System.in)) {
			System.out.println("Tutti Positivi e Pari");
			
			System.out.println("Quanti numeri vuoi inserire?");
			int n = mioscanner.nextInt();
			
			
			boolean tuttiPari = true;
			int[] arrayInseriti = new int[n];
			System.out.println("Inserisci adesso i "+n+" numeri interi.");
			for (int i = 0; i < arrayInseriti.length; i++) {
				arrayInseriti[i]=mioscanner.nextInt();
				if (arrayInseriti[i]%2 !=0) {
					tuttiPari = false;
				}
			}
			
			if (tuttiPari) {
				System.out.println("Tutti positivi e pari");
			} else {
				System.out.println("NO");
			}
			
		}
	}
}


