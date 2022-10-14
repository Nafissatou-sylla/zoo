package org.formation.sylla.modelisationdezoo.controler;


public class Cage {
	private Animal animal;
	
	public Cage() {}

	/**
	 * @param cages
	 */
	public Cage(Animal animal) { this.animal = animal; }


	/**
	 * @return the animal in the cage
	 */
	public Animal getAnimal() { return animal; }


	/**
	 * @param animal the animal to set
	 */
	public void setAnimal(Animal animal) { this.animal = animal;}
}
