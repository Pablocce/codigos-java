package primerosProyectos;
import java.util.Scanner;

public class PerimetroCuadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el lado del cuadrado:");
		float lado;
		float perimetro;
		lado = sc.nextFloat();
		perimetro = lado*4;
		System.out.println("El perímetro del cuadrado es de: " + perimetro);
	}

}
