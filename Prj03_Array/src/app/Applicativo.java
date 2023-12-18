package app;

public class Applicativo {

	public static void main(String[] args) {
		
		String[] listaCoseDaFare = new String[10];
		
		//chiedi a utente per 10 volte cose vuole comprare
		
		final int VOLTE = 10;
		final String DOMANDA_IT = "Cosa vuoi comprare?";
		
		for (int i = 0; i < VOLTE; i++) {
			
			listaCoseDaFare[i] = MioScanner.chiediAllUtente(DOMANDA_IT);
		
		}// fine ciclo for
		
		stampaLista(listaCoseDaFare);
		
	}//fine metodo main

	private static void stampaLista(String[] lista) {
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i]+" ");
		}
		
	}//fine metodo stampaLista
	

}//fine classe Applicativo
