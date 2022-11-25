package Ejemplo3;
import java.util.ArrayList;
import java.util.Iterator;
public class Profesor extends Persona {
	private int cod;
	private String depto;
	private ArrayList modulos;
	private String horario;
	
	public Profesor(String nom, String dni, String direc, int tel, int cod, String depto, ArrayList mod, String horario) {
	
		super(nom,dni,direc,tel);
		
		this.cod = cod;
		this.depto=depto;
		this.modulos=mod;
		this.horario=horario;
	}
	
	public void mostrarPersona() {
		
		super.mostrarPersona();
		
		System.out.println("Código: "+ this.cod);
		System.out.println("Departamento:" + this.depto);
		System.out.println("Horario: " + this.horario);
		System.out.println("Módulos: ");
		for(Iterator it = this.modulos.iterator(); it.hasNext();)
		{
			System.out.println("\tMódulo: "+it.next());
		}
	}
	
	public int getcod() {
		return cod;
	}
	
	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public String getDepto() {
		return depto;
	}
	
	public void setDepto(String depto) {
		this.depto = depto;
	}
	
	public ArrayList getModulos() {
		return modulos;
	}
	
	public void setModulos(ArrayList modulos) {
		this.modulos = modulos;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
}
