package primerosProyectos;
import java.util.Scanner;
public class OperacionesTresValores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Introduce el primer número");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo número");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer número");
		num3 = teclado.nextInt();
		if(num1==num2 && num2==num3) {
			int operacion;
			operacion = (num1 + num2)*num3 ;
			System.out.println(operacion);
		}

	}

}
