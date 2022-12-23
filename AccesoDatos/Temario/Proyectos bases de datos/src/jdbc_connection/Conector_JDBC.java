package jdbc_connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conector_JDBC {
	
	
	public static void muestraErrorSQL(SQLException e) {
		System.out.println("SQL ERROR mensaje: " + e.getMessage());
		System.out.println("SQL Estado: " + e.getSQLState());
		System.out.println("SQL código específico: " + e.getErrorCode());
	}
	
	public static void muestraConexionOK() {
		System.out.println("Conexión realizada OK.");
	}
	
	public static Connection Conexion(String basededatos, String host, String port, String user, String pwd)
	throws SQLException {
		String urlConnection = "jdbc:mysql://"+host+":"+port+"/"+basededatos;
		return DriverManager.getConnection(urlConnection, user, pwd);
	}

}