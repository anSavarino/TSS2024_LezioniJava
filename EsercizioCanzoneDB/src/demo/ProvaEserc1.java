package demo;

public class ProvaEserc1 {
	public static void main(String[] args) {
		Canzone s1 = new Canzone("a",200,"c1");
		Canzone s2 = new Canzone("a",300,"c2");
		Canzone s3 = new Canzone("a3",400,"c3");
		System.out.println(s1);
		System.out.println(s1.haAutore("c1"));
		System.out.println(s1.haAutore("c2"));
		System.out.println(s1.uguali(s2));
		System.out.println(s1.uguali(s3));
		Playlist pref = new Playlist();
		pref.aggiungi("Forever young", 300, "Bob Dylan");
		pref.aggiungi("Tomorrow never comes", 300, "The Beatles");
		pref.aggiungi("To Ramona", 400, "Bob Dylan");
		pref.aggiungi("She's leaving home", 150, "The Beatles");
		pref.aggiungi("Martha my dear", 300, "The Beatles");
		pref.aggiungi("Someday never comes", 430, "Creedence Clearwater Revival");

		System.out.println(pref.quanteAutore("Bob Dylan"));
		System.out.println(pref.quanteAutore("The Beatles"));
		System.out.println(pref.quanteAutore("Franco Califano"));
		System.out.println(pref.quanteAutore("Creedence Clearwater Revival"));

		pref.stampaAutore("The Beatles");
		pref.eliminaAutore("The Beatles");
		pref.stampaAutore("The Beatles");
		System.out.println(pref.quanteAutore("Bob Dylan"));
		System.out.println(pref.quanteAutore("The Beatles"));
		System.out.println(pref.quanteAutore("Creedence Clearwater Revival"));

		System.out.println(pref.haDuplicati());
		pref.aggiungi("To Ramona", 400, "Bob Dylan");
		System.out.println(pref.haDuplicati());
		}
}
