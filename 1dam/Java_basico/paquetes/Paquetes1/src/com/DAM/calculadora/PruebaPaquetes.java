package com.DAM.calculadora;

import com.DAM.rutinas.Matematica;
import com.DAM.rutinas.Cadena;
public class PruebaPaquetes {
	
	public static void main(String [] ar) {
		System.out.println("La suma de 2+2 es"+Matematica.sumar(2, 2));
		String cadena = "Hola mundo";
		System.out.println(Cadena.mayuscula(cadena));
	}

}
