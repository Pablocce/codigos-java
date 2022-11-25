package primerosProyectos;
import java.util.Scanner;
public class SueldoAntiguedad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float sueldo, aumento;
		int antiguedad;
		System.out.println("Introduce el sueldo");
		sueldo = teclado.nextFloat();
		System.out.println("Introduce la antiguedad del trabajador en años");
		antiguedad = teclado.nextInt();
		if(sueldo<500 && antiguedad>=10) {
			aumento = sueldo*20/100 + sueldo;
			System.out.println(aumento);
		} else {
			if(sueldo<500 && antiguedad<10) {
				aumento = sueldo*5/100 + sueldo;
				System.out.println(aumento);
			} else {
				if(sueldo>=500) {
					System.out.println(sueldo);
				}
			}
		}
	}
}
