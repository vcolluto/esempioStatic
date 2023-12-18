package org.generation.italy;

public class Triangolo {
	float base,altezza;					//ogni triangolo ha la sua base e la sua altezza
	
	private static int numeroTriangoli=0;			//condiviso da tutti i triangoli
    private int id;		//attributo di istanza
	
	
	public Triangolo() {
		numeroTriangoli++;		//ogni volta che si crea un triangolo incremento di 1
		id=numeroTriangoli;
	}


	public static int getNumeroTriangoli() {
		return numeroTriangoli;
	}


	public int getId() {
		return id;
	}
	
	

}
