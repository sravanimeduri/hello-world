package jdbcprograms;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseTableUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
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
		System.out.println("Enter School Name");
		String sname=sc.next();
		int y=st.executeUpdate("update student set school_name='"+sname+"'");
		if(y!=1)
			System.out.println("Record Column Droped");
	}

}
