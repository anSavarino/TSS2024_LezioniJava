package esercizi;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		/*Scrivere un programma che dato un numero n di caratteri, ritorna una parola di n caratteri casuali con
		lettere, numeri e caratteri speciali.*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un numero:");
		int n = scanner.nextInt();
		String password ="";
		for (int i = 0; i < n; i++) {
			password+= (char)(Math.random()*(126 + 1 - 33) + 33);
		}
		System.out.println(password);
	}

}
