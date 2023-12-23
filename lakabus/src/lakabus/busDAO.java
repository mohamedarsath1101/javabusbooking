package lakabus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class busDAO {

	public void displayBusInfo() throws SQLException {
		String query="select * from mybook";
		Connection cont=connection.getConnection();
		Statement st=cont.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("bus no:"+ rs.getInt(1));
			if(rs.getInt(2)==0)
				System.out.println("Ac: no");
			else 
				System.out.println("Ac :yes");
			System.out.println("capacity:" + rs.getInt(3));
		}
		
		System.out.println("................diii");
		
		
	}
	public int getCapacity(int id) throws  SQLException{
		String query="select Capacity from mybook where id=" +id;
		Connection cont=connection.getConnection();
		Statement st=cont.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}
	

}
