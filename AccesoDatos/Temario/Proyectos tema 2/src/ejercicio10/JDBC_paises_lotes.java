package ejercicio10;

import java.sql.*;
import ejercicio1.Conector_JDBC_mejorado;

public class JDBC_paises_lotes {

	public static void main(String[] args) {
		
		try(Connection con = Conector_JDBC_mejorado.Conexion("world", "localhost", "3306", "root", "Curso2023")){
			Conector_JDBC_mejorado.muestraConexionOK("world", "localhost", "3306", "root", "Curso2023");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select count(*) from paises where Region = 'Caribbean'");
			int n = 0;
			if (rs.next()) {
				n = rs.getInt(1);
			}
			System.out.println("Número de filas de la tabla paises con región caribbean:  " + n);
			stmt.close();
		}catch(SQLException e){
			Conector_JDBC_mejorado.muestraErrorSQL(e,"world","localhost","3306");
		}catch(Exception e) {
			System.err.println(e);
		}
	}

}
