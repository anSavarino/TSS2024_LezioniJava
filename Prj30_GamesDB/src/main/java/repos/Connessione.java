package repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	
	private final String HOST ="jdbc:mysql://localhost:3306/java";
	private final String USER ="app_tss";
	private final String PASS ="tss_2024!";
	
	private Connection conn;
	
	public Connection getConn() {
		if (this.conn == null) {
			this.connetti();
		}
		return conn;
	}
	
	private void connetti() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection(HOST, USER, PASS);
			System.out.println("CONNESSI");
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println("ERRORE:"+e.getMessage());
		}
	}
	
	private void disconnetti() {
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (SQLException e) {
				System.err.println("ERRORE:"+e.getMessage());
			}
		}
	}
}
