package demo;

import java.util.Scanner;

public class Es09 {

	public static void main(String[] args) {
		/*1.9. Esercizio ContinuaFino
		Scrivere un programma ContinuaFino che chiede all’utente di inserire una sequenza
		di
		interi. Il programma continua a chiedere all’utente di inserire valori fintanto che i valori
		inseriti soddisfano
		almeno una delle seguenti condizioni:
		è negativo e divisibile per 2
		è positivo e divisibile per 3
		Al termine il programma stampa la somma di tutti i valori inseriti escluso quello ha
		violato le condizioni.*/
		
		continuaFino();

	}
	
	private static void continuaFino() {
		int n = 10;
		int[] sequenza = new int[n];
		int somma = 0;
		
		try (
				Scanner mioscanner = new Scanner(System.in)) {
					
					System.out.println("Inserisci una sequenza di numeri interi:");
					sequenza[0] = mioscanner.nextInt();
					int i =0;
					while((sequenza[i]<0 && sequenza[i]%2==0) || (sequenza[i]>0 && sequenza[i]%3 == 0)){
						somma+=sequenza[i];
						i++;
						sequenza[i] = mioscanner.nextInt();
					}
					
					System.out.println("La somma dei numeri che rispettano le condizione è: "+somma);
				}
	}

}
