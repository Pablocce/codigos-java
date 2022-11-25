package Matrices4;
import java.util.Scanner;
public class Matriz4 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		mat = new int[2][5];
		for (int i=0;i<5;i++) {
			for (int j=0;j<2;j++) {
				System.out.println("Introduce componente:");
				mat[i][j]=teclado.nextInt();
			}
		}
	}
	public void imprimir() {
		for(int f =0; f<2;f++){
			for(int g=0;g<5;g++) {
				System.out.println(mat[f])
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
