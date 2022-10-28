package org.formation.sylla.modelisationdezoo.model;

import org.formation.sylla.modelisationdezoo.model.technique.CageOccupyException;

public class Cage {
	private Animal animal;
	
	public Cage() {this.animal = null;}


	/**
	 * @return the animal in the cage
	 */
	public Animal getAnimal() { return animal; }


	/**
	 * @param animal the animal to set
	 */
	public void setAnimal(Animal animal) { this.animal = animal;}
	
	
	/**
	 * 
	 * @param animal the animal that enters in the cage
	 * @throws CageOccupyException 
	 */
	public void enterAnAnimal(Animal animal) throws CageOccupyException {
		if (this.animal != null) {
			throw new CageOccupyException();
		}
		else {
			this.animal = animal;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Cage [animal=" + animal.toString() + "]";
	}


	/**
	 * 
	 * @return the animal who should go out in the cage
	 */
	public Animal takeOutAnAnimal() {
		Animal tmp = null;
		tmp = this.animal;
		this.animal = null;
		return tmp;
	}
	
	/**
	 * method to give eat the animal in the cage
	 */
	public void eat() {
		if(animal != null) {
			animal.eat();
		}
	}
	
	
	public boolean isEmpty() {
		return this.animal == null;
	}
}
