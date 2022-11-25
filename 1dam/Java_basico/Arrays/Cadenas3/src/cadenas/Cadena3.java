package cadenas;
import java.util.Scanner;
public class Cadena3 {
	private Scanner teclado;
	private String cadena;
	public Cadena3() {
		teclado = new Scanner(System.in);
		System.out.println("Introduce el String: ");
		cadena = teclado.nextLine();
	}
	
	public void primera_mitad() {
		String mitadcadena = cadena.substring(0,cadena.length()/2);
		System.out.println(mitadcadena);
	}
	
	public void ultimodigito() {
		String ultimodigito;
		System.out.println(ultimodigito=cadena.substring(cadena.length()-1));
	}
	
	public void inversa() {
		String inversa;
		for (int x=0;x<cadena.length();x++) {
			
		}
	}
	
	public void stringseparado() {
		for(int x=0;x<cadena.length();x++) {
			System.out.print(cadena[x]+"-");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cadena3 pv = new Cadena3();
		pv.primera_mitad();
		pv.ultimodigito();
	}
	

}
