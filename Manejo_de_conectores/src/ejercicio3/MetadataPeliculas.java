package ejercicio3;

import java.sql.*;
import ejercicio1.Conector_JDBC_mejorado;

public class MetadataPeliculas {

	public static void main(String[] args) {
		try (Connection con = Conector_JDBC_mejorado.Conexion(args[0], "localhost", "3306", "root", "Curso2023")){
			DatabaseMetaData dbmd = con.getMetaData();
			ResultSet rs = null;
			String nombre = dbmd.getDatabaseProductName();
			String driver = dbmd.getDriverName();
			String url = dbmd.getURL();
			String usuario = dbmd.getUserName();
			
			System.out.println("==============================================================================");
			System.out.println("                         Informaci�n sobre la conexi�n");
			System.out.println("==============================================================================");
			System.out.printf("Nombre : %s %n", nombre);
			System.out.printf("Driver : %s %n", driver);
			System.out.printf("URL: %s %n", url);
			System.out.printf("Usuario: %s %n", usuario);
			System.out.println("==============================================================================");
			rs = dbmd.getTables(args[0], null, args[1], null);
			System.out.printf("                         TABLAS DE LA BASE DE DATOS %s %n", args[0]);
			System.out.println("==============================================================================");
			
			while(rs.next()) {
				String catalogo = rs.getString(1);
				String esquema = rs.getString(2);
				String tabla = rs.getString(3);
				String tipo = rs.getString(4);
				System.out.printf("Tipo: %s - Catalogo: %s, Esquema: %s, Nombre:%s %n", tipo, catalogo, esquema,tabla);
			}
			System.out.println("==============================================================================");
			rs.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}