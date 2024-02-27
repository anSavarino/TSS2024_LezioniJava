package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Studente {
	private int id;
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	
	public int getEta() {
		LocalDate oggi = LocalDate.now();
		return (int)dataNascita.until(oggi, ChronoUnit.DAYS)/365;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + "]";
	}
	
	
}
