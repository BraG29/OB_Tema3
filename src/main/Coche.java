package main;

public class Coche {
	private int puertas;
	
	public Coche(int puertas) {
		this.puertas = puertas;
	}

	public String getPuertas() {
		return "La cantidad de puertas del coche es de: " + this.puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public void agregarPuerta(int puertas) {
		this.puertas += puertas;
	}
}
