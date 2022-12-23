package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_connection {
public static void muestraErrorSQL (SQLException e) {
System.out.println("SQL ERROR mensaje: " + e.getMessage()); 
System.out.println("SQL Estado: " + e.getSQLState());
System.out.println("SQL código específico:" + e.getErrorCode());

}

public static void main(String[] args) {

String baseedatos = "world";
String host = "localhost"; 
String port = "3306";
String urlConnection = "jdbc:mysql://"+host+":"+port+"/"+baseedatos;
String user = "root";
String pwd= "Curso2023";

try (Connection c=DriverManager.getConnection (urlConnection, user, pwd)) {

	System.out.println("Conexión realizada.");

	} catch (SQLException e) {

			muestraErrorSQL(e);
	} catch (Exception e) {
		e.printStackTrace(System.err);}
	}

}