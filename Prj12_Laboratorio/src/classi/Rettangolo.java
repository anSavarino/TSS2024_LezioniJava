package classi;

public class Rettangolo {
	
	private int base, altezza;

	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public double area() {
		return this.base*this.altezza;
	}
	
	public int perimetro() {
		return (this.base+this.altezza)*2;
	}
	
	public int perimetro(boolean casuale) {
		return this.base*2 +this.altezza*2;
	}
	
}
