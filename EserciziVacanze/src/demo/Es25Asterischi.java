package demo;
import java.util.Scanner;

public class Es25Asterischi {

	public static void main(String[] args) {
		/*1.25. Esercizio Asterischi
		Scrivere un programma Asterischi che chiede all’utente di inserire un numero intero e stampa un triangolo fatto di asterischi con un numero di righe pari al valore inserito dall’utente.
		
		Se l’utente inserisce un valore negativo il programma deve visualizzare un messaggio di errore.*/
		
		Scanner scanner = new Scanner(System.in);
		
		int righe =0;
		System.out.println("Inserisci un numero intero.");
		righe = scanner.nextInt();
		if (righe <0) {
			System.out.println("Errore");
		}else {
			 for (int i = 1; i <= righe; i++) {
	              
	                for (int j = 1; j <= righe - i; j++) {
	                    System.out.print(" ");
	                }

	                for (int k = 1; k <= 2 * i - 1; k++) {
	                    System.out.print("*");
	                }

	                System.out.println();
			 }
		}
		scanner.close();

	}

}
