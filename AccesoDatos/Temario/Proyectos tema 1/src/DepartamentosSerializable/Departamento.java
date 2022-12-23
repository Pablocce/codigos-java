package DepartamentosSerializable;

import java.io.Serializable;

public class Departamento implements Serializable {
	private String NombreDep;
	private String CodDep;
	
	public Departamento(String nombreDep, String codDep) {
		this.NombreDep = nombreDep;
		this.CodDep = codDep;
	}
	
	public Departamento() {
		this.NombreDep = null;
	}
	
	public void setNombreDep(String NombreDep) {
		this.NombreDep = NombreDep;
	}
	
	public void setCodDep(String CodDep) {
		this.CodDep = CodDep;
	}
	
	public String getNombreDep(String NombreDep) {
		return this.NombreDep;
	}
	
	public String getCodDep(String CodDep) {
		return this.CodDep;
	}
	

}
