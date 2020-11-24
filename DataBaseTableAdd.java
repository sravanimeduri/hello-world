package jdbcprograms;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseTableAdd {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		
		
		System.out.println(con);
		
		if(con!=null) {
			System.out.println("Connection Established");
		}
		Statement st=con.createStatement();
	
		int x=st.executeUpdate("alter table student add(school_name varchar(20))");
		if(x!=1)
			System.out.println("Record Added");
		
	}

}
