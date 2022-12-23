package ejercicio1;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conector_JDBC_mejorado {
	
	
	public static void muestraErrorSQL(SQLException e, String basededatos, String host, String port ) {
		System.out.println("ERROR Conexion " + "jdbc:mysql://"+host+":"+port+"/"+basededatos);
		System.out.println("SQL ERROR mensaje: " + e.getMessage());
		System.out.println("SQL Estado: " + e.getSQLState());
		System.out.println("SQL codigo especifico: " + e.getErrorCode());
	}
	
	public static void muestraConexionOK(String basededatos, String host, String port, String user, String pwd) {
		System.out.println("Conexion " + "jdbc:mysql://"+host+":"+port+"/"+basededatos + " realizada OK.");
	}
	
	public static Connection Conexion(String basededatos, String host, String port, String user, String pwd)
	throws SQLException {
		String urlConnection = "jdbc:mysql://"+host+":"+port+"/"+basededatos;
		return DriverManager.getConnection(urlConnection, user, pwd);
	}

}