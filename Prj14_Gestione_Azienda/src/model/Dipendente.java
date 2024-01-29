package model;

public class Dipendente {
	
	private static int matricolatore = 1;
	private int numMatricola;
	
	protected String nome;
	protected String cognome;
	protected double stipendio;
	
	public Dipendente(String nome, String cognome) {

		this.numMatricola = matricolatore++;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
	@Override
	public String toString() {
		return "Dipendente n:"+this.numMatricola+"\tNome: "+this.nome+"\tCognome: "+this.cognome+"\tStipendio: "+this.stipendio;
	}
	
}
