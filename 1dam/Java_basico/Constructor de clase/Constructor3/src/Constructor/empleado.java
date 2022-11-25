package Constructor;
import java.util.Scanner;
public class empleado {
	private Scanner teclado;
	private String nombre;
	private int sueldo;
	
	public empleado() {
		teclado=new Scanner(System.in);
		System.out.println("Introduce el nombre");
		nombre = teclado.next();
		System.out.println("Introduce el sueldo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
