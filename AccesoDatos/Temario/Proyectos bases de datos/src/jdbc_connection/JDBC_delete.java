package jdbc_connection;

import java.sql.*;
import jdbc_connection.Conector_JDBC;

public class JDBC_delete {
	public static void main(String[] args) {
		try(Connection con = Conector_JDBC.Conexion("employees", "localhost", "3306", "root", "Pabloyrodrigo1972")) {
			con.setAutoCommit(true);
			Statement stmt = con.createStatement();
			String sentenciaDDL = null;
			sentenciaDDL ="   create table if not exists VISITANTE_TEMPORAL (              \n";
			sentenciaDDL +="   DNI         char(9) not null,          \n";
			sentenciaDDL +="   NOMBRE      varchar(20) not null,      \n";
			sentenciaDDL +="   AP1         varchar(20) not null,      \n";
			sentenciaDDL +="   AP2         varchar(20) null,          \n";
			sentenciaDDL +="   DIRECCION   varchar(30),               \n";
			sentenciaDDL +="   TFNO        varchar(9),                \n";
			sentenciaDDL +="   PRIMARY KEY (DNI)           )";
			System.out.println("-----------------------------------------");
			System.out.printf("Sentencia DDL: \n  %s  \n", sentenciaDDL);
			stmt.execute(sentenciaDDL);
			System.out.println("-----------------------------------------");
			System.out.println("DDL OK");
			System.out.println("-----------------------------------------");
			
			sentenciaDDL = "truncate table VISITANTE_TEMPORAL";
			stmt.execute(sentenciaDDL);
			System.out.printf("Sentencia DDL: \n  %s  \n", sentenciaDDL);
			System.out.println("-----------------------------------------");
			System.out.println("DDL OK");
			
			String sentenciaDML = null;
			sentenciaDML = "insert into VISITANTE_TEMPORAL values \n ";
			sentenciaDML += " ('12345678A', 'Mario', 'Rodrigues', null, null, 917458722), \n";
			sentenciaDML += " ('23456789B', 'Laura', 'Perez', 'Jimenez', null, null),     \n";
			sentenciaDML += " ('34567890C', 'John', 'Smith', null, 'Desconocida', null)  \n";
			System.out.println("------------------------------------------------------------");
			System.out.printf("Sentencia DML: \n %s \n", sentenciaDML);
			stmt.execute(sentenciaDML);
			System.out.println("------------------------------------------------------------");
			System.out.println("DML OK");
			System.out.println("------------------------------------------------------------");
			
			String consulta1 = "select DNI, NOMBRE, AP1, AP2,DIRECCION, TFNO"; ;
			String consulta2 = " from VISITANTE_TEMPORAL";
			String consulta3 = " order by DNI";
			System.out.printf("Consulta: \n %s \n     %s \n      %s  \n", consulta1, consulta2, consulta3);
			System.out.println("---------------------------ANTES DE LA SENTENCIA DELETE----------------------------------");
			ResultSet rs = stmt.executeQuery(consulta1+consulta2+consulta3);
			while (rs.next()) {
				System.out.print(rs.getString(1)+ " | ");
				System.out.print(rs.getString(2)+ " | ");
				System.out.print(rs.getString(3)+ " | ");
				System.out.print(rs.getString(4)+ " | ");
				System.out.print(rs.getString(5)+ " | ");
				System.out.println(rs.getString(6));
			}
			System.out.println("--------------------------------------------------------------------------");
			rs.close();
			
			String sentenciaDELETE = null;
			sentenciaDELETE  = "delete FROM VISITANTE_TEMPORAL\n";
			sentenciaDELETE += "where DNI in ('12345678A', '34567890C')"; 
			System.out.println("--------------------------------------------------------------------------");
			System.out.printf("Sentencia DML: \n %s \n",sentenciaDELETE);
			stmt.execute(sentenciaDELETE);
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("DELETE OK");
			System.out.println("--------------------------------------------------------------------------");
			
			System.out.printf("Consulta: \n %s \n     %s \n      %s  \n", consulta1, consulta2, consulta3);
			System.out.println("---------------------------ANTES DE LA SENTENCIA DELETE----------------------------------");
			rs = stmt.executeQuery(consulta1+consulta2+consulta3);
			while (rs.next()) {
				System.out.print(rs.getString(1)+ " | ");
				System.out.print(rs.getString(2)+ " | ");
				System.out.print(rs.getString(3)+ " | ");
				System.out.print(rs.getString(4)+ " | ");
				System.out.print(rs.getString(5)+ " | ");
				System.out.println(rs.getString(6));
			}
			System.out.println("--------------------------------------------------------------------------");
			stmt.close();
			
			
		} catch(SQLException e) {
			Conector_JDBC.muestraErrorSQL(e);
		} catch(Exception e) {
			System.err.println(e);
		}

	}

}
