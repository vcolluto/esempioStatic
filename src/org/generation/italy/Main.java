package org.generation.italy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) {
		

		
		//Triangolo.numeroTriangoli=542;		//l'attributo statico si può utilizzare sulla classe
		
		
		Triangolo t1=new Triangolo();	//numero triangoli diventa 1	
		t1.base=30;
		t1.altezza=20;
		
		System.out.println("t1:");
		System.out.println("Id: "+t1.getId());
		System.out.println("Base: "+t1.base);
		System.out.println("Altezza: "+t1.altezza);
		//System.out.println("Numero triangoli: "+Triangolo.getNumeroTriangoli());		
	
		
		
		Triangolo t2=new Triangolo(); //numero triangoli diventa 2
		t2.base=40;
		t2.altezza=15;		
		
		System.out.println("\nt2:");
		System.out.println("Id: "+t2.getId());
		System.out.println("Base: "+t2.base);
		System.out.println("Altezza: "+t2.altezza);
		
		System.out.println("Numero triangoli: "+Triangolo.getNumeroTriangoli());
		
		
		
		
		
		System.out.println("La somma dei numeri 3 e 5 è: "+Calcolatrice.somma(3, 5));  //non ho fatto nessun new (perché il metodo è statico)
		System.out.println("La differenza dei numeri 3 e 5 è: "+Calcolatrice.sottrai(3, 5));
		Calcolatrice c1=new Calcolatrice();
		Calcolatrice c2=new Calcolatrice();
		
		System.out.println("Calcolatrice 1 - batteria: "+c1.getLivelloBatteria());
		System.out.println("Calcolatrice 2 - batteria: "+c2.getLivelloBatteria());
	///	System.out.println("Calcolatrice 2 - batteria: "+Calcolatrice.getLivelloBatteria());  //non si può fare perché il livello batteria dipende dall'istanza (il metodo non è statico)
		
	
		LocalDate d1=LocalDate.now(); 		//assegno a d1 il valore della data attuale
		
		System.out.println("La data attuale (formato standard) è: "+ d1);  //formato standard
		DateTimeFormatter df=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println("La data attuale (formato ita) è : "+ d1.format(df));
	}

}
