package Bucles2;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad = 0,suma=0,alumnos=0, mayoresedad=0;
		float media;
		
		while (edad>=0) {
			System.out.println("Introduzca edad:");
			edad = teclado.nextInt();
			alumnos = alumnos + 1; 
			suma = suma + edad;
			if (edad>=18) {
				mayoresedad = mayoresedad + 1;
			}
		}
		media = suma / alumnos;
		
		
		System.out.println("Suma de todas las edades:" + suma);
		System.out.println("Media:" + media);
		System.out.println("Número total de alumnos:" + alumnos);
	}

}
