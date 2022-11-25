package ejercicio2;

import java.sql.*;
import ejercicio1.Conector_JDBC_mejorado;


public class JDBC_select_ciudades_portuguesas {
	
	public static void main(String[] args) {
		try(Connection con = Conector_JDBC_mejorado.Conexion("world", "localhost", "3306", "root", "Curso2023")) {
			Conector_JDBC_mejorado.muestraConexionOK("world", "localhost", "3306", "root", "Curso2023");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select Name, District, Population from city where CountryCode = 'PRT' order by Population DESC");
			System.out.println("-----------------------------------Ciudades de Portugal------------------------------------");
			while (rs.next()) {
				System.out.printf("Ciudad: %35s", rs.getString("Name") + " | ");
				System.out.printf("Distrito: %20s", rs.getString("District")+ " | ");
				System.out.printf("POBLACION: %8s", rs.getString("Population") + "\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

