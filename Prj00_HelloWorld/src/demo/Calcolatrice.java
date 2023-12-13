package demo;

public class Calcolatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String saluto = "Hello World!";
		String salutofr = "Bonjour!";
		
		double casuale = Math.random();
		if(casuale < 0.5) {
			System.out.println(saluto);
			
		}else {
			System.out.println(salutofr);
	
		}
		for(int i=0;i < 10; i++) {
			System.out.println(saluto.toUpperCase());
			
		}
		
	}

}
