package demo;

import java.util.Scanner;

public class RadiceQuadrata {

	public static void main(String[] args) {

		
		
		System.out.println("Inserisci il numero del quale vuoi la radice quadrata: ");
		
		Scanner scanner = new Scanner(System.in);
		
		int numero = scanner.nextInt();
		
		double radiceQuadrata = Math.sqrt(numero); 
		
		System.out.println("La radice quadrata di "+numero+ " è "+radiceQuadrata);
		
	}
	
	

}
