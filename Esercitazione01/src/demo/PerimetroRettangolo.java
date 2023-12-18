package demo;

import java.util.Scanner;

public class PerimetroRettangolo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inseriscila base del rettangolo: ");
		int base = scanner.nextInt();
		System.out.println("inserisci l'altezza del rettangolo: ");
		int altezza = scanner.nextInt();
		
		int perimetro = (base + altezza)*2;
		
		System.out.println("Il perimetro del rettangolo sarà: " + perimetro);

		
	}

}
