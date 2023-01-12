package org.formation.sylla.modelisationdezoo.controleur;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.formation.sylla.modelisationdezoo.model.Animal;
import org.formation.sylla.modelisationdezoo.model.Cage;
import org.formation.sylla.modelisationdezoo.model.Gazelle;
import org.formation.sylla.modelisationdezoo.model.Lion;
import org.formation.sylla.modelisationdezoo.model.Monkey;
import org.formation.sylla.modelisationdezoo.model.Visitor;
import org.formation.sylla.modelisationdezoo.model.technique.CageOccupyException;

public class Manager {
	private static Manager instance = new Manager();
	private Cage cages[];
	
	
	private Manager() {
		super();
		cages= new Cage[3];
		init();
	}

	
	/**
	 * method to initialize the cages and enter a animal
	 * @throws CageOccupyException 
	 */
	private void init() {
		cages[0] = new Cage();
			try {
				cages[0].enterAnAnimal(new Lion("Lion", 2, 40));
				cages[1] = new Cage();
				cages[1].enterAnAnimal(new Monkey("Singe", 1, 15));
				cages[2] = new Cage();
				cages[2].enterAnAnimal(new Gazelle("Gazelle", 1, 20, 3));
			} catch (CageOccupyException e) {
				e.printStackTrace();
			}
	}


	public static Manager getInstance() {
		return instance;
	}
	
	/**
	 * 
	 * @param animal the animal's who should eat
	 */
	public void getEatToAnimal() { 
		for (Cage cage : cages) {
			if(!cage.isEmpty()) {
				cage.getAnimal().eat();
			}
		}
	}
	
	
	/**
	 * display all animals in the cage of the zoo
	 * @param cages the list cages in the zoo
	 */
	public List<String> displayAnimals() {
		List<String> list = new ArrayList<String>();
		for(Cage cage: cages) { 
			list.add(cage.toString());
		}
		return list;
	}
	
}
