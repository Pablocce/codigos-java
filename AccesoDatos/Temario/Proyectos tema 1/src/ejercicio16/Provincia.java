package ejercicio16;

import java.util.ArrayList;
import java.util.List;


public class Provincia {
	private String nombre;
	private int poblacion;
	private List<Isla> lista = new ArrayList<Isla>();
	
	public Provincia(String nombre, int poblacion) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
	
	public void add(Isla isla) {
		lista.add(isla);
	}

	public List<Isla> getLista() {
		return lista;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}
	
	
	
	
	
}
