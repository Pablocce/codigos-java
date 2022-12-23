package jdbc_connection;

import java.sql.*;
import jdbc_connection.Conector_JDBC;

public class JDBC_procedimiento_almacenado {

	public static void main(String[] args) {
		try (Connection con = Conector_JDBC.Conexion("employees", "localhost", "3306", "root", "Curso2023")) {
			CallableStatement cstmt = con.prepareCall("{call proc_ultimos_salarios(?,?,?)}");
			
			Date fecha_desde = Date.valueOf("200-01-01");
			cstmt.setDate(1, fecha_desde);
			
			long sueldos_acumulados = 300000000;
			cstmt.setLong(2, sueldos_acumulados);
			
			cstmt.registerOutParameter(2, Types.BIGINT);
			System.out.println("Parametro E/S antes: " + sueldos_acumulados);
			
			int max_salario;
			cstmt.registerOutParameter(3,Types.INTEGER);
			
			cstmt.execute();
			sueldos_acumulados = cstmt.getLong(2);
			System.out.println("Parametro E/S después: " + sueldos_acumulados);
			
			max_salario = cstmt.getInt(3);
			System.out.println("Parametro SALIDA: "+ max_salario);
			
			System.out.println("------------------------------------------------");
			System.out.println("                  ResultSet                     ");
			System.out.println("------------------------------------------------");
			ResultSet rs = cstmt.getResultSet();
			while (rs.next()) {
				System.out.println("N Empleado: " + rs.getInt(1));
				System.out.println(" | Apellido: "+ rs.getString(2));
			}
			
			cstmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Conector_JDBC.muestraErrorSQL(e);
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
