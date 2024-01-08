package gioco;

import java.util.Scanner;

public class Main {
	
	private static String chiediUtente() {
		System.out.println("Sasso, carta o forbci?");
		Scanner scanner = new Scanner(System.in);
		String scelta = scanner.nextLine().toLowerCase();
		scanner.close();
		return scelta;
	}
	
	private static String sceltaPC() {
//		String scelta = "carta";
		int casuale = (int)(Math.random()*3);
		if(casuale == 0)
			return "sasso";
		else if(casuale == 1)
			return "forbici";
		else
			return "carta";
		
	}
	
	private static String valutaScelte(String sceltaU, String sceltaPC) {
		if (sceltaU.equals(sceltaPC)) {
			return "Pareggio";
		}else {
			
			switch (sceltaU) {
			case "sasso": {
				if(sceltaPC.equals("forbici"))
					return "Vince Umano";
				else
					return "Vince PC";
			}
			case "forbici": {
				if(sceltaPC.equals("carta"))
					return "Vince Umano";
				else
					return "Vince PC";
			}
			case "carta": {
				if(sceltaPC.equals("sasso"))
					return "Vince Umano";
				else
					return "Vince PC";
			}
			default:
				return "Qualcosa non ha funzionato";
			}
		}
	}
	
	public static void main(String[] args) {
		
		String sceltaUtente = chiediUtente();
		String sceltaPc = sceltaPC();
		String result = valutaScelte(sceltaUtente, sceltaPc); 
		System.out.println("Umano ha giocato "+sceltaUtente);
		System.out.println("Pc ha giocato "+sceltaPc);
		System.out.println(result);
	}

}
