package primerosProyectos;
import java.util.Scanner;
public class SumaPromedio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,num4;
		System.out.println("Introduce un número");
		num1=sc.nextInt();
		System.out.println("Introduce un número");
		num2=sc.nextInt();
		System.out.println("Introduce un número");
		num3=sc.nextInt();
		System.out.println("Introduce un número");
		num4=sc.nextInt();
		int suma;
		suma = num1+num2+num3+num4;
		float promedio;
		promedio = suma/4;
		System.out.println("Suma: " + suma);
		System.out.print("Promedio: " + promedio);
	}

}
