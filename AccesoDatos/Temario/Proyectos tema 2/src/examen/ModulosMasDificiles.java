package examen;

import java.sql.*;
import ejercicio1.Conector_JDBC_mejorado;


public class ModulosMasDificiles {
	
	public static void main(String[] args) {
		try(Connection con = Conector_JDBC_mejorado.Conexion("world", "localhost", "3306", "root", "Curso2023")) {
			Statement stmt = con.createStatement();
			con.setAutoCommit(false);
			String sentencia = null;
			sentencia = "CREATE TABLE modulo (";
			sentencia += " NOMBRE varchar(60) NOT NULL,";
			sentencia += " HORAS int NOT NULL,";
			sentencia += "  CODIGO char(4) NOT NULL,";
			sentencia += " CURSO int NOT NULL,";
			sentencia += " CICLO char(3) NOT NULL,";
			sentencia += "  PRIMARY KEY (CODIGO)";
			sentencia += " );";
			stmt.execute(sentencia);
			System.out.println("			Create table realizado");
			System.out.println("==================================================");
			
			String sentencia2 = null;
			sentencia2 = "Insert into modulo values";
			sentencia2 += " ('Bases de datos', 205, '0484', 1, 'DAM'),\r\n"
					+ "  ('Sistemas informaticos', 205, '0483', 1, 'DAM'),\r\n"
					+ "  ('Entornos de desarrollo', 90, '0487', 1, 'DAM'),\r\n"
					+ "  ('Formacion y orientacion laboral', 90, '0493', 1, 'DAM'),\r\n"
					+ "  ('Lenguajes de marcas y sistemas de gestion de informacion', 140, '0373', 1, 'DAM'),\r\n"
					+ "  ('Programacion', 270, '0485', 1, 'DAM'),\r\n"
					+ "  ('Acceso a datos', 120, '0486', 2, 'DAM'),\r\n"
					+ "  ('Desarrollo de interfaces', 120, '0488', 2, 'DAM'),\r\n"
					+ "  ('Empresa e iniciativa emprendedora', 65, '0494', 2, 'DAM'),\r\n"
					+ "  ('Ingles tecnico para grado superior', 40, '0180', 2, 'DAM'),\r\n"
					+ "  ('Programacion de Servicios y Procesos', 80, '0490', 2, 'DAM'),\r\n"
					+ "  ('Programacion multimedia y dispositivos moviles', 80, '0489', 2, 'DAM'),\r\n"
					+ "  ('Sistemas de Gestion Empresarial', 95, '0491', 2, 'DAM'),\r\n"
					+ "  ('Proyecto de desarrollo de aplicaciones multiplataforma', 30, '0492', 2, 'DAM'),\r\n"
					+ "  ('Formacion en Centros de Trabajo', 370, '0495', 2, 'DAM')  ";
			stmt.execute(sentencia2);
			System.out.println("		Sentencia insert realizada correctamente");
			System.out.println("==================================================");
			String sentencia3 = "select * from MODULO order by curso desc,horas desc, nombre asc";
			ResultSet rs = stmt.executeQuery(sentencia3);
			while(rs.next()) {
				System.out.printf("%60s %3d %4s %1d %3s %n", rs.getString("nombre"), rs.getInt("horas"), rs.getString("codigo"), rs.getInt("curso"), rs.getString("ciclo"));
			}
			
			
			
			
			String sentencia4 = "select count(*) from modulo";
			ResultSet rs2 = stmt.executeQuery(sentencia4);
			int n = 0;
			if (rs2.next()) {
				n = rs2.getInt(1);
			}
			System.out.println("Módulos disponibles: " + n);
			
			stmt.execute("ROLLBACK");
			
			System.out.println("==================================================");
			
			ResultSet rs3 = stmt.executeQuery(sentencia4);
			int n2 = 0;
			if(rs3.next()) {
				n2 = rs3.getInt(1);
			}
			System.out.println("Módulos disponibles: " + n2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

