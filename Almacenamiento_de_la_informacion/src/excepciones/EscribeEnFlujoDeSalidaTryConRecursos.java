package excepciones;

import java.io.*;

public class EscribeEnFlujoDeSalidaTryConRecursos {

	public static void main(String[] args) {
		String nomFichero = "f_texto_recursos.txt";
		File f = new File(nomFichero);
		 if (f.exists()) {
			 System.out.println("Fichero " + nomFichero+ " ya existe");
			 return;
		 }
		 
		 try (BufferedWriter bfw = new BufferedWriter(new FileWriter(f, false))) {
			 bfw.write("Este es un fichero de texto. ");
			 bfw.newLine();
			 bfw.write(" quizá no está del todo bien.");
			 bfw.newLine();
			 bfw.close();
			 bfw.write(" Pero se puede arreglar");
			 bfw.newLine();
			 bfw.close();
		 } catch (IOException e) {
			 System.out.println(e.getMessage());
		 } catch(Exception e) {
			 e.printStackTrace();
		 }

	}

}
