package clases;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		boolean salir = false;
		Agenda agendaContactos = new Agenda(5);
		String nombre, apellido;
		int telefono;
		Contacto c;
		int opcion;
		while(salir=false) {
			System.out.println("Bienvenido a SecretariOP");
			System.out.println("Utilice los n�meros siguientes para acceder a los distintos apartados: " +
			"\n Agenda contactos: 1");
			opcion = teclado.nextInt();	 
			switch(opcion) {
			
			case 1:
				System.out.println("Accediendo a la agenda");
				boolean salir1=false;
				int opcion1;
				while(salir1=false) {
					System.out.println("Utilice los n�meros siguientes para acceder a los distintos apartados:" +
										"\n A�adir un contacto: 2");
					opcion1 = teclado.nextInt();
					switch(opcion1) {
					case 1: //mostrar todos los contactos
						agendaContactos.listarContactos();
						break;
					case 2:  //a�adir un contacto
						System.out.println("Introduce el nombre del contacto");
						nombre = teclado.next();
						System.out.println("Intoduce el apellido del contacto");
						apellido = teclado.next();
						System.out.println("Introduce el n�mero de tel�fono");
						telefono = teclado.nextInt();
						c = new Contacto(nombre,apellido,telefono);
						agendaContactos.a�adirContacto(c);
						break;
					case 3: 
						System.out.println("Introduce el nombre del contacto que quieres buscar");
						nombre = teclado.next();
						agendaContactos.buscarPorNombre(nombre);
						break;
					case 4:
						salir1 = true;
						break;
					}
					
				}
				break;
				
			case 2:
			
			case 3:
			
			case 4:
				salir = true;
			}
		
		}

	}

}