package vista;

import controllo.RegistroCtrl;
import modello.Registro;
//import modello.Studente;

public class RegistroDemo {

	public static void main(String[] args) {
		
		Registro tss2024 = new Registro("Corso TSS 2024");
		
		RegistroCtrl controller =  new RegistroCtrl(tss2024);
		
		controller.caricaStudentiDaFile();
		controller.faiAppello();
		controller.stampaPresenti();
		controller.stampaAssenti();
		
//		Studente s1 = new Studente("Giulia","Artuso");
//		Studente s2 = new Studente("Leonardo","Castaldo");
//		
//		
//		tss2024.aggiungiStudente(s1);
//		tss2024.aggiungiStudente(s2);
//		
//		tss2024.getStudenteByID(0);
//		
//		for(Studente s: tss2024.getAllSundenti()) {
//			System.out.println(s);
//		}
		
	}

}
