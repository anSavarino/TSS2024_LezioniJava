package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String URL = "jdbc:mysql://localhost:3306/java";
	private final String USER = "app_tss";
	private final String PSWD = "tss_2024!";
	
	private Connection conn;
	
	private void connetti() {
		try {
			this.conn = DriverManager.getConnection(URL, USER, PSWD);
			System.out.println("Siamo connessi");
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {
		if (conn == null)
			connetti();
		
		return conn;
	}
	
}
