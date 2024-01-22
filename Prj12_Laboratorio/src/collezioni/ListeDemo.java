package collezioni;

import java.util.ArrayList;

public class ListeDemo {

	public static void main(String[] args) {
		
		ArrayList<String> citta = new ArrayList<String>();
		
		citta.add("Torino");
		citta.add("Milano");
		citta.add("Roma");
		citta.add("Napoli");
		citta.add("Palermo");
		
		int numeroCitta = citta.size();
		System.out.println(numeroCitta);
		
		citta.remove(2);
		
		for (String c : citta) {
			System.out.println(c);
		}
		
		numeroCitta = citta.size();
		System.out.println(numeroCitta);
	}

}
