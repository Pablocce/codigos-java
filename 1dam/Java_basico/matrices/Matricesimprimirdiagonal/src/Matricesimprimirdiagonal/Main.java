package Matricesimprimirdiagonal;
import java.util.Scanner;
public class Main {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado = new scanner(System.in);
		mat=new int [4][4];
		for (int f=0;f<4;f++) {
			for(int c=0;c<4;c++) {
				System.out.println("Introduce componente");
				mat[f][c]=teclado.nextInt();
			}
		}
		
	}
	
	public void imprimirDiagonalPrincipal() {
		for(int k=0;f<4;k++) {
			System.out.println(mat[k][k]+"");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
