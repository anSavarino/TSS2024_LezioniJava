package interfaccia;

import java.util.Scanner;

import logica.Contatto;
import logica.Rubrica;

public class Main {

	public static void main(String[] args) {
		
		boolean  gira = true;
		Rubrica r = new Rubrica(5);
		Scanner scanner = new Scanner(System.in);
		
		while(gira) {
			menu();
			
			String risposta = scanner.nextLine();
			switch (risposta) {
			case "1": {
				System.out.println("Nome contatto?");
				String nome = scanner.nextLine();
				System.out.println("Numero?");
				String numero = scanner.nextLine();
				r.addContatto(nome, numero);
				break;
			}
			case "2": {
				for (Contatto c : r.contatti) {
					if(c!=null)
						System.out.println(c.nome +": "+c.numero);
				}
				break;
			}
			case "0": {
				System.out.println("Arrivederci");
				gira = false;
				break;
			}
			default:
				System.out.println("Comando non valido!");
				break;
			}
		
		
		}
		
		System.out.println("Programma Terminato.");
		
	}

	private static void menu() {

		System.out.println("**********************");
		System.out.println("1) Aggiungi contatto");
		System.out.println("2) Vedi elenco");
		System.out.println("0) Esci");
		System.out.println("**********************");
	}

}
