package primerosProyectos;
import java.util.Scanner;
public class ValoresMenoresA10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Introduce el primer número");
		num1 = teclado.nextInt();
		System.out.println("Introduce el primer número");
		num2 = teclado.nextInt();
		System.out.println("Introduce el primer número");
		num3 = teclado.nextInt();
		if(num1<10 && num2<10 && num3<10) {
			System.out.println("Todos los números son menores a diez");
		}
	}

}
