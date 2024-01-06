package demo;
import java.util.Scanner;

public class Es23ContaNumeriCrescenti {

	public static void main(String[] args) {
		/*1.23. Esercizio ContaNumeriCrescenti
		Scrivere un programma ContaNumeriCrescenti che chiede all’utente di inserire una sequenza di 
		numeri interi crescenti (man mano sempre più grandi) e ne stampa la lunghezza 
		(il numero di valori inseriti dall’utente). Il programma termina non appena l’utente inserisce 
		un valore minore o uguale al precedente).*/
		
		Scanner mioscanner = new Scanner(System.in);
		
		int precedente = Integer.MIN_VALUE;
		
		int lunghezza=1;
		System.out.println("Inserisci numeri crescenti");
		
		int attuale = mioscanner.nextInt();
		while(precedente<attuale) {
			precedente = attuale;
			attuale = mioscanner.nextInt();
			lunghezza++;
		}
		
		System.out.println("Lunghezza: "+lunghezza);
	}

}
