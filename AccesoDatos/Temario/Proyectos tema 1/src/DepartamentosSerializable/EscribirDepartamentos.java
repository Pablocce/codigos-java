package DepartamentosSerializable;

import java.io.*;

import com.thoughtworks.xstream.XStream;


public class EscribirDepartamentos {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File fichero = new File("FichDepartamento.dat");
		FileInputStream filein = new FileInputStream(fichero);
		ObjectInputStream dataIS = new ObjectInputStream(filein);
		
		System.out.println("Comienza el proceso");
		
		ListaDepartamentos listaper = new ListaDepartamentos();
		
		
		try {
			while(true) {
				Departamento dep = (Departamento) dataIS.readObject();
				listaper.add(dep);
			}
		}catch(EOFException eo) {}
		dataIS.close();
		try {
			XStream xstream = new XStream();
			xstream.alias("ListaDepartamentos", ListaDepartamentos.class);
			xstream.alias("DatosDepartamentos", Departamento.class);
			xstream.addImplicitCollection(ListaDepartamentos.class, "lista");
			xstream.toXML(listaper, new FileOutputStream("Departamentos.xml"));
			System.out.println("Creando fichero xml...");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
