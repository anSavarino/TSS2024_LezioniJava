package model;

import java.util.ArrayList;

public class Carrello {
	private String cliente;
	private ArrayList<Prodotto> prodotti;
	private ArrayList<Integer> quantita;
	
	public Carrello(String cliente) {
		this.cliente = cliente;
		prodotti = new ArrayList<Prodotto>();
		quantita = new ArrayList<Integer>();
	}
	
	public void aggiungiProdotto(Prodotto p, int q) {
		prodotti.add(p);
		quantita.add(q);
		System.out.println("Aggiunte "+q+" unità di "+ p.getDescrizione());
	}
	
	public double totale() {
		double totale = 0;
		for (int i = 0; i < prodotti.size(); i++) {
			totale += prodotti.get(i).getPrezzo()*(int)quantita.get(i);
		}
		return totale;
	}
	
	public double totalePromozione() {
		double totale = 0;
		for (int i = 0; i < prodotti.size(); i++) {
			if (prodotti.get(i).isInPromozione())
				totale += prodotti.get(i).getPrezzo()*(int)quantita.get(i);
		}
		return totale;
	}
	
	public int numeroTotaleProdotti() {
		int totale = 0;
		for (Integer quantita : quantita) {
			totale += quantita;
		}
		return totale;
	}
	
	public int prodottiOrdinati() {
		return prodotti.size();
	}
	
}
