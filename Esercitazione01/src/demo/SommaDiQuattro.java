package demo;

import java.util.Scanner;

public class SommaDiQuattro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] valori = new int[4];
		int somma = 0;
		System.out.println("Inserisci i 4 valori di cui vuoi la somma. Dai invio dopo ogni valore.");
		
		
		for (int i = 0; i < valori.length; i++) {
			valori[i] = scanner.nextInt();
			somma += valori[i];
		}

		System.out.println("La somma dei valori forniti è: "+somma);
	}

}
