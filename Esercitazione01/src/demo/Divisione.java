package demo;

import java.util.Scanner;

public class Divisione {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inseriscila il dividendo: ");
		int dividendo = scanner.nextInt();
		System.out.println("inserisci il divisore: ");
		int divisore = scanner.nextInt();
		
		double quoziente = (double)dividendo / (double)divisore;
		double resto = (double)dividendo % (double)divisore;
		
		System.out.println("Il quoziente è: " + quoziente);
		System.out.println("Il resto è:" + resto);

	}

}
