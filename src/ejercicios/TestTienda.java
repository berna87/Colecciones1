package ejercicios;

import java.util.Scanner;

public class TestTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tienda t = new Tienda();
		Scanner sc = new Scanner(System.in);
		//producto1
		System.out.println("Id producto p1");
		int idp = sc.nextInt();
		System.out.println("nombre producto p1");
		String nop = sc.next();
		System.out.println("precio producto p1");
		double prp = sc.nextDouble();
		Producto p1 = new Producto(idp, nop, prp);
		t.addProducto(p1);
		//producto2
		System.out.println("Id producto p2");
		idp = sc.nextInt();
		System.out.println("nombre producto p2");
		nop = sc.next();
		System.out.println("precio producto p2");
		prp = sc.nextDouble();
		Producto p2 = new Producto(idp, nop, prp);
		t.addProducto(p2);
		//producto3
		System.out.println("Id producto p3");
		idp = sc.nextInt();
		System.out.println("nombre producto p3");
		nop = sc.next();
		System.out.println("precio producto p3");
		prp = sc.nextDouble();
		Producto p3 = new Producto(idp, nop, prp);
		t.addProducto(p3);
		sc.close();
		System.out.println(t);
		System.out.println("Producto mas barato : "+t.productoMasBarato());
		System.out.println("Producto mas caro : "+t.productoMasCaro());
	}

}
