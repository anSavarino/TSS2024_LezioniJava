package vista;
import modello.Studente;

public class StudenteDemo {

	public static void main(String[] args) {
		
		Studente s1 = new Studente("Angelo", "Savarino");
		Studente s2 = new Studente("Giulia", "Artuso");
		Studente s3 = new Studente("Leonardo", "Castaldo");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
