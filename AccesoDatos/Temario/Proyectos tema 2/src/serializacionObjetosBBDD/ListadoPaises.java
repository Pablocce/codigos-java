package serializacionObjetosBBDD;

import java.util.*;


import jakarta.xml.bind.annotation.*;


@XmlRootElement(name = "ListadoPaises")
@XmlType(propOrder = {"bdOrigen", "autor", "listaPaises"})
public class ListadoPaises {
	
	private ArrayList<Country> listaPaises;
	private String bdOrigen;
	private String autor = "Pablo";
	
	public ListadoPaises(ArrayList<Country> listaPaises) {
		super();
		this.listaPaises = listaPaises;
	}
	
	public ListadoPaises() {}
	
	
	@XmlElement(name = "Pais")
	public ArrayList<Country> getListaPaises() {return listaPaises;}
	public void setListaPaises(ArrayList<Country> listaPaises) {this.listaPaises = listaPaises;}
	
	public String getBDOrigen() {return bdOrigen;}
	public void setBDOrigen(String bdOrigen ) {this.bdOrigen = bdOrigen;}
	
	public String getAutor() {return autor;}
	public void setAutor(String autor) {this.autor = autor;}
	

}
