package demo;

import java.util.Scanner;

public class MinutiInOre {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero numero di minuti: ");
		int minuti = scanner.nextInt();
		
		int ore = minuti / 60;
		int minutiResto = minuti % 60;
		
		System.out.println(minuti+" minuti equivalgono a "+ore+" ore e "+minutiResto+" minuti");
		
		
	}

}
