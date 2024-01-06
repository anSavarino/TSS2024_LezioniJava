package demo;
import java.util.Scanner;

public class Es28 {

	public static void main(String[] args) {
		/*1.28. Esercizio Converti in maiuscolo
		Scrivere un programma che usando i cicli converta una sequenza di caratteri letti 
		in input nei corrispondenti caratteri maiuscoli.*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci una sequenza di caratteri");
		String sequenza = scanner.nextLine();
		String sequenzaUP = "";
		
		for (int i = 0; i < sequenza.length(); i++) {
			sequenzaUP += Character.toUpperCase(sequenza.charAt(i));
		}
		System.out.println(sequenzaUP);
		scanner.close();

	}

}
