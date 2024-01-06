package demo;

public class Es06 {

	public static void main(String[] args) {
		/*
		 * Stampare a video la seguente figura:
			1      654321
			12      54321
			123      4321
			1234      321
			12345      21
			123456      1
		 */
		
		int righe= 6;
		for (int i = 1; i <= righe; i++) {
            
			// Parte crescente
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Spazi
            for (int k = 1; k <= righe; k++) {
                System.out.print(" ");
            }

            // Parte decrescente
            for (int l = righe +1 - i; l >= 1; l--) {
                System.out.print(l);
            }

            System.out.println();
        }
	}

}
