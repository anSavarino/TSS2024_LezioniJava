package demo;
import java.util.Iterator;
import java.util.Scanner;

public class Es11MediaMultipliDiTre {

	public static void main(String[] args) {
		/*1.11. Esercizio MediaMultipliDiTre
		Scrivere un programma MediaMultipliDiTre che chiede all’utente di inserire una
		sequenza di interi (chiedendo prima quanti numeri voglia inserire) e poi stampa la
		media di tutti i numeri inseriti che siano divisibili per tre.
		Per esempio, se si immettono i valori 5, 8, 9, 12, 7, 6 ,1 il risultato stampato dovrà
		essere 9.
		*/
		
		Scanner mioscanner = new Scanner (System.in);
		int media = 0;
		int somma = 0;
		int numDiv = 0;
		
		
		System.out.println("Quanti numeri vuoi inserire?");
		int numSeq = mioscanner.nextInt();
		
		System.out.println("Inserisci "+numSeq+" numeri interi:");
		
		int sequenza[] = new int[numSeq];
		
		for (int i = 0; i < sequenza.length; i++) {
			sequenza[i] = mioscanner.nextInt();
			if (sequenza[i]%3 == 0) {
				somma+=sequenza[i];
				numDiv++;
			}
		}
		
		media = somma/numDiv;
		
		System.out.println("La media è "+media);
		
		mioscanner.close();
	}

}
