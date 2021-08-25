package com.camaratek;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Vehicule> vehicules = new ArrayList<Vehicule>();
		vehicules.add( new Vehicule( "Renault", "Noir", 2 ) );
		vehicules.add( new Vehicule( "Peugeot", "Jaune", 3 ) );
		vehicules.add( new Vehicule( "Mercedes", "Bleu", 7 ) );
		vehicules.add( new Vehicule( "Citroen", "Vert", 9 ) );
		vehicules.add( new Vehicule( "Toyota", "Marron", 14 ) );
		vehicules.add( new Vehicule( "Nissan", "Gris", 17 ) );
		vehicules.add( new Vehicule( "Ford", "Jaune", 1 ) );
		vehicules.stream()
				 .filter( v -> v.getAge() >= 5 )
				 .forEach( v -> System.out.println( v.getMarque().toUpperCase() ));
		
		int sum = vehicules.stream()
				 .filter( v -> v.getAge() >= 7 )
				 .map( v -> v.getAge() )
				 .reduce( 0, ( c, p) -> c + p, Integer::sum );
		System.out.println( sum );
		
		long numOfVehicules = vehicules.stream()
									   .filter( v -> v.getMarque().contains("o") )
									   .count();
		System.out.println( numOfVehicules );
		//)
	}

}
