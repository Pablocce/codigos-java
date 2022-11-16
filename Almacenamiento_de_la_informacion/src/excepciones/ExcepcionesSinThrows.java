package excepciones;

//Declaraci�n de excepciones lanzadas por m�todo de clase con throws
import java.io.*;

public class ExcepcionesSinThrows {
	public File creaFicheroTempConCar(String prefNomFich, char car, int numRep) { //El throws detecta la excepci�n y la manda a el catch del main
		try {
			File f = File.createTempFile(prefNomFich, "");
			FileWriter fw = new FileWriter (f); //Creamos un flujo
			fw.close();			//se cierra el flujo lo cual crea el error
			for (int i = 0; i < numRep; i++) fw.write(car);
			return f;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			return null;
		}
		
		
	}

	public static void main(String[] args) {
		try {
			File ft = new ExcepcionesSinThrows().creaFicheroTempConCar("AAAA_", 'A', 20);
			System.out.println("Creado fichero: "+ft.getAbsolutePath());
			ft.delete();
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}