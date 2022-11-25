package MatricesIrregulares2;
import java.util.Scanner;
public class Matriz2 {
	private Scanner teclado;
	private String[] nombres;
	private int[][] mat;
	
	public void cargar() {
		teclado =new Scanner(System.in);
		int dias;
		nombres = new String[3];
		mat = new int[3][];
		for (int f=0;f<3;f++) {
			System.out.println("Introduce el nombre del empleado");
			nombres[f]=teclado.next();
			mat[f]=new int[f+1];
			System.out.println("Cuantos días faltó el empleado? ");
			dias=teclado.nextInt();
			for(int i=0;f<mat[f].length;f++) {
				System.out.println("Introduce un día que faltó:");
				mat[f][i]=teclado.nextInt();
			}
		}
	}
	
	public void cargar2() {
		teclado = new Scanner(System.in);
		nombres = new String[3];
		mat=new int[3][];
		for(int f=0;f<nombres.length;f++) {
			System.out.println("Introduce el nombre del empleado");
			nombres[f]=teclado.next();
			
		}
		
	}
	
	public void imprimir() {
		for (int a=0;a<3;a++) {
			System.out.println("El empleado" + nombres[a] +"faltó:");
			for (int b=0;b<mat.length;b++) {
				for(int c=0;c<mat[b].length;c++) {
					System.out.println(mat[b][c]);
				}
				
			}
		}
	}

	public static void main(String[] args) {
		Matriz2 ma=new Matriz2();
		ma.cargar();
		ma.imprimir();

	}

}
