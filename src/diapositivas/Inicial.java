package diapositivas;

import java.util.Scanner;

public class Inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAMARRAY = 5;
		double [] numeros = new double [TAMARRAY];
		Scanner in = new Scanner (System.in);
		for (int i = 0; i < TAMARRAY; i++) {
			System.out.println("Introduce un valor para la posicion "+i+" :");
			numeros [i] = in.nextDouble();	
		}
		in.close();
		//imprimir utilizando un bucle
		System.out.println("Opcion 1:");
		for (int i = 0; i < TAMARRAY; i++) {
			System.out.print(numeros[i]+"\t");
		}
		//imprimir utilizando un bucle extendido
		System.out.println("\nOpcion 2:");
		for (double d : numeros) {
			System.out.print(d+"\t");
		}
		//calcular valor medio
		double suma=0;
		for (int i = 0; i < TAMARRAY; i++) {
			suma+=numeros[i];
		}
		double media = suma/TAMARRAY;
		System.out.printf("%nEl valor medio es %.2f",media);
		//calcular numero de elementos por debajo de la media
		int contador = 0;
		for (int i = 0; i < TAMARRAY; i++) {
			if(numeros[i] < media) contador++;
		}
		System.out.println("\nNumero de valores por debajo de la media: "+contador);
	}

}
