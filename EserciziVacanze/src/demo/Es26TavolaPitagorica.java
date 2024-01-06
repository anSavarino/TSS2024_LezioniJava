package demo;

public class Es26TavolaPitagorica {

	public static void main(String[] args) {
		/*1.26. Esercizio TavolaPitagorica
		Scrivere un programma TavolaPitagorica in modo che i valori stampati siano ben incolonnati*/
		
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
	}

}
