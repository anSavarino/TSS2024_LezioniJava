package demo;

import java.util.Scanner;



public class AreaCerchio {

	public static void main(String[] args) {
		
		
		//Commento
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il raggio del cerchio: ");
		
		int raggio = scanner.nextInt();
		
		double areaCerchio = Math.PI * Math.pow((double)raggio, 2);
		
		System.out.println("L'area del Cerchio è: " + areaCerchio);
	}

}
