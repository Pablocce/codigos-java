
public class Articulo {
	
	String cod;
	String titulo;
	String formato;
	float precio_alquiler;
	
	
	float precio1() {
		return (precio_alquiler);
	}
	
	float precio2() {
		float precio_total;
		
		precio_total = precio_alquiler * 1.80f;
		
		return (precio_total);
	}
	
	float precio_semana() {
		float precio_total;
		
		precio_total = precio_alquiler * 5;
		
		return (precio_total);
	}
}
