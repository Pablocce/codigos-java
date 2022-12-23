package serializableDepartamento;

import java.io.Serializable;

public class Departamento implements Serializable {
	private String NombreDep;
	private String CodDep;
	
	public Departamento(String NombreDep, String CodDep) {
		this.NombreDep = NombreDep;
		this.CodDep = CodDep;
	}
	
	public Departamento() {
		this.NombreDep = null;
	}
	
	public void setNombreDep(String NombreDep) {
		this.NombreDep = NombreDep;
	}

}
