package Ejemplo3;
import java.util.ArrayList;
import java.util.Iterator;

public class Alumno extends Persona{
	private int exp;
	private String ciclo;
	private int curso;
	private ArrayList notas;
	
	public Alumno(String nom, String dni, String direc, int tel, int exp, String ciclo, int curso, ArrayList notas) {
		
		super(nom, dni, direc, tel);
		
		this.exp = exp;
		this.ciclo = ciclo;
		this.curso=curso;
		this.notas=notas;
	}
	
	public void mostrarPersona() {
		
		super.mostrarPersona();
		
		System.out.println("N�m. expediente: " + this.exp);
		System.out.println("Ciclo: " + this.ciclo);
		System.out.println("Curso: " + this.curso);
		System.out.println("Notas: ");
		
		for (Iterator it = this.notas.iterator(); it.hasNext();){
			System.out.println("\tNota:" + it.next());
		}
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso=curso;
	}
	public ArrayList getNotas() {
		return notas;
	}
	public void setNotas(ArrayList notas) {
		this.notas = notas;
	}
}
