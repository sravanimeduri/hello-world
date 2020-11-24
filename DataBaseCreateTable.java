package jdbcprograms;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseCreateTable {

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
		int x=st.executeUpdate("create table student(sid int(10),sname varchar(20),marks int(10),section varchar(20))");
		if(x!=0)
			System.out.println("Record Table Created");	
	}

}
