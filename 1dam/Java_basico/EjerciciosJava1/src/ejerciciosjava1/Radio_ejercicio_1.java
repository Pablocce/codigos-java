package ejerciciosjava1;
import java.util.Scanner;
public class Radio_ejercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float radio,area,longitud;
		System.out.println("Escribe el radio");
		radio=sc.nextFloat();
		longitud=2 * Math.PI * radio;
		area=Math.PI*radio*radio;

	}

}
