package ejercicios;

public class Datos {
	//atrib
	private double [] datos;
	//constructor
	public Datos(double[] datos) {
		this.datos = datos;
	}
	//metodo que devuelve el valor medio
	public double valorMedio () {
		double suma = 0;
		for (int i = 0; i < datos.length; i++) {
			suma+=datos[i];
		}
		return suma/datos.length;
	}
	//metodo que devuelve la desviacion tipica
	public double desviacionTipica (){
		double suma = 0;
		double dt = 0;
		for (int i = 0; i < datos.length; i++) {
			suma+=((datos[i]-valorMedio())*(datos[i]-valorMedio()));
		}
		dt = Math.sqrt(suma/datos.length);
		return dt;
	}
	//metodo que devuelve el numero de datos por debajo de la media
	public int valoresBajoMedia(){
		int contador = 0;
			for (int i = 0; i < datos.length; i++) {
				if(datos[i]<valorMedio()) contador++;
			}
		return contador;
	}
	//metodo que devuelve el valor mas pequeño del array
	public double valorMinimo(){
		double valor = datos[0];
		for (int i = 0; i < datos.length; i++) {
			if(valor > datos[i]) valor = datos [i];
		}	
		return valor;
	}
	//metodo que devuelve el valor mas grande del array
	public double valorMaximo(){
		double valor = datos[0];
		for (int i = 0; i < datos.length; i++) {
			if(valor < datos[i]) valor = datos [i];
		}	
		return valor;
	}
}
