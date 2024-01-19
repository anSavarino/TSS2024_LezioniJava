package demo;

public class Canzone {

	public String titolo;
	public int durata;
	public String autore;
	
	public Canzone(String titolo, int durata, String autore) {
		this.titolo = titolo;
		this.autore = autore;
		this.durata = durata;
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
