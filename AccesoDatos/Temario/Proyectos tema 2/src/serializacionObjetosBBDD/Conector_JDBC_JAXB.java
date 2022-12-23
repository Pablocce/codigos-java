package serializacionObjetosBBDD;


import java.sql.*;

public class Conector_JDBC_JAXB {

	private static String urlConnection;
	
	public static String getUrlConnection() {
		return Conector_JDBC_JAXB.urlConnection;
	}
	
	public static void muestraErrorSQL(SQLException e) {
		System.out.println("ERROR Conexion" + urlConnection);
		System.out.println("SQL ERROR mensaje: " + e.getMessage());
		System.out.println("SQL Estado: " + e.getSQLState());
		System.out.println("SQL codigo especifico: " + e.getErrorCode());
	}
	
	public static void muestraConexionOK() {
		System.out.println("Conexión " +urlConnection + " realizada OK");
	}
	
	public static Connection Conexion(String baseedatos, String host, String port, String user, String pwd)
	throws SQLException {
		String urlConnection = "jdbc:mysql://" +host+":"+port+"/"+baseedatos;
		Conector_JDBC_JAXB.urlConnection = urlConnection;
		return DriverManager.getConnection(urlConnection, user, pwd);
	}
}
