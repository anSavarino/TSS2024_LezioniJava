package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LeggiScriviFile {

	public static ArrayList<String> leggi(File f){
		
		ArrayList<String> righeFile = new ArrayList<String>();
		
		try {
			Scanner scanner = new Scanner(f);
			while (scanner.hasNextLine()) {
				righeFile.add(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return righeFile;
	}
	
	public static void scrivi(File f, String s) {
		
		try {
			PrintWriter pw = new PrintWriter(f);
			pw.print(s);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
}
