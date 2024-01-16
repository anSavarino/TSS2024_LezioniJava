package esercizi;

import java.util.Scanner;

public class MinimoDiArray {

	public static void main(String[] args) {
		/*Scrivere il programma MinimoDiArray che chiede all’utente di inserire 10 numeri, li memorizza in un array e
		poi stampa valore e posizione dell’elemento minimo dell’array. Se il valore minimo è presente più di una
		volta, stampa la posizione della prima occorrenza di tale valore nell’array.*/
		
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];
		
		System.out.println("Inserisci 10 numeri interi");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int min = array[0];
		int posmin = 0;
		
		for (int i = 1; i < array.length; i++) {
			if (array[i]<min) {
				min = array[i];
				posmin=i;
			}
		}
		
		System.out.println("Il minore è "+min+" alla posizione "+posmin);

	}

}
