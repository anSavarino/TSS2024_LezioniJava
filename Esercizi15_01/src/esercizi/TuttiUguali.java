package esercizi;

import java.util.Scanner;

public class TuttiUguali {

	public static void main(String[] args) {
		/*Scrivere un programma "TuttiUguali" che chiede all'utente di inserire tre numeri e stampa "Tutti uguali!" se
		i tre numeri sono tutti uguali,altrimenti stampa "Almeno uno e' diverso".
		Il controllo che i tre numeri siano uguali dovrà essere fatto da un metodo ausiliario, mentre il messaggio
		dovrà essere stampato dal metodo main.*/
		
		int[] numeri = new int[3];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci 3 numeri");
		for (int i = 0; i < numeri.length; i++) {
			numeri[i]=scanner.nextInt();		
			}
		
		if(controllo(numeri)) {
			System.out.println("Tutti Uguali!");
		}else {
			System.out.println("Almeno uno e' diverso");
		}
		
	
	}

	private static boolean controllo(int[] numeri) {
		if(numeri[0]==numeri[1] && numeri[2]==numeri[1])
			return true;
	
		return false;
	}
	
	

}
