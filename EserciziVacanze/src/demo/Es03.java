package demo;
import java.util.Scanner;

public class Es03 {

	public static void main(String[] args) {
		/*1.3. Esercizio tabellina
		Scrivere un programma che stampi la tabellina del numero dato come argomento*/
		
		try (Scanner mioScanner = new Scanner(System.in)) {
			System.out.println("Inserisci un numero: ");
			int num = mioScanner.nextInt();
			System.out.println("La tabellina di "+num+" è:");
			for (int i = 1; i <= 10; i++) { 
				System.out.println(num+" * "+i+" = "+num*i);
			}
		}
	}
}