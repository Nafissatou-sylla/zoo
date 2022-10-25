 package org.formation.sylla.modelisationdezoo.view;

import java.util.ArrayList;

import org.formation.sylla.modelisationdezoo.model.Cage;
import org.formation.sylla.modelisationdezoo.model.Gazelle;
import org.formation.sylla.modelisationdezoo.model.Lion;
import org.formation.sylla.modelisationdezoo.model.Monkey;
import org.formation.sylla.modelisationdezoo.model.Visitor;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Cage cage = new Cage();
		ArrayList<Cage> cages = new ArrayList<>();
		
		Lion lion = new Lion("Le lion ", 1, 15.0);
		Monkey monkey = new Monkey("Le Singe ", 1, 6.0);
		Gazelle gazelle = new Gazelle("La Gazelle ", 1, 9.0 , 2);
		Visitor visitor = new Visitor(15);
		
		cages.add(new Cage(lion));
		cages.add(new Cage(monkey));
		cages.add(new Cage(gazelle));
		
		zoo.displayAnimal(cages);
		
		lion.devour(visitor);
		
		zoo.getEatToAnimal(lion);
		zoo.getEatToAnimal(monkey);
		zoo.getEatToAnimal(gazelle);
		
		
		System.out.println("\n" + "les animaux aprés avoir mangé" + "\n");
		zoo.displayAnimal(cages);
	}
}
