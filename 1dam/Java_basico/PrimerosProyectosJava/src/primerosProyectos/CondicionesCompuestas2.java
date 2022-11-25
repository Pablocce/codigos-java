package primerosProyectos;
import java.util.Scanner;
public class CondicionesCompuestas2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int dia,mes,año;
		System.out.println("Introduce el número del dia: ");
		dia = teclado.nextInt();
		System.out.println("Introduce el número del mes: ");
		mes = teclado.nextInt();
		System.out.println("Introduce el número del año: ");
		año = teclado.nextInt();
		if (mes==1 || mes==2 || mes==3) {
			System.out.println("Corresponde al primer trimestre");
		}	
	}
}