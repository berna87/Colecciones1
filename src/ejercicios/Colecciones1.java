package ejercicios;

public class Colecciones1 {
	//atributo
	private	int [] array ;
	//constructor que inicializa el array con n valores
	public Colecciones1(int n){
		this.array = new int [n];
	}
	//metodo que asigna el 5 al ultimo valor del array
	public void ultimoValor(){
		array [array.length-1]=5;
	}
	//metodo que asigna el 3 al primer valor y el doble para el siguiente para el resto de valores excepto al ultimo
	public void asignarValores(){
		int valor = 3;
		for (int i = 0; i < array.length-1; i++) {
			array[i] = valor;
			valor = valor*2;
		}
	}
	//metodo que calcula la suma de todos los valores del array
	public void sumaValores(){	
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		System.out.println("La suma de todos los valores del array : "+suma);
	}
	//metodo que divide por 3 los ultimos 5 valores del array
	public void divideUltimos(){
		for (int i = array.length-5; i < array.length; i++) {
			array [i] = array[i]/3;
		}
	}
	//metodo que calcula el valor mas peque�o del array
	public void valorMin(){
		int valMin = array[0];
		for (int i = 0; i < array.length; i++) {
			if(valMin > array[i]) valMin = array[i];		
		}
		System.out.println("Valor mas peque�o : "+valMin);
	}
	//metodo que muestra los valores en 3 filas de 4 columnas y 5 espacios de separacion
	public void mostrarValores(){
		int contador=0;
		for (int i : array) {
			System.out.printf("%-5d",i);
			contador++;
			if(contador % 4 == 0 && contador != 0) System.out.println();
		}
	}
}