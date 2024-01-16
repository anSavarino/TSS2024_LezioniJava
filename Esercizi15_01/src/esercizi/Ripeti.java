package esercizi;

import java.util.Scanner;

public class Ripeti {

	public static void main(String[] args) {

		/*Scrivere un programma Ripeti che chiede all’utente di inserire una stringa e un numero intero positivo.
		Entrambe gli elementi dovranno essere passati a un metodo ausiliario che stamperà tante copie della
		stringa quante indicate nel numero inserito dall’utente.
		Se il numero inserito dall'utente è negativo il metodo ausiliario stamperà "ERRORE: numero negativo".
		Il nome del metodo ausiliario può essere scelto a piacere.*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserire una stringa e un numero intero positivo:");
		String stringa = scanner.nextLine();
		int num = scanner.nextInt();
		
		stringa(stringa, num);
		
	}

	private static void stringa(String stringa, int num) {
		// TODO Auto-generated method stub
		if (num > 0) {
			for (int i = 0; i < num; i++) {
				System.out.println(stringa);
			}
		}else {
			System.out.println("ERRORE: numero negativo");
		}

	}

}
