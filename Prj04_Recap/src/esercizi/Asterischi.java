package esercizi;

public class Asterischi {

	public static void main(String[] args) {
		
		//cicli
		
		int volte = 10;
		
		for (int i = 1; i <= volte; i++) {
			for (int j = 1; j <= volte; j++) {
				System.out.print("\t"+i*j);
			}
			System.out.println();
		}
	}

}
