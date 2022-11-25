
public class Ejemplos {
	
	public static void main (String[] args) {
		
		Articulo articulo1 = new Articulo();
		Articulo articulo2 = new Articulo();
		
		articulo1.cod = "001";
		articulo1.titulo = "Titulo1";
		articulo1.formato = "DVD";
		articulo1.precio_alquiler = 2.50f;
		
		articulo2.cod = "002";
		articulo2.titulo = "Titulo2";
		articulo2.formato = "DVD";
		articulo2.precio_alquiler = 3;
		
		System.out.println("Alquiler Art. " + articulo1.cod + ", 1 dia:" + articulo1.precio1());
		System.out.println("Alquiler Art. " + articulo1.cod + ", 2 dias:" + articulo1.precio2());
		System.out.println("Alquiler Art. " + articulo1.cod + ", 1 semana:" + articulo1.precio_semana());
		System.out.println("Alquiler Art. " + articulo2.cod + ", 1 dia:" + articulo2.precio1());
		System.out.println("Alquiler Art. " + articulo2.cod + ", 2 dias:" + articulo2.precio2());
		System.out.println("Alquiler Art. " + articulo2.cod + ", 1 semana:" + articulo2.precio_semana());
		
		
	}

}
