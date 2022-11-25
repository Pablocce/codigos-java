package primerosProyectos;
import java.util.Scanner;
public class FechaNavidad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia,mes;
		System.out.println("Introduce el día en el que estás: ");
		dia = teclado.nextInt();
		System.out.println("Introduce el mes en el que estás: ");
		mes= teclado.nextInt();
		if(dia==25 && mes==12) {
			System.out.println("Estás en Navidad");
		}else {
			System.out.println("No estás en navidad");
		}

	}

}
