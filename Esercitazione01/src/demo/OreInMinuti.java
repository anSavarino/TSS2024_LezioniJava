package demo;

import java.util.Scanner;

public class OreInMinuti {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero frazionario che rappresenta un tempo espresso in ore: ");
		double numFrazionario = scanner.nextDouble();
		
		double minuti = numFrazionario * 60;
		
		System.out.println((int)minuti);
		
		
	}

}
