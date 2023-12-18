package app;

public class GiraGira {

	public static void main(String[] args) {

		boolean gira = true;
		
		while (gira) {
		
			String risposta = MioScanner.chiediAllUtente("Cosa vuoi fare?");
			
			if (risposta.equals("esci")) {
				System.out.println("Byebye");
				gira = false;
			}
			
			System.out.println("Risposta: " + risposta);
		}
		
		
	}

}
