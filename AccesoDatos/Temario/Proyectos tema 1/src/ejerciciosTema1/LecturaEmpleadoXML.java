package ejerciciosTema1;

import org.w3c.dom.*;
import javax.xml.parsers.*;

public class LecturaEmpleadoXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse("Empleados.xml");
			document.getDocumentElement().normalize();
			
			
			System.out.printf("Elemento raiz: %s %n", document.getDocumentElement().getNodeName());
			
			
			NodeList empleados = document.getElementsByTagName("empleado");
			
			System.out.printf("Nodos empleado a recorrer: %d %n", empleados.getLength());
			
			
			for (int i = 0; i < empleados.getLength(); i++) {
				Node emple = empleados.item(i);
				if(emple.getNodeType() == Node.ELEMENT_NODE) {
					Element elemento = (Element) emple;
					System.out.printf("ID = %s %n", elemento.getElementsByTagName("id").item(0).getTextContent());
					System.out.printf(" * Apellido = %s %n", elemento.getElementsByTagName("apellido").item(0).getTextContent());
					System.out.printf(" * Departamento = %s %n", elemento.getElementsByTagName("dep").item(0).getTextContent());
					System.out.printf(" * Salario = %s %n", elemento.getElementsByTagName("salario").item(0).getTextContent());
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
