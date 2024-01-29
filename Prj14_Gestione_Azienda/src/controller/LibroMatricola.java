package controller;

import java.util.ArrayList;

import model.Dipendente;
import model.Fattorino;
import model.Impiegato;
import model.Magazziniere;

public class LibroMatricola {

	private String nomeAzienda;
	private ArrayList<Dipendente> dipendenti;

	public LibroMatricola(String nomeAzienda) {

		this.nomeAzienda = nomeAzienda;
		this.dipendenti = new ArrayList<>();
	}

	public String getNomeAzienda() {
		return nomeAzienda.toUpperCase();
	}

	public ArrayList<Dipendente> getDipendenti() {
		return dipendenti;
	}

	/**
	 * @param d
	 */
	public void addDipendente(Dipendente d) {
		this.dipendenti.add(d);
	}

	/**
	 * @param nome
	 * @param cognome
	 */
	public void addDipendente(String nome, String cognome) {
		this.addDipendente(new Dipendente(nome, cognome));
	}

	/**
	 * Metodo per aggiungere un nuovo Dipendente
	 * 
	 * @param nome    del dipendente da assumere
	 * @param cognome del dipendente da assumere
	 * @param ruolo   del dipendente da assumere
	 */
	public void addDipendente(String nome, String cognome, String ruolo) {

		Dipendente d = null;

		switch (ruolo) {
		case "Impiegato":
			d = new Impiegato(nome, cognome);
			break;
		case "Fattorino":
			d = new Fattorino(nome, cognome);
			break;
		case "Magazziniere":
			d = new Magazziniere(nome, cognome);
			break;
		default:
			System.out.println("Not a dipendente");
			break;
		}

		if (d != null) {
			this.addDipendente(d);
		}
	}

	@Override
	public String toString() {
		return "Nome Azienda=" + nomeAzienda + ", dipendenti=" + dipendenti;
	}

}
