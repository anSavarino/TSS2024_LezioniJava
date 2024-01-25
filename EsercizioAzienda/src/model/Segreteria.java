package model;

public class Segreteria {

	public static String creaID(String nome, String cognome, int eta){
		return ""+nome.charAt(0)+nome.charAt(1)+cognome.charAt(0)+cognome.charAt(1)+eta;
	}
}
