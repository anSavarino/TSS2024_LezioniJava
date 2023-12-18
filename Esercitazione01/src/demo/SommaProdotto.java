package demo;

import java.util.Scanner;

public class SommaProdotto {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero: ");
		int num1 = scanner.nextInt();
		System.out.println("inserisci il secondo numero: ");
		int num2 = scanner.nextInt();
		
		int somma = num1 + num2;
		int prodotto = num1*num2;
		
		System.out.println("La somma è "+somma+" e il prodotto "+prodotto);

	}

}
