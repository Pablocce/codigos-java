package primerosProyectos;
import java.util.Scanner;
public class FechaNavidad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia,mes;
		System.out.println("Introduce el d�a en el que est�s: ");
		dia = teclado.nextInt();
		System.out.println("Introduce el mes en el que est�s: ");
		mes= teclado.nextInt();
		if(dia==25 && mes==12) {
			System.out.println("Est�s en Navidad");
		}else {
			System.out.println("No est�s en navidad");
		}

	}

}
