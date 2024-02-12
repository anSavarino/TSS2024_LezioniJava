package model;

public class Rettangolo extends FiguraGeometrica {

	private Segmento base, altezza;

	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public double perimetro() {
		return (this.base.lunghezza()+this.altezza.lunghezza())*2;
	}
	
	public double superficie() {
		System.out.println("Metodo rettangolo");
		return this.base.lunghezza()*this.altezza.lunghezza();
	}

	@Override
	public String toString() {
		return "Rettangolo [\nperimetro()=" + perimetro() + ", \nsuperficie()="
				+ superficie() + "]";
	}

	@Override
	public double calcolaSuperficie() {
		// TODO Auto-generated method stub
		return superficie();
	}

	@Override
	public double calcolaPerimetro() {
		// TODO Auto-generated method stub
		return perimetro();
	}
	
	
}
