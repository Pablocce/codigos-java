package MatricesIrregulares1;
import java.util.Scanner;
public class MatrizIrregular1 {
	private Scanner teclado;
	private int[][] mat;

	public void cargar() {
		teclado=new Scanner(System.in);
		System.out.println("Cuantas filas tiene la matriz");
		int filas=teclado.nextInt();
		mat=new int[filas][];
		for(int f=0;f<mat.length;f++) {
			System.out.println("Cuantos elementos tiene la fila "+f+":");
			int elementos=teclado.nextInt();
			mat[f]=new int[elementos];
			for(int c=0;c<mat[f].length;c++) {
				System.out.print("Introuce componente");
				mat[f][c]=teclado.nextInt();
			}
		}
	}
	public void imprimir() {
		for(int f=0;f<mat.length;f++) {
			for(int c=0;c<mat[f].length;c++) {
				System.out.println(mat[f][c]+" ");
			}
		}
	}
	public static void main(String[] args) {
		MatrizIrregular1 ma= new MatrizIrregular1();
		ma.cargar();
		ma.imprimir();

	}

}
