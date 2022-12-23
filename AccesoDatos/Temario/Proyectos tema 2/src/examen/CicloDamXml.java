package examen;

import java.io.*;
import javax.xml.*;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;


public class CicloDamXml {
	private static final String MIARCHIVO_XML = "./DAM.xml";
	
	private static void main(String [] args) {
		modulo modulo1 = new modulo("Bases de datos", 205);
		modulo modulo2 = new modulo("Entornos de desarrollo", 90);
		modulo modulo3 = new modulo("Formacion y orientacion laboral", 90);
		modulo modulo4 = new modulo("Lenguajes de marcas y sistemas de gestion de informacion", 140);
		modulo modulo5 = new modulo("Programacion", 270);
		modulo modulo6 = new modulo("Sistemas informaticos", 205);
		
		modulo modulo7 = new modulo("Acceso a datos", 120);
		modulo modulo8 = new modulo("Desarrollo de interfaces", 120);
		modulo modulo9 = new modulo("Empresa e iniciativa emprendedora", 65);
		modulo modulo10 = new modulo("Ingles tecnico para grado superior", 40);
		modulo modulo11 = new modulo("Programacion de Servicios y Procesos", 80);
		modulo modulo12 = new modulo("Programacion multimedia y dispositivos moviles", 80);
		modulo modulo13 = new modulo("Sistemas de Gestion Empresarial", 95);
		modulo modulo14 = new modulo("Proyecto de desarrollo de aplicaciones multiplataforma", 30);
		modulo modulo15 = new modulo("Formacion en Centros de Trabajo", 370);
		
		
	}
}
