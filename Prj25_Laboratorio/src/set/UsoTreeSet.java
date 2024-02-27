package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class UsoTreeSet {
	public static void main(String[] args) {
		
		String[] amiciArray = {"Oscar", "Dario", "Mauro", "Luca", "Paolo", "Paolo", "Dario"};
		
//		ArrayList<String> amici = new ArrayList<String>();
		List<String> amici = Arrays.asList(amiciArray);
		
//		for (String amico : amici) {
//			System.out.println(amico);
//		}
		
		amici.forEach(a -> System.out.println(a));
		
		System.out.println("\n------------------------------------------");
		
//		TreeSet<String> invitati = new TreeSet<String>();
//		HashSet<String> invitati = new HashSet<String>();
//		Set<String> invitati = new TreeSet<String>(amici);
		Set<String> invitati = amici.stream().collect(Collectors.toSet());
		
		
//		for (String amico : amiciArray) {
//			invitati.add(amico);
//		}
		
//		for (String amico : invitati) {
//			System.out.println(amico);
//		}
		
		invitati.forEach(a -> System.out.println(a));
		
		
		
		
		
		
		
	}
}
