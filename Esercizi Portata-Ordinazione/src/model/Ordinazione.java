package model;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Ordinazione {
	private String nomeCLiente;
	private ArrayList<Portata> portate;
	
	
	public Ordinazione(String nomeCLiente) {
		this.nomeCLiente = nomeCLiente;
		portate = new ArrayList<Portata>();
	}
	
	public void aggiungiPortata(Portata p, int q) {
		for (int i = 0; i < q; i++) {
			portate.add(p);
		}
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
		return portate.size();
	}
	
	public int portateOrdinate() {
		Set<Portata> set = new HashSet<>(portate);
		
		return set.size();	
	}
}
