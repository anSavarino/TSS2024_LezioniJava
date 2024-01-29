package view;

import model.Dipendente;
import model.Fattorino;
import model.Impiegato;
import model.Magazziniere;

public class AziendaDemo {

	public static void main(String[] args) {

		Dipendente d = new Dipendente("Giuseppe", "Verdi");
		
		Fattorino f = new Fattorino("Giuseppe", "Garibaldi");
		f.setNumConsegne(10);
		f.calcolaStipendio();
		
		Impiegato i = new Impiegato("Giuseppe", "Mazzini");
		
		Magazziniere m = new Magazziniere("Giuseppe", "Conte");
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(i);
		System.out.println(m);
	}

}
