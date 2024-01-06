package demo;
import java.util.Scanner;

public class Es20IndovinaZero {

	public static void main(String[] args) {
		/*1.20. Esercizio IndovinaZero
		Scrivere un programma IndovinaZero che chiede all’utente di inserire numeri interi uno dopo l’altro 
		fino a quando non inserisce il numero 0.*/
		
		Scanner mioscanner = new Scanner(System.in);
		
		System.out.println("Inserisci numeri interi.");
		
		while (mioscanner.nextInt()!=0) {
			}
		System.out.println("Programma Terminato.");
		
		mioscanner.close();
	}

}
