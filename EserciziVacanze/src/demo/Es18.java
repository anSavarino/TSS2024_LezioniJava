package demo;
import java.util.Scanner;

public class Es18 {

	public static void main(String[] args) {
		/*1.18. Esercizio Carta, forbici, sasso
		Scrivere un programma che chieda agli utenti due stringhe in ingresso, le stringhe possono valere solo: "carta", "forbici" o "sasso".
		
		Il programma dovrà quindi effettuare i dovuti controlli e dichiarare il vincitore secondo le regole:
		
		forbici vince su carta,
		carta vince su sasso,
		sasso vince su forbici.*/
		
		Scanner mioscanner = new Scanner(System.in);
		
		System.out.println("carta, sasso o forbici?");
		
		System.out.println("Giocatore 1:");
		String scelta1 = mioscanner.nextLine().toLowerCase();
		
		System.out.println("Giocatore 2:");
		String scelta2 = mioscanner.nextLine().toLowerCase();
		
		if (scelta1.equals(scelta2)) {
			System.out.println("Pareggio!");
		}else if ((scelta1.equals("forbici")&& scelta2.equals("carta"))||
				  (scelta1.equals("carta")&& scelta2.equals("sasso"))||
				  (scelta1.equals("sasso")&& scelta2.equals("forbici"))) {
			System.out.println("Giocatore 1 vince!");
		}else {
			System.out.println("Giocatore 2 vince!");
		}
		
		
		mioscanner.close();
	}

}
