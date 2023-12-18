package org.generation.italy;

import java.util.Random;

public class Calcolatrice {
	Random r=new Random();
	private int batteria=r.nextInt(101);		//da 0 a 100
	
	static float somma(float numero1, float numero2) {		//associato alla classe Calcolatrice
		return numero1+numero2;
	}
	
	static float sottrai(float numero1, float numero2) {		//associato alla classe Calcolatrice
		return numero1-numero2;
	}

	static float moltiplica(float numero1, float numero2) {		//associato alla classe Calcolatrice
		return numero1*numero2;
	}
	
	static float dividi(float numero1, float numero2) {		//associato alla classe Calcolatrice
		return numero1/numero2;
	}
	
	int getLivelloBatteria() {			//non statico=>ogni calcolatrice ha il suo livello batteria		
		return batteria;
	}
}
