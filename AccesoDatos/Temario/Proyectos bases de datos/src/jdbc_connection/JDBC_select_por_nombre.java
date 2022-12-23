package jdbc_connection;

import java.sql.*;

public class JDBC_select_por_nombre {

	public static void main(String[] args) {
		try (Connection con = Conector_JDBC.Conexion("employees", "localhost", "3306", "root", "Curso2023")){
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from departments");
			while (rs.next()) {
				System.out.print("dept_no: " + rs.getString("dept_no") + " |");
				System.out.println("dept_name: " + rs.getString("dept_name"));
			}
			
			stmt.close();
		} catch (SQLException e) {
			Conector_JDBC.muestraErrorSQL(e);
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}

