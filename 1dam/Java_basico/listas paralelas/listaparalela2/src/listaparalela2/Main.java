package listaparalela2;
import java.util.Scanner;
public class Main {
	private Scanner  teclado;
	private String[] nombres;
	private float[] sueldos;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		nombres = new String[5];
		sueldos = new float[5];
		for (int f=0;f<nombres.length;f++) {
			System.out.println("Inteoduce el nombre del empleado");
			nombres[f]=teclado.next();
			System.out.println("Introduce el sueldo:");
			sueldos[f]=teclado.nextFloat();
		}
	}
	
	public void mayorSueldo() {
		float mayor;
		int pos;
		mayor=sueldos[0];
		pos=0;
		for (int f=1;f<nombres.length;f++) {
			if (sueldos[f]>mayor) {
				mayor=sueldos[f];
				pos=f;
			}
		}
		System.out.println("El empleado con sueldo mayor es" + nombres[pos]);
		System.out.println("Tiene un sueldo de:" +mayor);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main pv = new Main();
		pv.cargar();
		pv.mayorSueldo();
	}

}
