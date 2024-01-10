package logica;

public class Rubrica {

	public Contatto[] contatti;
	
	public Rubrica(int numeroContatti) {
		this.contatti = new Contatto[numeroContatti];	
	}
	
	public boolean addContatto(String nome, String numero) {
		Contatto c = new Contatto(nome, numero);
		int pos = trovaPosizioneLibera();
		
		if(pos>-1) {
			
			this.contatti[pos] = c;
			System.out.println("Contatto inserito correttamente.");
			return true;
		}else {
			System.out.println("La rubrica è piena.");
			return false;
		}
	}
	
	public int trovaPosizioneLibera() {
		
		for (int i = 0; i< contatti.length; i++) {
			if (contatti[i] == null) {
				return i;
			}
		}
		return -1;
		
	}
	
	public int contaContatti() {
		
		int totale = 0;
		
		for (Contatto contatto : this.contatti) {
			if (contatto != null) {
				totale++;
			}
		}
		return totale;
	}
	
	
}
