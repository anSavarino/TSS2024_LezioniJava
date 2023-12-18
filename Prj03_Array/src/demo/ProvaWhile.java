package demo;

public class ProvaWhile {

	public static void main(String[] args) {
		
		
		boolean gira = true; 
		
		while (gira) {
			System.out.println("Sto girando");
			if (Math.random() < 0.5) {
				gira = false;
			}
		}
	}

}
