package lector_xml;
import javax.xml.parsers.*;
import org.w3c.dom.*;


public class LecturaEmpleadoXML {
	
	public static void main(String args[]) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse("Empleados.xml");
			document.getDocumentElement().normalize();
			
			// %s --> cualquier tipo   %n --> salto de linea
			System.out.printf("Elemento raiz: %s %n", document.getDocumentElement().getNodeName());
			
			// crea una lista con todos los nodos del empleado
			NodeList empleados = document.getElementsByTagName("empleado");
			
			// %d --> int    %n --> salto de linea
			System.out.printf("Nodos empleado a recorrer: %d %n", empleados.getLength());
			
			for (int i = 0; i < empleados.getLength(); i++) {
				Node emple = empleados.item(i); //obtener un nodo empleado
				if (emple.getNodeType() == Node.ELEMENT_NODE) {
					//obtener los elementos del nodo
					Element elemento = (Element) emple;
					System.out.printf("ID = %s %n", elemento.getElementsByTagName("id").item(0).getTextContent());
					System.out.printf(" * Apellido = %s %n", elemento.getElementsByTagName("apellido").item(0).getTextContent());
					System.out.printf(" * Departamento = %s %n,",elemento.getElementsByTagName("dep").item(0).getTextContent());
					System.out.printf(" * Salario = %s %n,", elemento.getElementsByTagName("salario").item(0).getTextContent());
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
