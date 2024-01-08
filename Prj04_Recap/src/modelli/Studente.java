package modelli;

public class Studente {

	String nome;
	String cognome;
	int eta;
	
	public Studente(String _nome, String _cognome, int annoNascita) {
		nome = _nome;
		cognome = _cognome;
		eta = 2024-annoNascita;
	}
	
	public String informazioni() {
		return nome +" "+ cognome +" "+ eta;
	}
}
