package Matrices5;
import java.util.Scanner;
public class Matriz5 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		int n,m;
		System.out.println("Introduce las dimensiones de la matriz: columnas");
		n=teclado.nextInt();
		System.out.println("Introduce las dimensiones de la matriz: filas");
		m=teclado.nextInt();
		for (int i=0;i<n;i++){
			for(int j=0;j<m;j++) {
				System.out.println("Introduce componente");
				mat[i][j]=teclado.nextInt();
			}
		}
	}
	public void imprimirVertices () {
		System.out.println("Vértice superior izquierdo");
		System.out.println(mat[0][0]);
		System.out.println("Vértice superior derecho");
		System.out.println(mat[0][mat[0].length-1]);
		System.out.println("Vertice inferior izquierdo");
		System.out.println(mat[mat.length-1][0]);
		System.out.println("Vértice inferior derecho");
		System.out.println(mat[mat.length-1][mat[mat.length-1].length-1]);
	}
	
	public static void main(String[] ar) {
		Matriz5 pv=new Matriz5();
		pv.cargar();
		pv.imprimirVertices();
	}

}
