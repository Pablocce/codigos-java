package ejercicio8;

import java.sql.*;
import ejercicio1.Conector_JDBC_mejorado;

public class JDBC_pelicula_disponible {

	public static void main(String[] args) {
		
		try(Connection con = Conector_JDBC_mejorado.Conexion("sakila", "localhost", "3306", "root", "Curso2023")){
			Conector_JDBC_mejorado.muestraConexionOK("sakila", "localhost", "3306", "root", "Curso2023");
			System.out.println("------------------------------------------------------------------------------------");
			
			
			CallableStatement cstmt = con.prepareCall("{ call film_in_stock(?,?,?)}");
			
			String identificadorPelicula = args[0];
			String identificadorAlmacen = args[1];
			
			cstmt.setString(1, identificadorPelicula);
			cstmt.setString(2,identificadorAlmacen);
			
			int peliculas;
			cstmt.registerOutParameter(3,Types.BIGINT);
			
			cstmt.execute();
			
			peliculas = cstmt.getInt(3);
			
			System.out.println("Peliculas en inventario con film_id = "+ args[0] + " y store_id = " + args[1] + ": " + peliculas);
			
			System.out.println("------------------------------------------------------------------------------------");
			
			ResultSet rs = cstmt.getResultSet();
			
			while(rs.next()) {
				System.out.println("inentory_id: "+rs.getInt(1));
			}
			
			cstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
