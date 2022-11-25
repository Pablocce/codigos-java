package ejercicio16;

public class Isla {
	
	private String nombre;
	private int poblacion;
	private String superficie;
	
	public Isla(String nombre, int poblacion, String superficie) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.superficie = superficie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public String getSuperficie() {
		return superficie;
	}
	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
	
	

}
