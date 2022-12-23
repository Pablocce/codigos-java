package ejercicio16;

import java.io.FileOutputStream;
import com.thoughtworks.xstream.XStream;

public class CanariasXML {
	
	public static final String MIARCHIVO_XML = "./Canarias.xml";
	public static void main(String[] args) {
		
		Isla isla1 = new Isla("El Hierra", 11147, "268,71 km2"), isla2 = new Isla("Fuerteventura", 119732, "1659,74 km2"),
				isla3 = new Isla("Gran Canaria", 855521, "1560 km2"), isla4 = new Isla("La Gomera", 21678, "369,76 km2"),
				isla5 = new Isla("La Palma", 83458, "708,32 km2"), isla6 = new Isla("Lanzarote", 152289, "845,94 km2"),
				isla7 = new Isla("Tenerife", 928604, "2034,38 km2");
		
		Provincia provinciaLasPalmas = new Provincia("Las Palmas", isla2.getPoblacion() + isla3.getPoblacion() + isla6.getPoblacion()), 
				  provinciaSantaCruz = new Provincia("Santa Cruz de Tenerife", isla1.getPoblacion() + isla4.getPoblacion() + isla5.getPoblacion() + isla7.getPoblacion());
		
		provinciaLasPalmas.add(isla2); //Fuenteventura
		provinciaLasPalmas.add(isla3); //Gran Canaria
		provinciaLasPalmas.add(isla6); //Lanzarote
		provinciaLasPalmas.add(isla1); //El Hierro
		provinciaLasPalmas.add(isla4); //La Gomera
		provinciaLasPalmas.add(isla5);// La Palma
		provinciaLasPalmas.add(isla7); //Tenerife
		
		
		Archipielago canarias = new Archipielago("Canarias", provinciaLasPalmas.getPoblacion() + provinciaSantaCruz.getPoblacion());
		canarias.add(provinciaLasPalmas);
		canarias.add(provinciaSantaCruz);
		
		try {
			XStream xstream = new XStream();
			xstream.alias("Archipielago", Archipielago.class);
			xstream.alias("Provincia", Provincia.class);
			xstream.alias("Isla", Isla.class);
			
			xstream.addImplicitCollection(Provincia.class, "lista");
			xstream.addImplicitCollection(Archipielago.class, "lista");
			
			xstream.toXML(canarias, new FileOutputStream(MIARCHIVO_XML));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
