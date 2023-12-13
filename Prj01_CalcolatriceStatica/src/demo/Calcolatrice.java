package demo;
import java.util.Scanner;


public class Calcolatrice {
	
	/**
	 * Metodo per eseguire l'addizione di interi
	 * @param a : inserire il primo addendo
	 * @param b : inserire il secondo addendo
	 * @return il risultato dell'adizione
	 */
	public static int addizione(int a, int b){
		return a+b;
	}
	public static int sottrazione(int a, int b){
		return a-b;
	}
	public static int moltiplicazione(int a, int b){
		return a*b;
	}
	public static double divisione(double a, double b){
		return a/b;
	}

	public static int chiedi(String domanda) {
		Scanner mioScanner = new Scanner(System.in);
		System.out.print(domanda);
		return mioScanner.nextInt();
		}
	
	public static void main(String[] args) {
		int add1 = chiedi("Inserisci il primo valore intero: ");
		int add2 = chiedi("Inserisci il secondo valore intero: ");
		int risultato = addizione(add1, add2);
		System.out.println("Il risultato dell'addizione è: " + risultato);
		
		risultato = sottrazione(add1, add2);
		System.out.println("Il risultato della sottrazione è: " + risultato);
		
		risultato = moltiplicazione(add1, add2);
		System.out.println("Il risultato della moltiplicazione è: " + risultato);
		
		System.out.println("Il risultato della divisione è: " + divisione(add1, add2));
		
	}
	

}
