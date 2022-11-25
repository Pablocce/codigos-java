package Matrices7;
import java.util.Scanner;
public class Matriz7 {
	private Scanner teclado;
	private String[] pais;
	private int[][] temperaturas;
	private int temptri[];
	
	public void cargar() {
		teclado=new Scanner(System.in);
		pais=new String[4];
		temperaturas=new int[4][3];
		for (int f=0;f<pais.length;f++) {
			System.out.println("Introduce el nombre del país");
			pais[f]=teclado.next();
			for(int g=0;g<3;g++) {
				System.out.println("Introduce temperatura:");
				temperaturas[f][g]=teclado.nextInt();
			}
		}
	}
	
	public void imprimir() {
		System.out.println("Datos:");
		for(int f=0;f<pais.length;f++) {
			System.out.println("País: "+pais[f]);
			for(int g=0;g<3;g++) {
				System.out.println(temperaturas[f][g]+" grados");
			}
			
		}
	}
	
	
	public void temperaturamedia() {
		temptri=new int[4];
		for (int f=0;f<temperaturas.length;f++) {
			int suma=0;
			for(int c=0;c<temperaturas[f].length;c++) {
				suma=suma+temperaturas[f][c];
			}
			temptri[f]=suma/3;
			
		}
	}
	
	public static void main(String[] args) {
		Matriz7 ma = new Matriz7();
		ma.cargar();
		ma.imprimir();
		ma.temperaturamedia();

	}

}
