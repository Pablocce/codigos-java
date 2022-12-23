package ejercicio6;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;

import ejercicio1.Conector_JDBC_mejorado;
public class JDBC_sentencias_DDL {

	public static void main(String[] args) {
		try (Connection con = Conector_JDBC_mejorado.Conexion("world", "localhost", "3306", "root", "Curso2023")){
			Conector_JDBC_mejorado.muestraConexionOK("world", "localhost", "3306", "root", "Curso2023");
			System.out.println("----------------------------------------------------------");
			Statement stmt = con.createStatement();
			String sentencia = "Drop table if exists paises";
			System.out.println("Sentencia DLL 1: "+ sentencia);
			stmt.execute(sentencia);
			System.out.println("--> Sentecia DROP ejecutada OK");
			
			System.out.println("----------------------------------------------------------");
			String sentencia2 = "create table paises as (select * from country)";
			System.out.println("Sentencia DLL 2: "+ sentencia2);
			stmt.execute(sentencia2);
			System.out.println("--> Sentencia CREATE ejecutada OK");
			
			System.out.println("----------------------------------------------------------");
			String sentencia3 = "ALTER TABLE paises ADD PRIMARY KEY (code)";
			System.out.println("Sentencia DLL 3: "+ sentencia3);
			stmt.execute(sentencia3);
			System.out.println("--> Sentencia ALTER ejecutada OK");
			ResultSet rs = stmt.executeQuery("select count(*) from paises");
			int n = 0;
			if (rs.next()) {
				n = rs.getInt(1);
			}
		
			System.out.println("select count(*) from paises -->" + n);
			
			System.out.println("----------------------------------------------------------");
			String sentencia4 = "TRUNCATE TABLE paises";
			System.out.println("Sentencia DLL 4: "+ sentencia4);
			System.out.println("--> Sentencia TRUNCATE ejecutada OK");
			stmt.execute(sentencia4);
			
			ResultSet rs2 = stmt.executeQuery("select count(*) from paises");
			
			if (rs2.next()) {
				n = rs2.getInt(1);
			}
		
			System.out.println("select count(*) from paises -->" + n);
			stmt.close();
		}catch(SQLException e){
			Conector_JDBC_mejorado.muestraErrorSQL(e,"world","localhost","3306");
		}catch(Exception e) {
			System.err.println(e);
		}

	}

}
