package ejercicio1;

import java.sql.Connection;
import java.sql.SQLException;

public class Prueba_conexiones {

	public static void main(String[] args) {
		String[] bbdd = {"employees", "sakila", "world", "fake"};
		for (String bd:bbdd) {
			try (Connection con = Conector_JDBC_mejorado.Conexion(bd, "localhost", "3306", "root", "Curso2023")) {
				Conector_JDBC_mejorado.muestraConexionOK(bd, "localhost", "3306", "root", "Curso2023");
			} catch (SQLException e) {
				Conector_JDBC_mejorado.muestraErrorSQL(e, bd, "localhost", "3306");
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}

}