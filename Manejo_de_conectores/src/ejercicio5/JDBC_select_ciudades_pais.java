package ejercicio5;

import java.sql.*;
import ejercicio1.Conector_JDBC_mejorado;


public class JDBC_select_ciudades_pais {
	
	public static void main(String[] args) {
		try(Connection con = Conector_JDBC_mejorado.Conexion("world", "localhost", "3306", "root", "Curso2023")) {
			Conector_JDBC_mejorado.muestraConexionOK("world", "localhost", "3306", "root", "Curso2023");
			CallableStatement cstmt = con.prepareCall("{? = {call ciudades_pais(?)}");
			cstmt.setString(1, "ARG");
			cstmt.execute();
			ResultSet rs = cstmt.getResultSet();
			System.out.println("-----------------------------------Ciudades de Portugal------------------------------------");
			while (rs.next()) {
				System.out.printf("Ciudad: %35s", rs.getString("Name") + " | ");
				System.out.printf("Distrito: %20s", rs.getString("District")+ " | ");
				System.out.printf("POBLACION: %8s", rs.getString("Population") + "\n");
			}
			cstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}