package demo;
import java.util.Scanner;

public class Es21ScrivoScrivoScrivo {

	public static void main(String[] args) {
		/*1.21. Esercizio ScrivoScrivoScrivo
		Scrivere un programma ScrivoScrivoScrivo che chiede all’utente di inserire un numero maggiore o uguale a zero e un messaggio, 
		quindi stampa il messaggio ciclando un numero di volte pari al numero inserito dall’utente.
		Se il valore inserito dall’utente è negativo il programma stampa un messaggio di errore.*/
		
		Scanner mioscanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero maggiore o uguale a zero.");
		
		int cicli = mioscanner.nextInt();
		if (cicli<0) {
			System.out.println("Errore.");
		}else {
			//ammetto che ho dovuto cercare per ricordarmi che si deve consumare lo \n residuo del precedente nextInt()
			mioscanner.nextLine();
			
			System.out.println("Inserisci un messaggio.");
			String messaggio = mioscanner.nextLine();
			
			for (int i = 0; i < cicli; i++) {
				System.out.println(messaggio);
			}
		}

		mioscanner.close();
	}

}
