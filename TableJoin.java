package jdbcprograms;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TableJoin {

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
		
		ResultSet rt=st.executeQuery("Select p.firstname, p.lastname,a.city,a.state from person p "
				+ " join address a on p.personid=a.personid");
		
		System.out.println("firstname || lastname || city || state ");	
		while(rt.next()) {
			System.out.println(rt.getString(1)+" ||"+rt.getString(2)+" || "+rt.getString(3)+"||"+rt.getString(4));
			}
			
	}

}
