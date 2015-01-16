package diapositivas;

public class ArrayBidimensional {
	public static void main(String[] args) {
		double [][] tabla = {{0,1,2},{2,3,5},{2,5,4},{2,5,5}};
		double suma = 0;
		int contador = 0;
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j]+"\t");
				suma+= tabla[i][j];
				contador++;
			}
			System.out.println("");
		}
		double media = suma /contador;	
		System.out.printf("\nMedia de los valores = %.3f%n",media);
		for (int i = tabla.length-1; i >= 0; i--) {
			for (int j = tabla[i].length-1; j >= 0; j--) {
				System.out.print(tabla[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
