package diapositivas;

import java.util.ArrayList;

public class ListaInicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String> (); //creamos una lista vacia
		list.add("Madrid");
		list.add("Londres");
		list.add("Paris");
		list.add("New York");
		list.add("Berlin");
		list.add("Caracas");
		System.out.println(list);
		System.out.println("Tamaño de la lista = "+list.size());
		list.add(2, "Barcelona"); //añado un objeto en la posicion 2
		System.out.println("------------------------");
		System.out.println(list);
		System.out.println("Tamaño de la lista = "+list.size());
		list.remove("Londres");
		list.remove(0);
		System.out.println("------------------------");
		System.out.println(list);
		System.out.println("Tamaño de la lista = "+list.size());
		System.out.println("Posicion de Paris = "+list.indexOf("Paris"));
		System.out.println("Objeto de la posicion 3 : "+list.get(3));
		System.out.println("¿Está Dublin en la lista? : "+list.contains("Dublin"));
		System.out.println("¿Está Barcelona en la lista? : "+list.contains("Barcelona"));
	}

}
