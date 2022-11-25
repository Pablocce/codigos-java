package listadoDirectorio;

import java.io.File;

public class ListadoDirectorio {

	public static void main(String[] args) {
		
		String ruta = "."; //declaramos la ruta, en este caso es el del proyecto
		
		if (args.length >=1) {
			ruta = args[0];  //el argumento introducido será la ruta
		}
		
		File fich = new File(ruta);
		
		if ( !fich.exists()) {
			System.out.println("No existe el fichero o directorio");
		}
		
	}

}
