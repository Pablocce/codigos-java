package DepartamentosSerializable;

import java.io.*;

public class EscribirFichDepartamento {

	public static void main(String[] args) throws IOException {
		Departamento departamento;
		File fichero = new File("FichDepartamento.dat");
		FileOutputStream fileout = new FileOutputStream(fichero);
		ObjectOutputStream dataOS = new ObjectOutputStream(fileout);
		
		String CodDep[] = {"Customer Service", "Development", "Finance", "Human Resources", "Marketing", "Production", "Quality Management", "Research","Sales"};
		String NombreDep[] = {"d009","d005","d002","d003","d001","d004","d006","d008","d007"};
		for (int i = 0; i<CodDep.length;i++) {
			departamento = new Departamento(CodDep[i], NombreDep[i]);
			dataOS.writeObject(departamento);
		}
		dataOS.close();
	}

}
