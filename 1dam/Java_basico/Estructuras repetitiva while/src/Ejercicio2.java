import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[]ar) {
		Scanner teclado = new Scanner(System.in);
		int suma,f,valor,promedio;
		suma=0;
		for(f=1;f<=10;f++) {
			System.out.print("Introduce valor: ");
			valor = teclado.nextInt();
			suma=suma+valor;
		}
		System.out.print("La suma es: ");
		System.out.print(suma);
		promedio=suma/10;
		System.out.print("El promedio es: ");
		System.out.print(promedio);
	}
	
}
