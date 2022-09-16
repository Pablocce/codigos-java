// Declaración de excepciones lanzadas por método de clase con throws
package ejercicio_throws;
import java.io.*;

public class ExcepcionesConThrows {
	public File creaFicheroTempConCar(String prefNomFich, char car, int numRep) throws IOException{ //El throws detecta la excepción y la manda a el catch del main
		File f = File.createTempFile(prefNomFich, "");
		FileWriter fw = new FileWriter (f); //Creamos un flujo
		fw.close();			//se cierra el flujo lo cual crea el error
		for (int i = 0; i < numRep; i++) fw.write(car);
		return f;
	}

	public static void main(String[] args) {
		try {
			File ft = new ExcepcionesConThrows().creaFicheroTempConCar("AAAA_", 'A', 20);
			System.out.println("Creado fichero: "+ft.getAbsolutePath());
			ft.delete();
		}catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
