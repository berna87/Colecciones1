package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {
	//atributo arraylist
	private List<Persona> listaPersonas;
	//constructor
	public ListaPersonas(){
		this.listaPersonas = new ArrayList<Persona>();
	}
	public void añadirPersona (Persona p){
		listaPersonas.add(p);
	}
	public void eliminarPersona(int n){
		if(listaPersonas.size()>n) listaPersonas.remove(n);
	}
	public boolean existePersona(int n){
		return listaPersonas.size()>n;
	}
	public void modificarNombrePersona(int n, String nn){
		Persona p = listaPersonas.get(n);
		p.setNombre(nn);
	}
	public void modificarNombrePersona(int n, int ne){
		Persona p = listaPersonas.get(n);
		p.setEdad(ne);
	}
	@Override
	public String toString() {
		return listaPersonas.toString();
	}
	
}
