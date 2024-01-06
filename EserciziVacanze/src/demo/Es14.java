package demo;
import java.util.Scanner;

public class Es14 {

	public static void main(String[] args) {
		/*1.14. Esercizio 44 gatti
		Scrivere un programma per stampare 44 caratteri (inseriti da tastiera) in fila per 6 con
		resto di 2.
		*/
		Scanner mioscanner = new Scanner(System.in);
		
		char[] caratteri = new char[44];
		System.out.println("Inserisci 44 caratteri:");
		for (int i = 0; i < caratteri.length; i++) {
			caratteri[i]=mioscanner.next().charAt(0);
		}
		
		for (int i = 0; i < caratteri.length; i++) {
			if (i%6==0) {
				System.out.println();
			}
			System.out.print(caratteri[i]);
		}
		
		mioscanner.close();
	}

}
