package ejercicios;
/**
 * 
 * @author Bernabe Fernandez Ogayar
 * @version 1.0
 */
public class Datos {
	private double [] datos;
	/**
	 * 
	 * @param datos Un array de tipo double
	 */
	public Datos(double[] datos) {
		this.datos = datos;
	}
	/**
	 * 
	 * @return devuelve la media de todos los valores del array
	 */
	public double valorMedio () {
		double suma = 0;
		for (int i = 0; i < datos.length; i++) {
			suma+=datos[i];
		}
		return suma/datos.length;
	}
	/**
	 * 
	 * @return devuelve la desviacion tipica de los valores del array
	 */
	public double desviacionTipica (){
		double suma = 0;
		double dt = 0;
		for (int i = 0; i < datos.length; i++) {
			suma+=((datos[i]-valorMedio())*(datos[i]-valorMedio()));
		}
		dt = Math.sqrt(suma/datos.length);
		return dt;
	}
	/**
	 * 
	 * @return devuelve el numero de valores por debajo de la media
	 */
	public int valoresBajoMedia(){
		int contador = 0;
			for (int i = 0; i < datos.length; i++) {
				if(datos[i]<valorMedio()) contador++;
			}
		return contador;
	}
	/**
	 * 
	 * @return devuelve el valor mas pequeño del array
	 */
	public double valorMinimo(){
		double valor = datos[0];
		for (int i = 0; i < datos.length; i++) {
			if(valor > datos[i]) valor = datos [i];
		}	
		return valor;
	}
	/**
	 * 
	 * @return devuelve el valor mas grande del array
	 */
	public double valorMaximo(){
		double valor = datos[0];
		for (int i = 0; i < datos.length; i++) {
			if(valor < datos[i]) valor = datos [i];
		}	
		return valor;
	}
}
