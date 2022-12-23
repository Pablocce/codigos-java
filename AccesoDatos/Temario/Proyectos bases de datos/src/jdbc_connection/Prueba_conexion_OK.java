package jdbc_connection;
import java.sql.Connection;
import java.sql.SQLException;

public class Prueba_conexion_OK {

	public static void main(String[] args) {
		try (Connection con = Conector_JDBC.Conexion("world", "localhost", "3306", "root", "Curso2023")){
			Conector_JDBC.muestraConexionOK();
		}catch (SQLException e) {
			Conector_JDBC.muestraErrorSQL(e);
		}catch (Exception e) {
			System.err.println(e);
		}
	}

}
