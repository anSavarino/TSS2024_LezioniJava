package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import controller.Libreria;
import model.Libro;

public class App {
	public static void main(String[] args) {

		Libreria libreria = new Libreria("Scaffale1");
		File f = new File("./Biblioteca.csv");
		File destinazione = new File("biblioteca.html");
		try {
			Scanner scanner = new Scanner(f);

			while (scanner.hasNextLine()) {
				String riga = scanner.nextLine();
				String[] parole = riga.split(",");
				String autore = parole[1];
				String titolo = parole[2];
				libreria.addLibro(new Libro(titolo, autore));
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		Libro libro1 = new Libro("Promessi Sposi","Manzoni");
//		Libro libro2 = new Libro("Io,Robot","Asimov");
//		Libro libro3 = new Libro("IMalavoglia","Verga");
//		Libro libro4 = new Libro("Mmmmm","Lllll");
//		Libro libro5 = new Libro("Sssss","Nnnn");
//		Libro libro6 = new Libro("Zzzz","Eeeeee");
//		
//		libreria.addLibro(libro1);
//		libreria.addLibro(libro2);
//		libreria.addLibro(libro3);
//		libreria.addLibro(libro4);
//		libreria.addLibro(libro5);
//		libreria.addLibro(libro6);
//		
		ArrayList<Libro> libri = libreria.getLibri();
		

		Libro l = libreria.getLibroByCollocazaione("ManPro14");
//		System.out.println(l);

		if (l != null)
			l.setDisponibile(false);
//		System.out.println(l);

		libreria.deleteLibro(l);
		try {
			PrintWriter pw = new PrintWriter(destinazione);
			pw.println("<h1>Numero libri: " + libri.size() + "</h1>");
			pw.println("<ul>");
			
			for (Libro libro : libreria.getLibri()) {
				pw.println("<li>" + libro.getTitolo() + "</li>");
			}
			pw.println("</ul>");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
