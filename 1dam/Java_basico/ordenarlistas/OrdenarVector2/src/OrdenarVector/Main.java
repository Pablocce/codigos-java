package OrdenarVector;
import java.util.Scanner;
public class Main {
	private Scanner teclado;
	private int[] vector;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		vector = new int[10];
		for (int f=0;f<vector.length;f++) {
			System.out.println("Introduce el nombre del pa�s:");
			vector[f]=teclado.nextInt();
		}	
	}
	
	
	public void ordenar() {
		for (int k=0;k<9;k++) {
			for (int f=0;f<10-1;f++) {
				if (vector[f]>vector[f+1]) {
					int aux;
					aux = vector[f];
					vector[f]=vector[f+1];
					vector[f+1]=aux;
				}
			}	
		}
	}
	
	public void mostrar() {
		for (int i=0; i<vector.length; i++) {
			System.out.println(vector);
		}
	}
	public static void main(String[] args) {
		Main pv = new Main();
		pv.cargar();
		pv.ordenar();
		pv.mostrar();

	}

}
