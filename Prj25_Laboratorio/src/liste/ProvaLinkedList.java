package liste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ProvaLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> giorni = new LinkedList<String>();
		
		giorni.add("lunedì");
		giorni.add("martedì");
		giorni.add("mercoledì");
		giorni.add("giovedì");
		giorni.add("venerdì");
		giorni.add("sabato");
		giorni.add("domenica");
		giorni.add("domenica");
		
		System.out.printf("La dimensione %s di giorni è %s", "della collezione", giorni.size());
	}

}
