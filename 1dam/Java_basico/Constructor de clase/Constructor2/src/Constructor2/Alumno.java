package Constructor2;
import java.util.Scanner;
public class Alumno {
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public Alumno() {
		teclado=new Scanner(System.in);
		System.out.println("Introduce nombre:");
		nombre=teclado.next();
		System.out.println("Introduce edad:");
		edad=teclado.nextInt();
	}
	
	public void imprimir() {
		System.out.println("Nombre:"+nombre);
		System.out.println("Edad:"+edad);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
