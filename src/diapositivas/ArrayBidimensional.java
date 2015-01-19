package diapositivas;

public class ArrayBidimensional {
	public static void main(String[] args) {
		double [][] tabla = {{7,11,2.6},{4.5,13,1},{20,5.8,14},{2,5.9,15}};
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
		System.out.println("-----------------------------");
		System.out.println("Imprimo tabla2 con valores invertidos de tabla");
		double [][]tabla2 = new double [4][3];
		int fl = 0;
		int col = 0;
		for (int i = tabla.length-1; i >= 0; i--) {
			col = 0;
			for (int j = tabla[i].length-1; j >= 0; j--) {
				tabla2 [fl][col] = tabla [i][j];
				System.out.print(tabla2[fl][col]+"\t");
				col++;
			}
			fl++;
			System.out.println();
		}
	}
}
