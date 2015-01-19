package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class RecorrerArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer> (); //creo un ArrayList de numeros enteros
		int [] arrayEnteros = {1,2,3,4,5,6,7,8,9}; //creo un array con numeros enteros
		for (int i = 0; i < arrayEnteros.length; i++) {
			list.add(arrayEnteros[i]);
		}
		System.out.println(list);
		Integer numero1 = new Integer (10);
		list.add(0,numero1);
		System.out.println(list);
		
		Integer numero2 = new Integer (100);
		list.set(0, numero2);
		System.out.println(list);
		//cantidad de numero pares
		int contadorPares = 0;
		for (int i = 0; i < list.size(); i++) {
			if((list.get(i)%2) == 0) contadorPares++;
		}
		System.out.println("Cantidad de numeros pares : "+contadorPares);
		//encontrar numeros impares y añadirlos a otra lista
		List<Integer> listImpares = new ArrayList<Integer> ();
		for (Integer integer : list) {
			if ((integer % 2) != 0) listImpares.add(integer);
		}
		System.out.println("Numeros impares : "+listImpares);

	}

}
