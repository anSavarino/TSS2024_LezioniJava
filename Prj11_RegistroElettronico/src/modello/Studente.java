package modello;

public class Studente {
	private String nome;
	private String cognome;
	
	private int nMat;
	
	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public String getNome() {
		return this.nome.toUpperCase();
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	
}
