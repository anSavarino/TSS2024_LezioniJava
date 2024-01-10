package controlflow;

public class ProvaWhile {

	public static void main(String[] args) {
		
		boolean gira = true;
		int cont = 0;
		
		while (gira) {
			System.out.println("gira"+cont++);
			
			if (Math.random()< 0.005) {
				gira = false;
			}
			
		}
		
		do {
			
		} while (gira);
	}

}
