package model;

public class Impiegato {

	private String nome;
	private String cognome;
	private String id;
	
	private int annoDiNascita;
	private int stipendio;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getId() {
		return id;
	}
	public void setId() {
		this.id = Segreteria.creaID(this.nome, this.cognome, this.annoDiNascita);
	}
	public int getAnnoDiNascita() {
		return annoDiNascita;
	}
	public void setAnnoDiNascita(int annoDiNascita) {
		this.annoDiNascita = annoDiNascita;
	}
	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	
	
	
}
