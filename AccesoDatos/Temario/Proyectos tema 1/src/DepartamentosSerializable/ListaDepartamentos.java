package DepartamentosSerializable;

import java.util.ArrayList;
import java.util.List;

public class ListaDepartamentos {
	
	private List<Departamento> lista = new ArrayList <Departamento>();
	
	public ListaDepartamentos() {}
	
	public void add(Departamento dep) {
		lista.add(dep);
	}
	
	public List<Departamento> getListaDepartamentos(){
		return lista;
	}
}
