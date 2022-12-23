package ejercicio16;

import java.util.ArrayList;
import java.util.List;

public class Archipielago {
	private String nombre;
	private int poblacion;
	private List<Provincia> lista = new ArrayList<Provincia>();
	
	public Archipielago(String nombre, int poblacion) {
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
	
	public void add(Provincia provincia) {
		lista.add(provincia);
	}
	public String getNombre() {
		return nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}
	
}
