package controlflow;

public class ProvaFor {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("Ripetizione n. " + (i+1));
		}
		
//		for(;;) {
//			//loop infinito
//		}
		
		
		int[] voti = {25,24,28,27,22};
		int lunghezza = voti.length;
		
		double totale = 0;
		
		for (int i = 0; i < lunghezza; i++) {
			System.out.println(voti[i]);
			totale+=voti[i];
		}
		
		System.out.println("La media aritmetica è: "+ (totale/lunghezza));
		
		for (int voto : voti) {
			System.out.println(voto);
		}
	}

}
