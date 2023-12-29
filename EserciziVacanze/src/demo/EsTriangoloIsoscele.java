package demo;

public class EsTriangoloIsoscele {

	public static void main(String[] args) {
		/*
		Esercizio Triangolo isoscele
		con i cicli innestati stampare a video la figura di un triangolo isoscele composto di
		lettere A maiuscola
		*/
		
		int altezza = 7;
		
		for (int i = 0; i < altezza; i++) {
			
			for (int j = 0; j < altezza -i-1; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k <= i*2; k++) {
				System.out.print("A");
			}
			System.out.println();
		}
		
		
		
	}

}
