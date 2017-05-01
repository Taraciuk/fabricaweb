package br.com.fabrica.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoFactory {

	
	public static Connection getConnection() {
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "teste123");
		properties.setProperty("useSSL", "false");
		properties.setProperty("autoReconnect", "true");
		
		try {			
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/fabricaweb", properties);
		} catch (SQLException e) {
			throw new RuntimeException(e);			
		}
	}

}
