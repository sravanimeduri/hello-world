package jdbcprograms;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Betweenex1 {

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
		System.out.println(st);
		
		ResultSet rt=st.executeQuery("Select * from student where sid > any(Select sid from student"
				+ " where sid between 1022 and 1026)");
		
		System.out.println("sid || sname || marks || section || school_name");	
		while(rt.next()) {
			System.out.println(rt.getInt(1)+" ||"+rt.getString(2)+" || "+rt.getInt(3)+"||"+rt.getString(4)+"||"+rt.getString(5));
			}
			
	}

}
