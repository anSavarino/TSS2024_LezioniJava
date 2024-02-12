package demo;

import java.util.ArrayList;


public class Playlist {
	public ArrayList<Canzone> canzoni = new ArrayList<Canzone>();
	
	public void aggiungi(String titolo, int durata, String autore) {
		Canzone song = new Canzone(titolo, durata, autore);
		this.canzoni.add(song);
		System.out.println("Aggiunta canzone "+titolo);
	}
	
	public void eliminaAutore(String autore) {
		
		for (int i = 0; i < this.canzoni.size(); i++) {
			if (this.canzoni.get(i).getAutore().equals(autore)) {
				this.canzoni.remove(i);
				i--;
			}
		}
	}
	
	public boolean haDuplicati() {
		boolean duplicati = false;
		for (int i = 0; i < this.canzoni.size() && !duplicati; i++) {
			for (int j = i+1; j < this.canzoni.size() && !duplicati; j++) {
				if(canzoni.get(i).getTitolo().equals(canzoni.get(j).getTitolo()) &&
				   canzoni.get(i).getDurata()==canzoni.get(j).getDurata()) {
					duplicati = true;
				}
			}
		}
		return duplicati;
	}
	
	public int quanteAutore(String autore) {
		int cont=0;
		System.out.println("Numero di canzoni di "+autore+":");
		for (int i = 0; i < this.canzoni.size(); i++) {
			if (canzoni.get(i).getAutore().equals(autore)) {
				cont++;
			}
		}
		return cont;
	}
	public int quanteCanzoni() {
		return this.canzoni.size();
	}
	
	public void stampaAutore(String autore) {
		boolean nessunaCanzone = true;
		System.out.println("Lista canzoni di: "+ autore);
		for (int i = 0; i < this.canzoni.size(); i++) {
			if (canzoni.get(i).getAutore().equals(autore)) {
				System.out.println(canzoni.get(i).getTitolo());
				nessunaCanzone = false;
			}
		}
		if (nessunaCanzone) {
			System.out.println("Non è presente nessuna canzone di "+autore);
		}
	}
}
