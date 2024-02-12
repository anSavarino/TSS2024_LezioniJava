package model;

public class Quadrato extends Rettangolo implements Misurabile{

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

	@Override
	public void misuraMi() {
		System.out.println("Mi basta un solo lato (ne ho 4 uguali!)");
	}

	
}
