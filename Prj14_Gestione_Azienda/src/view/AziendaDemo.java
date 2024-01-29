package view;

import controller.LibroMatricola;
import model.Dipendente;
import model.Fattorino;
import model.Impiegato;
import model.Magazziniere;

//ciao
public class AziendaDemo {

	public static void main(String[] args) {

		LibroMatricola libro1 = new LibroMatricola("Apple");
		LibroMatricola libro2 = new LibroMatricola("Samsung");

		libro1.addDipendente("Giuseppe", "Verdi", "Impiegato");
		libro1.addDipendente("Giuseppe", "Garibaldi", "Fattorino");
		libro1.addDipendente("Giuseppe", "Mazzini", "Magazziniere");

		System.out.println(libro1.getNomeAzienda());
		System.out.println("Dipendenti:");
		for (Dipendente d : libro1.getDipendenti()) {
			System.out.println(d);
		}
		System.out.println(libro2.getNomeAzienda());

//    Dipendente d = new Dipendente("Giuseppe", "Verdi");
//
//    Fattorino f = new Fattorino("Giuseppe", "Garibaldi");
//    f.setNumConsegne(10);
//    f.calcolaStipendio();
//
//    Impiegato i = new Impiegato("Giuseppe", "Mazzini");
//
//    Magazziniere m = new Magazziniere("Giuseppe", "Conte");
//
//    System.out.println(d);
//    System.out.println(f);
//    System.out.println(i);
//    System.out.println(m);
	}

}
