package modello;

public class Studente {
	private String nome;
	private String cognome;
	
	
	private int nMat;
	private static int contatore = 1;

	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.nMat = contatore++;
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

	public int getnMat() {
		return nMat;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", nMat=" + nMat + "]";
	}

}
