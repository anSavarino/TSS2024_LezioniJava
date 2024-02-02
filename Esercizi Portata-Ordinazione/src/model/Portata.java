package model;

public class Portata {
	private String descrizione;
	private double prezzo;
	private boolean bevanda;
	
	public Portata(String descrizione, double prezzo, boolean bevanda) {
	
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.bevanda = bevanda;
	}
	
	public boolean isBevanda() {
		return this.bevanda;
	}
	
	public double getPrezzo() {
		return this.prezzo;
	}
	
	public void setPrezzo(double d) {
		this.prezzo = d;
	}

	public String getDescrizione() {
		return descrizione;
	}
	
	
}
