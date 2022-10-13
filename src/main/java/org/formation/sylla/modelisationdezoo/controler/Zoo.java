package org.formation.sylla.modelisationdezoo.controler;

import java.util.ArrayList;

public class Zoo {
	private ArrayList<Cage> cages;
	private ArrayList<Animal> animals;
	private Visiteur visiteurs;
	
	public Zoo() {
		this.animals = null;
		this.visiteurs = null;
		this.cages = new ArrayList<>();
		this.cages.add(new Cage(new Lion(" ", 0, 5)));
		this.cages.add(new Cage(new Monkey(" ", 0, 5)));
		this.cages.add(new Cage(new Gazelle(" ", 0, 5, 2)));
		
	}

	/**
	 * @param cages
	 */
	public Zoo(ArrayList<Cage> cages) {
		this.setCages(cages);
	}

	/**
	 * @return the cages
	 */
	public ArrayList<Cage> getCages() {
		return cages;
	}

	/**
	 * @param cages the cages to set
	 */
	public void setCages(ArrayList<Cage> cages) {
		this.cages = cages;
	}
	
	
}
