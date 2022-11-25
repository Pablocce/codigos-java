package OrdenarVectoresParalelos2;
import java.util.Scanner;
public class Main {
	private Scanner teclado;
	private String[] paises;
	private int[] habitantes;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		paises = new String[5];
		habitantes = new int[5];
		System.out.println("Carga de paises con sus habitantes");
		for (int f=0;f<paises.length;f++) {
			System.out.println("Introduce el nombre del país");
			paises[f]=teclado.next();
			System.out.println("Introduce el número de habitantes");
			habitantes[f]=teclado.nextInt();
		}	
	}
	
	public void ordenar_alfabeticamente() {
		for (int k=0;k<paises.length;k++) {
			for (int f=0;f<paises.length-k-1;f++) {
				if (paises[f].compareTo(paises[f+1])>0) {
					String aux;
					aux = paises[f];
					paises[f]=paises[f+1];
					paises[f+1]=aux;
					int aux2;
					aux2 = habitantes[f];
					habitantes[f]=habitantes[f+1];
					habitantes[f+1]=aux2;
				}
			}
		}
		System.out.println("Ordenado alfabéticamente");
		for (int f=0;f<paises.length;f++) {
			System.out.println(paises[f]+"-"+habitantes[f]);
		}
		
	}
	public void ordenar_habitantes() {
		for (int k=0;k<paises.length;k++) {
			for (int f=0;f<paises.length-k-1;f++) {
				if (habitantes[f]>habitantes[f+1]) {
					int aux2;
					aux2 = habitantes[f];
					habitantes[f]=habitantes[f+1];
					habitantes[f+1]=aux2;
					String aux;
					aux = paises[f];
					paises[f]=paises[f+1];
					paises[f+1]=aux;
				}
			}
		}
		System.out.println("De mayor a menor");
		for (int f=0;f<paises.length;f++) {
			System.out.println(paises[f]+"-"+habitantes[f]);
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		Main pv = new Main();
		pv.cargar();
		pv.ordenar_alfabeticamente();
		pv.ordenar_habitantes();

	}

}
