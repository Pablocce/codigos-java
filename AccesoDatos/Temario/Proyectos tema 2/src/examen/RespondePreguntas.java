package examen;

import java.io.*;


public class RespondePreguntas {
	
	public static void main(String[] args) {
		
		
		File f = new File("RESPUESTAS_PABLO_CALVO.txt");
		
		try {
			BufferedWriter bfw = new BufferedWriter(new FileWriter(f));
			bfw.write("A)  Escribe tu nombre y apellidos");
			bfw.newLine();
			bfw.write("Pablo Calvo Espinar");
			bfw.newLine();
			bfw.write("B)  Escribe la fecha de hoy");
			bfw.newLine();
			bfw.write("28/11/2022");
			bfw.newLine();
			bfw.write("1.  Para que un recurso se pueda usar en un try con recursos debe implementar al menos una de dos interfaces. �C�mo se llaman estas interfaces?");
			bfw.newLine();
			bfw.write("IOException");
			bfw.newLine();
			bfw.write("2.  �De qu� otra manera se puede nombrar el desfase objeto-relacional?");
			bfw.newLine();
			bfw.write("impedancia objeto-relacional");
			bfw.newLine();
			bfw.write("3.  De los analizadores sint�cticos m�s usados para XML, �cu�l de ellos no carga todo el fichero en memoria?");
			bfw.newLine();
			bfw.write("SAX");
			bfw.newLine();
			bfw.write("4.  �C�mo se llama el conector de Java a BBDD relacionales?");
			bfw.newLine();
			bfw.write("mysql connector java");
			bfw.newLine();
			bfw.write("5.  �Qu� interfaz deben implementar en Java los objetos serializables?");
			bfw.newLine();
			bfw.write("Serializable");
			bfw.newLine();
			bfw.write("6.  En JDBC �con qu� m�todo designamos el tipo de un par�metro de salida o entrada-salida o el valor devuelto por una funci�n?");
			bfw.newLine();
			bfw.write("Con el metodo get + tipo de variable");
			bfw.newLine();
			bfw.write("7.  �C�mo se llama la API de marshalling a XML para Java que da m�s libertad para nombrar los m�todos de las clases?");
			bfw.newLine();
			bfw.write("JAXB");
			bfw.newLine();
			bfw.write("8.  En un ResultSet de acceso aleatorio �con qu� funci�n puede acceder al registro anterior?");
			bfw.newLine();
			bfw.write("previous");
			bfw.newLine();
			bfw.write("9.  �Qu� formato deben tener las plantillas que permiten a Java tranformar un fichero XML en un fichero de texto plano");
			bfw.newLine();
			bfw.write("No lo se");
			bfw.newLine();
			bfw.write("10. Nombra la interfaz y el m�todo de ella que nos permite obtener la informaci�n de todas las columnas del diccionario de datos");
			bfw.newLine();
			bfw.write("No lo se");
			
			bfw.close();
			
		}catch(IOException e){
			System.out.println(e.getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
