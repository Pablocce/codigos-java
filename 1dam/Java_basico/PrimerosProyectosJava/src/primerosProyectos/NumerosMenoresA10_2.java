package primerosProyectos;
import java.util.Scanner;
public class NumerosMenoresA10_2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Introduce el primer n�mero");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo n�mero");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer n�mero");
		num3 = teclado.nextInt();
		if(num1<10 || num2<10 || num3<10) {
			System.out.println("Alguno de los n�meros es menor a diez");
		}
	}
}
