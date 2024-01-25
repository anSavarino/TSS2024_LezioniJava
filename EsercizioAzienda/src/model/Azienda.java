package model;

import java.util.ArrayList;

public class Azienda {
	
	private ArrayList<Impiegato> impiegati;
	
	
	
	public Azienda() {
		
		this.impiegati = new ArrayList<Impiegato>();
	}

	public void addImpiegato(Impiegato i) {
		impiegati.add(i);
		System.out.println("Impiegato "+i.getCognome()+" aggiunto");
	}
	
	public void deleteImpiegato(Impiegato i) {
		if (impiegati.contains(i)) {
			impiegati.remove(i);
			System.out.println("Impiegato "+i.getCognome()+" eliminato");
		}
	}
	public int stipendioTOT() {
		int stipendioTotale = 0;
		for (Impiegato impiegato : impiegati) {
			stipendioTotale += impiegato.getStipendio();
		}
		return stipendioTotale;
	}
}
