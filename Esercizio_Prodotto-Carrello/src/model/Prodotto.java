package model;

public class Prodotto {
	private String descrizione;
	private double prezzo;
	private boolean promozione;
	
	public Prodotto(String descrizione, double prezzo, boolean promozione) {
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.promozione = promozione;
	}
	
	public boolean isInPromozione() {
		return promozione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double d) {
		this.prezzo = d;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	
	
}
