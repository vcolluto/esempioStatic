package org.generation.italy;

public class Triangolo {
	float base,altezza;					//ogni triangolo ha la sua base e la sua altezza
	
	private static int numeroTriangoli=0;			//condiviso da tutti i triangoli

	
	
	public Triangolo() {
		numeroTriangoli++;		//ogni volta che si crea un triangolo incremento di 1
	}


	public static int getNumeroTriangoli() {
		return numeroTriangoli;
	}

}
