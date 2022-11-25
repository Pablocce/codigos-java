package Bucles;
import java.util.Scanner;
public class PerimetroCuadrado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int lado,perimetro;
		System.out.println("Introduce el lado del cuadrado");
		lado=teclado.nextInt();
		perimetro=lado*4;
		System.out.print("El perímetro del cuadrado es:");
		System.out.println(perimetro);

	}

}
