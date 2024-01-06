package demo;
import java.util.Scanner;

public class Es17 {

	public static void main(String[] args) {
		/*1.17. Esercizio Calcola il voto dell’esame
		Scrivere un programma che calcoli il risultato dell’esame di uno studente.
		
		Il programma prenderà in ingresso: 
		*Il voto ottenuto nella prova scritta (variabile tra -8 e +8) 
		**Il voto ottenuto nella prova pratica (variabile tra 0 e 24)
		Memorizzati questi dati procederà al calcolo del risultato finale in trentesimi come segue:
		
		Il risultato finale è la somma dei risultati.
		se il voto di teoria è minore (o uguale) di zero e la somma dei voti di teoria e pratica è maggiore di 18 lo studente è bocciato.
		se il voto di teoria è minore (o uguale) di zero e il voto di pratica è minore di 18 il programmalo studente è bocciato.
		se il voto di teoria è maggiore di zero e la somma dei voti di teoria e pratica è minore di 18lo studente è bocciato.
		se la somma di teoria e pratica vale 31 o 32 il programma stampa: "congratulazioni: 30 e lode"
		in tutti gli altri casi lo studente è promosso e viene riportato il voto calcolato.
		*/
		
		Scanner mioscanner = new Scanner(System.in);
		
		int votoS=0;
		
		System.out.println("Inserisci il voto della prova scritta:");
		votoS = mioscanner.nextInt();
		while (votoS<-8 || votoS>8) {
			System.out.println("Inserisci un valore tra -8 e 8!");
			votoS = mioscanner.nextInt();
		}
		
		int votoP=0;
		System.out.println("Inserisci il voto della prova pratica:");
		votoP = mioscanner.nextInt();
		while (votoP<0 || votoP>24) {
			System.out.println("Inserisci un valore tra 0 e 24!");
			votoP = mioscanner.nextInt();
		}
		
		int votoFinale=votoP+votoS;
		
		if (votoS<=0 && votoFinale>18) {
			System.out.println("Bocciato");
		}else if (votoS<=0 && votoP<18) {
			System.out.println("Bocciato");
		}else if (votoS>0 && votoFinale<18) {
			System.out.println("Bocciato");
		}else if (votoFinale>30) {
			System.out.println("Congratulazioni: 30 e Lode");
		}else {
			System.out.println("Promosso con voto: "+votoFinale);
		}
		
		mioscanner.close();
	}

}
