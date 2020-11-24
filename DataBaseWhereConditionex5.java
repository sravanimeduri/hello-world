package jdbcprograms;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataBaseWhereConditionex5 {

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
		
		ResultSet rt=st.executeQuery("Select sid,sname from student where sid in(1023,1024)");
		while(rt.next()) {
			System.out.println(rt.getInt(1)+ " "+rt.getString(2));
			}
	}

}
