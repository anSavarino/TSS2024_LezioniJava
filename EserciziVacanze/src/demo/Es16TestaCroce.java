package demo;

public class Es16TestaCroce {

	public static void main(String[] args) {
		/*Esercizio TestaCroce
		Scrivere un programma TestaCroce che genera un numero casuale 0 oppure 1 e
		stampa
		Testa se ha generato 0, o Croce se ha generato 1.
		*/
		int moneta = (int)(Math.random()*2);
		
		if (moneta == 0) {
			System.out.println("Testa");
		}else {
			System.out.println("Croce");
		}
	}

}
