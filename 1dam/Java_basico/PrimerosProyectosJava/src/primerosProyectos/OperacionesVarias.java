package primerosProyectos;
import java.util.Scanner;
public class OperacionesVarias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,num4;
		System.out.println("Introduce un n�mero:");
		num1 = sc.nextInt();
		System.out.println("Introduce un n�mero:");
		num2 = sc.nextInt();
		System.out.println("Introduce un n�mero:");
		num3 = sc.nextInt();
		System.out.println("Introduce un n�mero:");
		num4 = sc.nextInt();
		int op1,op2;
		op1=num1+num2;
		op2=num3*num4;
		System.out.println("La suma de los dos primeros digitos es de: " +op1 )  ;
		System.out.print("El producto de los dos �ltimos d�gitos es de: " +op2);

	}

}
