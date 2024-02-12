package demo;

public class Canzone {

	private String titolo;
	private int durata;
	private String autore;
	
	public Canzone(String titolo, int durata, String autore) {
		this.titolo = titolo;
		this.autore = autore;
		this.durata = durata;
	}
	
	
	public String getTitolo() {
		return titolo;
	}


	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}


	public int getDurata() {
		return durata;
	}


	public void setDurata(int durata) {
		this.durata = durata;
	}


	public String getAutore() {
		return autore;
	}


	public void setAutore(String autore) {
		this.autore = autore;
	}


	public Canzone(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
		this.durata = 0;
	}
	
	public boolean haAutore(String autore) {
		if(this.autore.equals(autore)) 
			return true;
		else
			return false;
	}
	
	public boolean uguali(Canzone canzone) {
		if (this.titolo.equals(canzone.titolo) &&
				this.durata == canzone.durata) 
			return true;
		else
			return false;
	}
	public String toString() {
		return "Titolo: "+this.titolo+"\nAutore: "+this.autore.toUpperCase()+"\nDurata: "+this.durata;
	}
}
