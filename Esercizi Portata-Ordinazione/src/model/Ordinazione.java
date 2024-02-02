package model;

import java.util.ArrayList;

public class Ordinazione {
	private String nomeCLiente;
	private ArrayList<Portata> portate;
	private ArrayList<Integer> quantita;
	
	
	public Ordinazione(String nomeCLiente) {
		this.nomeCLiente = nomeCLiente;
		portate = new ArrayList<Portata>();
		quantita = new ArrayList<Integer>();
	}
	
	public void aggiungiPortata(Portata p, int q) {
		portate.add(p);
		quantita.add(q);
	}
	
	public double conto() {
		int conto=0;
		for (Portata portata : portate) {
			conto += portata.getPrezzo();
		}
		return conto;
	}
	
	public double contoBevande() {
		int conto = 0;
		for (Portata portata : portate) {
			if (portata.isBevanda()) {
				conto += portata.getPrezzo();
			}
		}
		return conto;
	}
	
	public int numeroTotalePortate() {
		int totale = 0;
		for (int i = 0; i < quantita.size(); i++) {
			totale += quantita.get(i);
		}
		return totale;
	}
	
	public int portateOrdinate() {
		return portate.size();	
	}
}
