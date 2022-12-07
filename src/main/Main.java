package main;

public class Main {

	public static void main(String[] args) {
		//Parte 1
		//System.out.println(suma(1, 2, 3));

		//Parte 2
		Coche c1 = new Coche(2);
		System.out.println(c1.getPuertas());
		c1.agregarPuerta(2);
		System.out.println(c1.getPuertas());
	}
	
	public static int suma(int a, int b, int c) {
		return a+b+c;
	}

}
