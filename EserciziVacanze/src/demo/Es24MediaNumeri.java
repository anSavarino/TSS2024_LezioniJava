package demo;
import java.util.Scanner;

public class Es24MediaNumeri {

	public static void main(String[] args) {
		/*1.24. Esercizio MediaNumeri
		Scrivere un programma MediaNumeri che chiede all’utente di inserire una sequenza di numeri interi positivi. 
		Non appena l’utente inserisce un numero negativo il programma si arresta e visualizza la media aritmetica 
		dei valori positivi inseriti.*/
		
		Scanner scanner = new Scanner(System.in);
		
		int somma=0;
		int numIns=0;
		double media=0;
		
		System.out.println("Inserisci una sequenza di numeri positivi.");
		
		while(true) {
			int num = scanner.nextInt();
			
			if (num<0) {
				break;
			}	
			somma+=num;
			numIns++;
		}
		
		media = (double)somma/numIns;
		
		System.out.println("La mediedei numeri inseriti è: "+media);
		scanner.close();
	}

}
