package org.formation.sylla.modelisationdezoo.view;

import java.util.ArrayList;

import org.formation.sylla.modelisationdezoo.controler.Cage;
import org.formation.sylla.modelisationdezoo.controler.Gazelle;
import org.formation.sylla.modelisationdezoo.controler.Lion;
import org.formation.sylla.modelisationdezoo.controler.Monkey;
import org.formation.sylla.modelisationdezoo.controler.Visitor;
import org.formation.sylla.modelisationdezoo.controler.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Cage cage = new Cage();
		ArrayList<Cage> cages = new ArrayList<>();
		
		Lion lion = new Lion("Le lion ", 1, 5.0);
		Monkey monkey = new Monkey("Le Singe ", 1, 3.0);
		Gazelle gazelle = new Gazelle("La Gazelle ", 1, 9.0 , 2);
		Visitor visitor = new Visitor(15);
		
		cages.add(new Cage(lion));
		cages.add(new Cage(monkey));
		cages.add(new Cage(gazelle));
		
		zoo.displayAnimal(cages);
		
		lion.eat(visitor);
		
		zoo.getEatToAnimal(lion);
		zoo.getEatToAnimal(monkey);
		zoo.getEatToAnimal(gazelle);
		
		
		System.out.println("\n" + "les animaux aprés avoir mangé" + "\n");
		zoo.displayAnimal(cages);
		

	}

}
