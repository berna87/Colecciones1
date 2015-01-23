package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	private List<Producto> p;
	public Tienda (){
		this.p = new ArrayList<Producto>();
	}
	public void addProducto(Producto p){
		this.p.add(p);
	}
	public List<Producto> getLista(){
		return this.p;
	}
	public void eliminarProducto(Producto p){
		this.p.remove(p);
	}
	public Producto productoMasCaro(){
		double precio = p.get(0).getPrecioProducto();
		Producto productoMasCaro = p.get(0);
		for (int i = 0; i < p.size(); i++) {
			if(precio > p.get(i).getPrecioProducto()) productoMasCaro = p.get(i);
		}
		return productoMasCaro;
	}
	public Producto productoMasBarato(){
		double precio = p.get(0).getPrecioProducto();
		Producto productoMasBarato = p.get(0);
		for (int i = 0; i < p.size(); i++) {
			if(precio < p.get(i).getPrecioProducto()) productoMasBarato = p.get(i);
		}
		return productoMasBarato;
	}
	@Override
	public String toString() {
		return p.toString();
	}
	
}
