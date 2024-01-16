package esercizi;

public class Istogramma {

	public static void main(String[] args) {
		/*Scrivere un programma che disegni l'istogramma di un array di interi precaricato.

			Es. Se vettore = {4, 7, 2}, l'output sarà:
			0: ****
			1: *******
			2: ***/
		int[] array = {9, 4, 3, 7, 2};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
