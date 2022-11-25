package Ejemplo2;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejemplos {
	public  static void main(String[] args) {
		
		//definimos 5 instancias de la clase producto
		Producto p1= new Producto("Pan",6);
		Producto p2= new Producto("Leche",2);
		Producto p3= new Producto("Manzanas",5);
		Producto p4= new Producto("Brocoli",2);
		Producto p5= new Producto("Carne",2);
		
		//Definir un ArrayList
		ArrayList lista = new ArrayList();
		
		//Colocar Instacias de Producto en ArrayList
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		
		//Añadimos "Carne" en la posición 1 de la lista
		lista.add(1,p5);
		
		//Añadimos "Carne" en la ultima posición
		lista.add(p5);
		
		//Imprimir contenido de ArrayLists
		System.out.println(" -lista con " +lista.size()+" elementos");
	
		//Definir Iterator para extraer/imprimir valores
		// si queremos utiliar un for ocn iteradr no hace falta poner el incremento
		for (Iterator it = lista.iterator(); it.hasNext();) 
		{	
			// Hacemos un casting para poder guardarlo en una varible Producto
			Producto p = (Producto)it.next();
			System.out.println(p.getNombre() + " : " + p.getCantidad());
		}
		
		//Eliminar elemento de ArrayList
		lista.remove(2);
		System.out.println("- Lista con " + lista.size() + " elementos ");
		
		//Definir Iterator para extraer/imprimir valores
		for (Iterator it2 = lista.iterator();it2.hasNext();) {
			Producto p = (Producto)it2.next();
			System.out.println(p.getNombre()+" : " + p.getCantidad());
		}
		
		//Eliminar todos los valores del Arraylist
		lista.clear();
		System.out.println(" - Lista final con " +lista.size() + " elementos");
	}
}
