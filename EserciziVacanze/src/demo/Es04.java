package demo;

public class Es04 {

	public static void main(String[] args) {
		/*
		 * 1.4. Esercizio
		Stampare a video la seguente figura:
		******
		*****
		****
		***
		**
		*
		*/
		int righe = 6;
		for (int i = 0; i < righe; i++) {
			for (int j = 0; j < righe - i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
