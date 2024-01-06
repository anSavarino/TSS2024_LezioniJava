package demo;
import java.util.Scanner;

public class Es13 {

	public static void main(String[] args) {
		/*1.13. Esercizio Classificazione voto esame
		Una classe di 10 studenti ha sostenuto un esame.
		
		I voti sono espressi con lettere:
		
		'O' = ottimo (corrispondente al 10),
		'B' = buono (8),
		'S' = sufficiente (6),
		'I' = insufficiente (4).
		Scrivere un programma che consenta il calcolo della media aritmetica dei voti di tale esame.
		*/
		
		Scanner mioscanner = new Scanner(System.in);
		
		String[] studenti = {"Rossi", "Russo", "Ferrari", "Esposito", "Bianchi",
		                     "Romano", "Colombo", "Ricci", "Marino", "Greco"};
		char voti[] = new char[studenti.length];
		
		for (int i = 0; i < studenti.length; i++) {
			System.out.println("Inserisci il voto dello studente "+studenti[i]+" in formato O, B, S, I");
			voti[i] = mioscanner.next().charAt(0);
		}
		
		int sommavoti = 0;
		
		for (int i = 0; i < voti.length; i++) {
			System.out.println(voti[i]);
		}
		
		for (int i = 0; i < voti.length; i++) {
			switch (voti[i]) {
			case 'O': {
				sommavoti+=10;
				break;
				}
			case 'B': {
				sommavoti+=8;
				break;
				}
			case 'S': {
				sommavoti+=6;
				break;
				}
			case 'I': {
				sommavoti+=4;
				break;
				}
			default:
				throw new IllegalArgumentException("Unexpected value: " + voti[i]);
			}
		}
		
		long media = sommavoti/studenti.length;
		
		System.out.println("La media dei voti è: "+ media);
		
		mioscanner.close();
	}

}
