package Ejemplo3;

public class Persona {
	
	private String nombre;
	private String dni;
	private String direccion;
	private int telefono;
	
	public Persona(String nom, String dni, String direc, int tel) {
		this.nombre = nom;
		this.dni = dni;
		this.direccion = direc;
		this.telefono = tel;
		
	}
	
	public void mostrarPersona() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("DNI: " + this.dni);
		System.out.println("Dirección: " + this.direccion);
		System.out.println("Teléfono: " + this.telefono);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public void setTelefono(int telelfono) {
		this.telefono = telefono;
	}
}
