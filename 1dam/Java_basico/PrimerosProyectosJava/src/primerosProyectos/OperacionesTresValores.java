package primerosProyectos;
import java.util.Scanner;
public class OperacionesTresValores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Introduce el primer n�mero");
		num1 = teclado.nextInt();
		System.out.println("Introduce el segundo n�mero");
		num2 = teclado.nextInt();
		System.out.println("Introduce el tercer n�mero");
		num3 = teclado.nextInt();
		if(num1==num2 && num2==num3) {
			int operacion;
			operacion = (num1 + num2)*num3 ;
			System.out.println(operacion);
		}

	}

}
