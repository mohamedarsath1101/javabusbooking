package lakabus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
	private static final String url="jdbc:postgresql://localhost:5432/postgres";
	private static final String username="postgres";
	private static final String password="arsath";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,username,password);
		
		
	}

}
