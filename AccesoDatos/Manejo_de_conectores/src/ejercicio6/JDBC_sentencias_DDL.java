package ejercicio6;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;

import ejercicio1.Conector_JDBC_mejorado;
public class JDBC_sentencias_DDL {

	public static void main(String[] args) {
		try (Connection con = Conector_JDBC_mejorado.Conexion("world", "localhost", "3306", "root", "Curso2023")){
			Statement stmt = con.createStatement();
			String sentencia = "Drop table if exist paises";
			System.out.println("Sentencia DLL 1: "+ sentencia);
			stmt.execute(sentencia);
			System.out.println("--> Sentecia DROP ejecutada OK");
		}catch{
			
		}

	}

}
