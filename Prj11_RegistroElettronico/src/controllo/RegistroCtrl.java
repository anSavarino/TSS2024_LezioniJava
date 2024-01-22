package controllo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import modello.Registro;
import modello.Studente;

public class RegistroCtrl {
	
	private Registro registro;
	private ArrayList<Studente> presenti;
	private ArrayList<Studente> assenti;

	public RegistroCtrl(Registro registro) {
		this.registro = registro;
		this.presenti = new ArrayList<Studente>();
		this.assenti = new ArrayList<Studente>();
	}
	
	public void caricaStudentiDaFile() {
		System.out.println("Inserisci percorso file studenti:");
		Scanner sc = new Scanner(System.in);
		String percorso = sc.nextLine();
		File fileDiTesto = new File(percorso);
		//File fileDiTesto = new File("src\\Documenti\\studenti.txt");
		
		try {
			Scanner scanner = new Scanner(fileDiTesto);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parole = line.split(",");
				String nomeStudente = parole[0];
				String cognomeStudente = parole[1];
				Studente s = new Studente(nomeStudente, cognomeStudente);
				this.registro.aggiungiStudente(s);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void faiAppello() {
		Scanner scanner = new Scanner(System.in);
		for (Studente studente : this.registro.getAllSundenti()) {
			System.out.println("E' presente lo studente "+studente+" ?");
			String presente = scanner.nextLine();
			if (presente.toLowerCase().equals("si")) {
				presenti.add(studente);
			}else {
				assenti.add(studente);
			}
		}
	}
	
	public void stampaPresenti() {
		for (Studente studente : presenti) {
			System.out.println(studente);
		}
		System.out.println("Sono presenti "+presenti.size()+" studenti");
	}
	
	public void stampaAssenti() {
		for (Studente studente : assenti) {
			System.out.println(studente);
		}
		System.out.println("Sono assenti "+assenti.size()+" studenti");
	}
}
