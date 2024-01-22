package classi;

public class Esecutore {

	public static void main(String[] args) {
		raddoppia(4);
		raddoppia("4");

	}


	private static void raddoppia(int i) {
		System.out.println(i+i);
	}
	private static void raddoppia(String i) {
		System.out.println(i+i);
		
	}

}
