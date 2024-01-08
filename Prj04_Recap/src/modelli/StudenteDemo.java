package modelli;

public class StudenteDemo {

	public static void main(String[] args) {
		Studente s1 = new Studente("Angelo", "Savarino", 1993);
		
		s1.sostieneEsame(30, 0);
		s1.sostieneEsame(20, 1);
		s1.sostieneEsame(23, 2);
		s1.sostieneEsame(25, 3);
		s1.sostieneEsame(24, 4);
		s1.sostieneEsame(28, 5);
		s1.sostieneEsame(30, 6);
		
		System.out.println("Lo studente");
		System.out.println(s1.informazioni());
		System.out.println("Ha la media");
		System.out.println(s1.calcolaMedia());
		
		s1.sostieneEsame(18, 7);
		System.out.println("Adesso ha la media");
		System.out.println(s1.calcolaMedia());
	}

}
