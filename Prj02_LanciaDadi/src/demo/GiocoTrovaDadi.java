package demo;


public class GiocoTrovaDadi {

	public static void main(String[] args) {

		Dado d6_1= new Dado(6);
		Dado d6_2= new Dado(6);
		
		final int NUM_LANCI = 100_000_000; //final = constant
		int vittorie = 0;
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < NUM_LANCI; i++) {
			
			int res1 = d6_1.lancia();
			int res2 = d6_2.lancia();
			
//			System.out.println("dado_1 = " + res1);
//			System.out.println("dado_2 = " + res2);
			
			if (res1 == res2) {
				vittorie++;
//				System.out.println("HAI VINTO!");
			}else {
//				System.out.println("HAI PERSO!");
			}
		}
		
		long stop = System.currentTimeMillis();
		
		System.out.println("L'elaborazione è durata " + (double)(stop-start)/1000 + " secondi!");
		
		if(vittorie == 0) {
			System.out.println("Mi dispiace, non hai vinto!");
		}else {
			System.out.println("Hai vinto " + vittorie + " volte!");
		}
		
	}

}
