import java.sql.*;

public class main {
	public static void main(String arg[]) {
		try {
			Class.forName("com.mysql.ck.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","Pabloyrodrigo1972");
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery("select Pais from country");
			while(rs.next())
				System.out.println("Pais"+rs.getString(1));
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
