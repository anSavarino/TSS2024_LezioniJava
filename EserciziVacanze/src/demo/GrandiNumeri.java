package demo;

public class GrandiNumeri {

	public static void main(String[] args) {
		/*Scrivere un programma GrandiNumeri che genera 0 oppure 1 
		 * per 1000 volte e stampa quante volte è stato generato 0 e quante volte è stato generato 1.
		 */
		
		int num = 0;
		int contZero=0;
		int contUno=0;
		
		for (int i = 0; i < 1000; i++) {
			num = (int) (Math.random()*2);

			if (num == 0) {
				contZero++;
			}else {
				contUno++;
			}
		}
		
		System.out.println("Il numero 0 è stato stampato "+contZero+" volte.");
		System.out.println("In numero 1 è stato stampato "+contUno+" volte");

	}

}
