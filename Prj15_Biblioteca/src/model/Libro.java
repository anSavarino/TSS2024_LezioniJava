package model;

public class Libro {

	private String titolo;
	private String autore;
	private String collocazione;
	private int numPag;

	private boolean disponibile;

	public Libro(String titolo, String autore) {
		this.titolo = titolo;
		this.autore = autore;
		this.collocazione = setCollocazione();
		this.disponibile = true;

	}

	public Libro(String titolo, String autore, int numPag) {
		this(autore, titolo);
		this.numPag = numPag;
		this.collocazione = "";
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getCollocazione() {
		return collocazione;
	}

	public String setCollocazione() {
		return this.collocazione = this.autore.substring(0, 2) + this.titolo.substring(0, 3) + this.titolo.length();
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", collocazione=" + collocazione + ", numPag="
				+ numPag + ", disponibile=" + disponibile + "]";
	}

}
