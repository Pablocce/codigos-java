package cadenas;
import java.util.Scanner;
public class Cadena2{
	 
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cad1;
		System.out.println("Introduce una cadena");
		cad1 = teclado.nextLine();
		if(cad1.indexOf("@")==0) {
			System.out.println("Si tiene");
		} else {
			System.out.println("No tiene");
		}
		
	}

}
