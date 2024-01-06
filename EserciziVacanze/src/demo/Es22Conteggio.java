package demo;
import java.util.Scanner;

public class Es22Conteggio {

	public static void main(String[] args) {
		/*1.22. Esercizio Conteggio
		Scrivere un programma Conteggio che chiede all’utente di inserire un numero maggiore o uguale a zero e 
		stampa uno dopo l’altro tutti i numeri da 0 al numero inserito compreso. 
		Se il valore inserito dall’utente è negativo il programma stampa un messaggio di errore.
		*/
		
		Scanner mioscanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero.");
		int num = mioscanner.nextInt();
		
		if (num >= 0) {
			for (int i = 0; i < num+1; i++) {
				System.out.println(i);
			}
		}else {
			System.out.println("Errore: il numero deve essere maggiore o uguale a zero.");
		}
		mioscanner.close();

	}

}
