package model;

public class Quadrato extends Rettangolo{

	private Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.lato = lato;
	}

	@Override
	public double superficie() {
		System.out.println("Metodo Quadrato");
		return Math.pow(this.lato.lunghezza(), 2);
	}

	
}
