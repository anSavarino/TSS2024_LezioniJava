package controller;

import java.util.ArrayList;

import model.Libro;

public class Libreria {
	
	private ArrayList<Libro> libri;
	private String nome;
	
	public Libreria(String nome) {
		
		this.nome = nome;
		this.libri = new ArrayList<Libro>();
	}
	
	public void addLibro(Libro l) {
		this.libri.add(l);
	}
	
	public ArrayList<Libro> getLibri(){
		return this.libri;
	}
	
	public Libro getLibroByCollocazaione(String collocazione) {
		Libro l = null;
		for (Libro libro : libri) {
			if (libro.getCollocazione().equals(collocazione)) {
				l = libro;
			}
		}
		return l;
	}
	
	public void updateLibro(Libro l) {
		int posLibroOriginale = this.libri.indexOf(l);
//		Libro originale = this.libri.get(posLibroOriginale);
		this.libri.add(posLibroOriginale, l);
	}
	
	public void deleteLibro(Libro l) {
		this.libri.remove(l);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		StringBuilder output = new StringBuilder();
		output.append("<h2>"+this.nome+"</h2>");
		output.append("<ul>");
		output.append("\n");
		
		for (Libro libro : libri) {
			output.append(libro);
			output.append("\n");
		}
		output.append("</ul>");
		
		return output.toString();
	}
	
}
