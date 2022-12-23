package Ejercicio4;

import java.sql.*;
import ejercicio1.Conector_JDBC_mejorado;

public class JDBC_peliculas_scroll {

	public static void muestraPelicula (ResultSet rs, String posicion) throws SQLException {
		System.out.print("-----------------------------------------------------");
		System.out.println("----------------------------------------------------------------------");
		System.out.printf("%5s --> Título: %100s \n",posicion , rs.getString("title"));
		
	}
	public static void main(String[] args) {
		try(Connection con = Conector_JDBC_mejorado.Conexion("sakila", "localhost", "3306", "root", "Curso2023")) {
			Conector_JDBC_mejorado.muestraConexionOK("sakila", "localhost", "3306", "root", "Curso2023");
			String consulta = "select title from film";
			try (Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){
				ResultSet rs;
				rs = stmt.executeQuery(consulta);
				rs.last();
				muestraPelicula(rs,"Ultimo");
				rs.previous();
				muestraPelicula(rs,"Penultimo");
				rs.last();
				muestraPelicula(rs,"Ultimo");
				rs.first();
				muestraPelicula(rs,"Primero");
				rs.next();
				muestraPelicula(rs,"Segundo");
				rs.next();
				muestraPelicula(rs,"Tercero");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
