package demo;

import java.util.Scanner;

public class SommaApprossimata {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero con la virgola: ");
		double num1 = scanner.nextDouble();
		System.out.println("inserisci il secondo numero con la virgola: ");
		double num2 = scanner.nextDouble();
		
		double somma = num1 + num2;
		
		System.out.println("La somma approssimata è: "+ (int)somma);
		
	}

}
