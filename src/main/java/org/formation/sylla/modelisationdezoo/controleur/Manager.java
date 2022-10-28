package org.formation.sylla.modelisationdezoo.controleur;

import java.util.ArrayList;
import java.util.List;

import org.formation.sylla.modelisationdezoo.model.Cage;
import org.formation.sylla.modelisationdezoo.model.Gazelle;
import org.formation.sylla.modelisationdezoo.model.Lion;
import org.formation.sylla.modelisationdezoo.model.Monkey;
import org.formation.sylla.modelisationdezoo.model.technique.CageOccupyException;

public class Manager {
	private static Manager instance = new Manager();
	private ArrayList<Cage> cages;
	
	public Manager() {
		super();
		init();
	}

	
	/**
	 * method to initialize the cages and enter a animal
	 */
	private void init() {
		cages= new ArrayList<>();
		for (Cage cage : cages) {
			try {
				cage.enterAnAnimal(new Lion("Lion", 1, 25.0));
				cage.enterAnAnimal(new Monkey("Singe", 1, 18.0));
				cage.enterAnAnimal(new Gazelle("Gazelle", 1, 15.0, 2.0));
			}
			catch (CageOccupyException e) {
				e.printStackTrace();
			}
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
		List<String> list = new ArrayList<>();
		for(Cage cage: cages) {
			list.add(cage.toString());
		}
		return list;
	}
	
}
