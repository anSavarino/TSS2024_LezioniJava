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
	
	public void deleteImpiegato(String cognome) {
		for (int i = 0; i < impiegati.size(); i++) {
			if (impiegati.get(i).getCognome().equals(cognome)) {
				impiegati.remove(impiegati.get(i));
				System.out.println("Impiegato "+cognome+" eliminato");
				i--;
			}
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
