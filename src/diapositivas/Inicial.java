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
		System.out.println("Opcion 1:");
		for (int i = 0; i < TAMARRAY; i++) {
			System.out.print(numeros[i]+"\t");
		}
		System.out.println("\nOpcion 2:");
		for (double d : numeros) {
			System.out.print(d+"\t");
		}
	}

}
