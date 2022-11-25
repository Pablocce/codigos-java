package Matrices6;
import java.util.Scanner;
public class Matriz6 {
	private Scanner teclado;
	private String[] empleados;
	private int[][] sueldos;
	private int[] sueldostot;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		empleados=new String[4];
		sueldos=new int[4][3];
		for(int f=0;f<empleados.length;f++) {
			System.out.println("Introduce el nombre del empleado");
			empleados[f]=teclado.next();
			for(int c=0;c<sueldos[f].length;c++) {
				System.out.println("Introduce el sueldo:");
				sueldos[f][c]=teclado.nextInt();
			}
		}
		
	}
	public void calcularSumaSueldos() {
		sueldostot=new int[4];
		for(int f=0;f<sueldos.length;f++) {
			int suma=0;
			for (int c=0;c<sueldos[f].length;c++) {
				suma=suma+sueldos[f][c];
			}
			sueldostot[f]=suma;
		}
	}
	public void imprimirTotalPagado() {
		System.out.println("Total de sueldos pagados por empleado");
		for(int f=0;f<sueldostot.length;f++) {
			System.out.println(empleados[f]+"-"+sueldostot[f]);
		}
	}
	public void empleadoMayorSueldo() {
		int may=sueldostot[0];
		String nom=empleados[0];
		for(int f=0;f<sueldostot.length;f++) {
			if(sueldostot[f]>may) {
				may=sueldostot[f];
				nom=empleados[f];
			}
		}
		System.out.println("El empleado con mayor sueldo es "+nom+" que teiene un sueldo de " +may);		
	}
	public static void main(String[] ar) {
		Matriz6 ma = new Matriz6();
		ma.cargar();
		ma.calcularSumaSueldos();
		ma.imprimirTotalPagado();
		ma.empleadoMayorSueldo();
	}
}
