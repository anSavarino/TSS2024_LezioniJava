package demo;


public class Dado {
	
	int facce;
	String colore;
	
	public Dado(int numFacce){
		facce = numFacce;
		colore = "bianco";
	}
	
	public int lancia() {
		
		double casuale = Math.random();
		int valore = (int)(casuale * facce)+1;
		return valore;
		
	}
}
