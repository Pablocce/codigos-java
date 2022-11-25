package main;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x=1,cuadrado;
		boolean con1,con2;
		Scanner teclado = new Scanner(System.in);
		while (x!=0) {
			System.out.println("Introduzca un número: ");
			x = teclado.nextInt();
			
			if (x%2==0) {
				con1 = true;
			} else {
				con1 = false;
			}
			
			if (x>=0 ) {
				con2 = true;
				
			} else {
				con2 = false;
			}
			
			cuadrado = x * x;
			
			System.out.println("Es par?: " + con1);
			System.out.println("Es positivo?: " + con2);
			System.out.println("Cuadrado: "  + cuadrado);
		}

	}

}
