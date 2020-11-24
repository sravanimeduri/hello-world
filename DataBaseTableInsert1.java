package jdbcprograms;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseTableInsert1 {

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
		System.out.println("Enter Student Id");
		int id=sc.nextInt();
		
		System.out.println("Enter Student Name");
		String name=sc.next();
		
		System.out.println("Enter Student Marks");
		int marks=sc.nextInt();
		
		System.out.println("Enter Student Section");
		String section=sc.next();
		
		System.out.println("Enter Student School Name");
		String school_name=sc.next();
	
		int x=st.executeUpdate("insert into student values("+id+",'"+name+"',"+marks+",'"+section+"','"+school_name+"')");
		if(x!=0)
			System.out.println("Record Inserted");	
	}

}
