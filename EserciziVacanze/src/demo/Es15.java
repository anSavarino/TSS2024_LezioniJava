package demo;
import java.util.Scanner;

public class Es15 {

	public static void main(String[] args) {
		/*1.15. Esercizio Codice ASCII
		Scrivere un programma che stampi 10 caratteri (letti da tastiera) ed i relativi codici
		ASCII.
		*/
		Scanner mioscanner = new Scanner(System.in);
		
		char[] caratteri = new char[10];
		System.out.println("Inserisci 10 caratteri:");
		for (int i = 0; i < caratteri.length; i++) {
			caratteri[i]=mioscanner.next().charAt(0);
		}
		
		for (int i = 0; i < caratteri.length; i++) {
			System.out.println(caratteri[i]+" "+(int)caratteri[i]);
		}
		
		mioscanner.close();
	}

}
