package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class TestDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length > 0){
			List<Double> list = new ArrayList<Double> ();
			for (int i = 0; i < args.length; i++) {
				list.add(Double.parseDouble(args[i]));
			}	
			double [] array = new double [list.size()];
			for (int i = 0; i < array.length; i++) {
				array[i]=list.get(i);
			}
			Datos dat = new Datos(array);
			System.out.printf("Valor medio : %.2f%n",dat.valorMedio());
			System.out.printf("Desviacion tipica : %.2f%n",dat.desviacionTipica());
			System.out.printf("Valor Minimo : %.2f%n",dat.valorMinimo());
			System.out.printf("Valor Maximo : %.2f%n",dat.valorMaximo());
			System.out.printf("Numero de valores por debajo de la media : %d%n",dat.valoresBajoMedia());
		}	else System.out.println("Introduce argumentos");
	}

}
