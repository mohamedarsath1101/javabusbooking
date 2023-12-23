package JDBC_C;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Con {

	public static void main(String[] args) throws SQLException {
		//readrecord();
		insertrecord();
		//insertusingpst();
		//delete();
		//update();
		
	}
	
	public static void readrecord() throws SQLException{
		String url="jdbc:postgresql://localhost:5432/postgres";
		String username="postgres";
		String password="arsath";
		String query="select*from d";
		Connection cont=DriverManager.getConnection(url,username,password);
		Statement s=cont.createStatement();
		ResultSet r=s.executeQuery(query);
				
		while(r.next()) {
			System.out.println("id is: "+ r.getString(1));
			System.out.println("name is: "+ r.getString(2));
			
		}
		
		cont.close();
		
		
	}
	public static void insertrecord() throws SQLException{
		String url="jdbc:postgresql://localhost:5432/postgres";
		String username="postgres";
		String password="arsath";
		String query="insert into  d values ('nagur','15-11-2023')";
		Connection cont=DriverManager.getConnection(url,username,password);
		Statement s=cont.createStatement();
		int row=s.executeUpdate(query);
				
		System.out.println(" number of row affected :" + row);
		cont.close();
		
		
	}
	
	public static void insertusingpst() throws SQLException{
		String url="jdbc:postgresql://localhost:5432/postgres";
		String username="postgres";
		String password="arsath";
		int id=6;
		String name="noor";
		
		String query="insert into airbus values (?,?)";
		Connection cont=DriverManager.getConnection(url,username,password);
		
		PreparedStatement pst=cont.prepareStatement(query);
		pst.setInt(1, id);
		pst.setString(2, name);
		int rows=pst.executeUpdate();
		
		
				
		System.out.println(" number of row affected :" + rows);
		cont.close();
		
		
	}
	public static void delete() throws SQLException{
		String url="jdbc:postgresql://localhost:5432/postgres";
		String username="postgres";
		String password="arsath";
		int id_=5;
	//	String query="update airbus  set name='MOHAMED ARSATH' where name='arsath'";
		String query1="delete from airbus where id_=1101";
		Connection cont=DriverManager.getConnection(url,username,password);
		Statement s=cont.createStatement();
		int row=s.executeUpdate(query1);
				
		System.out.println(" number of row affected :" + row);
		cont.close();
		
		
	}
	
	public static void update() throws SQLException{
		String url="jdbc:postgresql://localhost:5432/postgres";
		String username="postgres";
		String password="arsath";
		int id_=5;
		String query="update airbus  set name='JAFFRIN' where name='jaffrin'";
	//	String query1="delete from airbus where id_=1101";
		Connection cont=DriverManager.getConnection(url,username,password);
		Statement s=cont.createStatement();
		int row=s.executeUpdate(query);
				
		System.out.println(" number of row affected :" + row);
		cont.close();
		
		
	}
	
	

}
