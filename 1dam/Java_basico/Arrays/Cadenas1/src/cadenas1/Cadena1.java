package cadenas1;
import java.util.Scanner;
public class Cadena1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cad1;
		String cad2;
		System.out.println("Introduce la primera cadena");
		cad1= teclado.nextLine();
		System.out.println("Introduce la segunda cadena");
		cad2= teclado.nextLine();
		if (cad1.equals(cad2)==true) {
			System.out.println(cad1 + " es exactamente igual a "+ cad2);
		} else {
			System.out.println(cad1+ " no es exactamente igual a "+ cad2);
		}
		if(cad1.equalsIgnoreCase(cad2)==true) {
			System.out.println(cad1+" es igual a" + cad2+ "sin tener en cuenta mayusculas o minusuclas");
		}else {
			System.out.println(cad1+" no es igual a" + cad2+ "sin tener en cuenta mayusculas o minusuclas");
		}
		if (cad1.compareTo(cad2)==0) {
			System.out.println(cad1+" es exactamente igual a " + cad2);
		} else {
			if(cad1.compareTo(cad2)>0) {
				System.out.println(cad1+ " es mayor alfabéticamente que" +cad2); 
			}else {
				System.out.println(cad2 + "es mayor alfabéticamente que" +cad1);
			}
		}
	}

}
