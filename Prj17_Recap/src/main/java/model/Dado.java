package model;

import java.util.Random;

public class Dado {
	
//	stato interno
	private int facce;
	private String color;
	private int faccia;
	
	public Dado() { //Scompare il costruttore di default
		this.facce = 6;
		this.color = "bianco";
	}
	
//	overload
	public Dado(int facce) {
		this.facce = facce;
		this.color = "bianco";
	}
	
	public Dado(String color) {
		this.color = color;
		this.facce = 6;
	}
	
	public Dado(int facce, String color) {
		this.facce = facce;
		this.color = color;
	}
	
	public void lancia() {
		Random r = new Random();
		this.faccia = r.nextInt(1, this.facce + 1);
		
	}
	
	public int getFaccia() {
		return faccia;
	}
}
