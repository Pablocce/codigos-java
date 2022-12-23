package serializacionObjetosBBDD;

import java.sql.*;
import java.io.*;
import java.util.ArrayList;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;



public class CountryLanguageXML {
	ArrayList<Country> paisesEnTablaBD = new ArrayList<Country>();
	public static final String MIARCHIVO_XML = "./ListadoPaises.xml";
	public static void main(String[] args) throws IOException {
		try(Connection con = Conector_JDBC_JAXB.Conexion("world", "localhost", "3306", "root", "Curso2023")) {
			Conector_JDBC_JAXB.muestraConexionOK();
			
			ArrayList<Country> paisesEnTablaBD = new ArrayList<Country>();
			
			String consultaPaises = "select Code, Name, Continent\n";
			consultaPaises += " from country\n";
			consultaPaises += " order by 3,2 \n";
			
			Statement stmtPaises = con.createStatement();
			
			ResultSet rsPaises = stmtPaises.executeQuery(consultaPaises);
			
			while (rsPaises.next()) {
				
				String consultaIdiomas = "select CountryCode, Language, IsOfficial, Percentage\n";
				consultaIdiomas += " from countrylanguage\n";
				consultaIdiomas += " where countrycode = ?\n";
				consultaIdiomas += " order by 4 desc\n";
				PreparedStatement stmtIdiomas = con.prepareStatement(consultaIdiomas);
				
				stmtIdiomas.setString(1, rsPaises.getString(1));
				
				ArrayList<CountryLanguage> idiomasLista = new ArrayList<CountryLanguage>();
				
				ResultSet rsIdiomas = stmtIdiomas.executeQuery();
				
				while(rsIdiomas.next()) {
					CountryLanguage idioma = new CountryLanguage();
					idioma.setCountryCode(rsIdiomas.getString(1));
					idioma.setLanguage(rsIdiomas.getString(2));
					idioma.setIsOfficial(rsIdiomas.getString(3));
					idioma.setPercentage(rsIdiomas.getFloat(4));
					idiomasLista.add(idioma);
				}
				
				stmtIdiomas.close();
				
				Country pais = new Country();
				pais.setCode(rsPaises.getString(1));
				pais.setName(rsPaises.getString(2));
				pais.setContinent(rsPaises.getString(3));
				
				pais.setListaIdiomas(idiomasLista);
				paisesEnTablaBD.add(pais);
			}
			
			ListadoPaises listado = new ListadoPaises();
			listado.setListaPaises(paisesEnTablaBD);
			listado.setBDOrigen(Conector_JDBC_JAXB.getUrlConnection());
			JAXBContext context = JAXBContext.newInstance(ListadoPaises.class);
			
			Marshaller m = context.createMarshaller();
			
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			m.marshal(listado, new File(MIARCHIVO_XML));
			
			stmtPaises.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			System.err.println(e);
		}

	}

}
