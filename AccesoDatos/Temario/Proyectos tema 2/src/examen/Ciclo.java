package examen;

import java.util.ArrayList;
import java.util.List;

public class Ciclo {
	private String nombre;
	private String abreviatura;
	private String fecha;
	private int cursos;
	private int horas;
	private List<curso> lista = new ArrayList<curso>();
	
	public Ciclo(String nombre, String abreviatura, String fecha, int cursos, int horas, List<curso> lista) {
		super();
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.fecha = fecha;
		this.cursos = cursos;
		this.horas = horas;
		this.lista = lista;
	}
	
	public void add(curso ciclo) {
		lista.add(ciclo);
	}
	
	public List<curso> getListaModulo(){
		return lista;
	}

	public String getNombre() {
		return nombre;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public String getFecha() {
		return fecha;
	}

	public int getCursos() {
		return cursos;
	}

	public int getHoras() {
		return horas;
	}

	public List<curso> getLista() {
		return lista;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setCursos(int cursos) {
		this.cursos = cursos;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public void setLista(List<curso> lista) {
		this.lista = lista;
	}
	
	
	
}
