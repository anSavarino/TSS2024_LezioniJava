package model;

public class Fattorino extends Dipendente {

	private int numConsegne;

	public Fattorino(String nome, String cognome) {
		super(nome, cognome);
		// TODO Auto-generated constructor stub
	}

	public int getNumConsegne() {
		return numConsegne;
	}

	public void setNumConsegne(int numConsegne) {
		this.numConsegne = numConsegne;
	}

	public void calcolaStipendio() {
		this.stipendio = numConsegne * 5;
	}

	@Override
	public String toString() {
		return "Fattorino [Nome e Cognome: "+super.nome+" "+this.cognome+" numConsegne = " + numConsegne + "]";
	}

	
}
