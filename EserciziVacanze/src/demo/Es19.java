package demo;
import java.util.Scanner;

public class Es19 {

	public static void main(String[] args) {
		/*1.19. Esercizio calcolare l’importo di una tassa
		Scrivere una funzione per calcolare l’importo di una tassa secondo la seguente tabella:
		
		Fino a 10.000 €, l’importo della tassa è del 10%
		
		Fino a 20.000 €, l’importo della tassa è del 10% per i primi 10.000 €, del 7 % sul restante.
		
		Fino a 30.000 €, l’importo è ancora del 10% per i primi 10.000 €, poi del 7% fino a 20.000 ed infine il 5% sul restante.
		
		Oltre i 30.000 € ci si comporta come prima, aggiungendo un ulteriore 3% è sulla porzione oltre i 30.000 €.
		
		Per ogni importo non valido si ritorni -1 (qualunque importo che non sia un numero reale e positivo).
		
		Esempi: Un importo di 10, dovrebbe tornare 1 (1 è il 10% di 10)
		
		Un importo di 21, dovrebbe tornare 1.75 (10% di 10 + 7% di 10 + 5% di 1)
		*/
		
		Scanner mioscanner = new Scanner(System.in);
		
		System.out.println("Calcolo della tassa");
		System.out.println("Qual è il tuo importo?");
		
		int importo = mioscanner.nextInt();
		double tassa = -1;
		
		if (importo > 0 && importo % 1 == 0) {
			if (importo <= 10) {
				tassa = (double)importo*0.1;
			}else if (importo <= 20) {
				importo -= 10;
				tassa = (double)importo*0.07 + 10*0.1;
			}else if (importo <=30) {
				importo -= 20;
				tassa = (double)importo*0.05+(10*0.1)+(10*0.07);
			}else {
				importo -= 30;
				tassa = (double)importo*0.03+(10*0.1)+(10*0.07)+(10*0.05);
			}
		}else {
			System.out.println("Importo non valido");
		}
		
		System.out.println(tassa);
		
		mioscanner.close();
	}

}
