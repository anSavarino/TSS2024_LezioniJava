package demo;

public class ProvaArrayString {

	public static void main(String[] args) {
		
		String[] note = {"DO","RE","MI","FA","SOL","LA","SI"};
		
		System.out.println(note.length);
		
		for (int i = 0; i < note.length; i++) {
			System.out.println("La nota alla posizione "+i+ " è " + note[i]);
		}
		
	}

}
