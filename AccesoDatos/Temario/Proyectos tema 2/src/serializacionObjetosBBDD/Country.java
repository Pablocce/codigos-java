package serializacionObjetosBBDD;

import java.util.ArrayList;


import jakarta.xml.bind.annotation.*;


@XmlRootElement(name="Country")
@XmlType(propOrder = {"code", "name", "continent", "listaIdiomas"})
public class Country {
	private ArrayList<CountryLanguage> listaIdiomas;
	private String code;
	private String name;
	private String continent;
	public Country(ArrayList<CountryLanguage> listaIdiomas, String code, String name, String continent) {
		super();
		this.listaIdiomas = listaIdiomas;
		this.code = code;
		this.name = name;
		this.continent = continent;
	}
	
	public Country() {}

	public void setCode(String code ) {this.code = code;}
	public void setName(String name ) {this.name = name;}
	public void setContinent(String continent ) {this.continent = continent;}
	public String getCode() {return code;}
	public String getName() {return name;}
	public String getContinent() {return continent;}
	
	
	
	@XmlElement(name="Idioma")
	public ArrayList<CountryLanguage> getListaIdiomas(){return listaIdiomas;}
	
	public void setListaIdiomas(ArrayList<CountryLanguage> listaIdiomas) {this.listaIdiomas = listaIdiomas;}
	
	

}
