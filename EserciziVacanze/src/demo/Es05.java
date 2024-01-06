package demo;

public class Es05 {

	public static void main(String[] args) {
		/*
		 * 1.5. Esercizio
		Stampare a video la seguente figura:
		# 
		##
		###
		####
		#####
		######
		*/
		
		int righe = 6;
		for (int i = 1; i <= righe; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
			
		}

	}

}
