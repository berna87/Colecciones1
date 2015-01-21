package diapositivas;

import java.util.Scanner;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaPersonas l = new ListaPersonas();
		Scanner sc = new Scanner(System.in);
		for(String per="";;){
			System.out.println("Introduce el nombre de la persona // exit para finalizar");
			per = sc.next();
			if (per.equals("exit"))break;
			System.out.println("Edad de la persona");
			int e = sc.nextInt();
			l.añadirPersona(new Persona(e,per));
		}
		System.out.println(l);
		System.out.println("Introduce el numero de persona que quieres modificar");
		int np = sc.nextInt();
		System.out.println("Nuevo nombre");
		String nomp = sc.next();
		l.modificarNombrePersona(np, nomp);
		System.out.println(l);
		System.out.println("Introduce el numero de la persona para borrarla");
		int bn = sc.nextInt();
		sc.close();
		if(l.existePersona(bn)) l.eliminarPersona(bn);
		else System.out.println("La persona introducida no existe");
		System.out.println(l);
	}

}
