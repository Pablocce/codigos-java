package examen;

import java.util.ArrayList;
import java.util.List;

public class curso {
	private String nombre;
	private int horas;
	private List<modulo> lista = new ArrayList<modulo>();
	;
	
	public curso(String nombre, int horas, List<modulo> lista) {
		super();
		this.nombre = nombre;
		this.horas = horas;
		this.lista = lista;
	}
	
	
	public void add(modulo modulo) {
		lista.add(modulo);
	}
	
	public List<modulo> getListamodulo(){
		return lista;
		
	}
	
	public int getHoras() {
		return horas;
		
	}
	
	
}
