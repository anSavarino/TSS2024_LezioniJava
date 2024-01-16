package esercizi;

import java.util.Scanner;

public class LetturaStampaArray {

	public static void main(String[] args) {
		/*Scrivere un programma che legge da input 5 elementi interi, li memorizza in un array e stampa il contenuto
		dell’array*/

		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		System.out.println("Inserisci 5 numeri interi:");
		
		for (int i = 0; i < array.length; i++) {
			array[i]=scanner.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
