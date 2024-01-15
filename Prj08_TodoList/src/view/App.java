package view;

import java.util.Scanner;

import controller.Todo;
import controller.TodoController;

public class App {

	public static void main(String[] args) {
		
		boolean gira = true;
		TodoController ctrl = new TodoController();
		
		while(gira) {
			System.out.println(menu());
			
			int risposta = domanda("Quale opzione scegli?");
			
	
			switch (risposta) {
			case 0: {
				gira = false;
				break;
			}
			case 1: {
				System.out.println("Aggiungi un nuovo Todo");
				String desc = chiediStringa("Inserisci la descrizione");
				int pos = domanda("In quale posizione vuoi inserire il todo");
				ctrl.addTodo(desc, pos);
				break;
			}
			case 2: {
				System.out.println("Stampa i Todo");
				Todo[] listaTodo =ctrl.lista;
				
				for (Todo todo : listaTodo) {
					if(todo!= null) {
						System.out.println(todo.stampa());
						}else {
							System.out.println("---");
						}
				}
				break;
			}
			default:
				System.out.println("Comando non valido");
				break;
			}
		}

		
		
		System.out.println("Grazie per aver usato il nostro software.");
	}
	
	private static String chiediStringa(String string) {
		System.out.println(string);
		Scanner sc = new Scanner(System.in);
		String desc = sc.nextLine();
		return desc;
	}

	private static int domanda(String domanda) {
		System.out.println(domanda);
		Scanner scanner = new Scanner(System.in);
		int risposta = scanner.nextInt();
		//scanner.close();
		System.out.println("La risposta è: "+risposta);
		return risposta;
	}

	private static String menu() {
		
		String s = "";
		s = s.concat("***************************\n");
		s += "1) addTodo\n";
		s += "2) print all\n";
		s += "0) quit\n";
		s = s.concat("***************************\n");
		
		return s;
	}
	
	

}
