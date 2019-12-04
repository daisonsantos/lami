package br.ucsal.lamis.banco;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	
	
	
	@SuppressWarnings("unused")
	private static Connection Connection = null;
	
	private static java.sql.Connection connection  = null;


	private String conStr = "jdbc:hsqldb:hsql://localhost/lami";
	private String usuario = "sa";
	private String senha = "";
	
	private Connection() {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			connection =  DriverManager.getConnection(conStr, usuario, senha);
			connection.createStatement().execute("CREATE TABLE IF EXISTS LAMI  ( " + 
					"  ID BIGINT IDENTITY PRIMARY KEY," + 
					"  LAMI VARCHAR(255), PAPEL VARCHAR(255)" + 
					");");
			connection.createStatement().execute("CREATE TABLE IF EXISTS RESERVA ("
					+ "ID BIGINT IDENTITY PRIMARY KEY, "
					+"RESERVA VARCHAR(15), "
					
					+ ");");

		
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	
	}
	
	public static Connection getConnection(Connection Connection) {
		if(Connection == null ) {
			Connection = new Connection();
		}
		return Connection;
	}
	
	
	
	

}