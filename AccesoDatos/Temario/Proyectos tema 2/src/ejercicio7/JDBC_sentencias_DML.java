package ejercicio7;

import java.sql.*;
import ejercicio1.Conector_JDBC_mejorado;

public class JDBC_sentencias_DML{
	
	public static void main(String[] args) {
		try(Connection con = Conector_JDBC_mejorado.Conexion("world", "localhost", "3306", "root", "Curso2023")){
			Conector_JDBC_mejorado.muestraConexionOK("world", "localhost", "3306", "root", "Curso2023");
			System.out.println("------------------------------------------------------------------------------");
			Statement stmt = con.createStatement();
			
			
			String sqlSafeUpdates = "SET SQL_SAFE_UPDATES = OFF";
			System.out.println("Sentencia SET:"+ sqlSafeUpdates);
			stmt.execute(sqlSafeUpdates);
			System.out.println("--> Sentencia SET ejecutada OK");
			
			System.out.println("------------------------------------------------------------------------------");
			
			String sentenciaDelete = "delete from paises";
			System.out.println("Sentencia DELETE: " + sentenciaDelete);
			stmt.execute(sqlSafeUpdates);
			System.out.println("--> Sentencia DELETE ejecutada OK");
			
			System.out.println("------------------------------------------------------------------------------");
			
			String sentenciaInsert = "INSERT INTO paises (SELECT * FROM COUNTRY WHERE REGION = 'South America')";
			System.out.println("Sentencia INSERT: "+ sentenciaInsert);
			stmt.execute(sentenciaInsert);
			System.out.println("--> Sentencia INSERT ejecutada OK");
			ResultSet rs = stmt.executeQuery("select count(*) from paises where region = 'South America';");
			int n = 0;
			if (rs.next()) {
				 n = rs.getInt(1);
			}
			
			System.out.println("select count(*) from paises where region = 'South America' --> "+ n);
			
			System.out.println("------------------------------------------------------------------------------");
			
			String sentenciaDelete2 = "DELETE FROM paises WHERE NAME = 'Falkland Islands'";
			System.out.println("Sentencia DELETE: "+sentenciaDelete2);
			stmt.execute(sentenciaDelete2);
			System.out.println("--> Sentencia DELETE ejecutada OK");
			ResultSet rs2 = stmt.executeQuery("select count(*) from paises where region = 'South America'");
			int n2 = 0;
			if (rs2.next()) {
				 n2 = rs2.getInt(1);
			}
			System.out.println("select count(*) from paises where region = 'South America' --> "+ n2);
			
			System.out.println("------------------------------------------------------------------------------");
			
			String sentenciaUpdate = "UPDATE paises SET REGION = 'América del Sur' WHERE REGION = 'South America'";
			System.out.println("Sentencia UPDATE:"+ sentenciaUpdate);
			stmt.execute(sentenciaUpdate);
			System.out.println("--> Sentencia UPDATE ejecutada OK");
			ResultSet rs3 = stmt.executeQuery("select count(*) from paises where region = 'South America'");
			int n3 = 0;
			if (rs3.next()) {
				 n3 = rs3.getInt(1);
			}
			System.out.println("select count(*) from paises where region = 'South America' --> "+ n3);
			stmt.close();
			
		}catch(SQLException e){
			Conector_JDBC_mejorado.muestraErrorSQL(e,"world", "localhost", "3306");
		}
	}

}
