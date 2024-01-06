package demo;
import java.util.Scanner;

public class Es10 {

	public static void main(String[] args) {
		/*
		 * 1.10. Esercizio PositivoNegativo
		Scrivere un programma PositivoNegativo che chiede all’utente di inserire una
		sequenza di interi terminata quando l’utente immette il valore 0 e poi stampa "OK" se la
		sequenza contiene un valore positivo seguito da uno negativo, altrimenti stampa il
		messaggio "NO". A vostra scelta, la stampa
		del messaggio "OK" può interrompere o meno l’inserimento dei valori.
		*/
		
		positivoNegativo();
		
	}

	public static void positivoNegativo() {
		
		Scanner mioScanner = new Scanner(System.in);
		System.out.println("Inserisci una sequenza di numeri interi. Premi 0 per conludere.");
		
		int numero = 0;
		int numCicli = 0;
		boolean valida = true;
		
		while (true) {
			numero = mioScanner.nextInt();
			if (numero == 0) {
				System.out.println("Programma Terminato.");
				break;
			}
			
			if(numero > 0) {
				numero = mioScanner.nextInt();
				if (numero == 0) {
					System.out.println("Programma Terminato.");
					break;
				}
				if (numero < 0) {
				}else {valida = false;}
			}else {valida = false;}
			numCicli++;
		}
		if (valida && numCicli > 0) {
			System.out.println("OK");
		}else {
			System.out.println("NO");
		}
		mioScanner.close();
	}
}
