package demo;

public class ProvaString {

	public static void main(String[] args) {

		
		String saluto = "ciao"; //primo modo per inizializzare una stringa
		String salutoObj = new String("ciao"); //modo alternativo per inizializzare una string
		
		char[] saluto2 = {'c','i','a','o'};
		
		char[]saluto3 = saluto.toCharArray();//ottengo un char array da una string
		
		String saluto4 = new String(saluto2); //ottengo una string da un char array
		
		
		char primochar = saluto.charAt(0);
		char primochar2 = saluto2[0];
		
		System.out.println(primochar == primochar2);
		
		System.out.println(saluto.length() == saluto2.length);
	}

}
