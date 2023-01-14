package org.formation.sylla.modelisationdezoo.model;

import org.formation.sylla.modelisationdezoo.model.technique.CageOccupyException;

/**
 * classe Cage, les cages du zoo qui contiennent les animaux
 * @author SYLLA Nafissatou
 *
 */
public class Cage {
	private Animal animal;


	/**
	 * le constructeur qui initialise l'animal à null (ASSOCIATION)
	 */
	public Cage() {this.animal = null;}
	
	
	/**
	 * méthode pour faire entrer un animal dans une cage, elle lève une exception si la cage contient un animal
	 * @param l'animal à entrer dans la cage
	 * @throws CageOccupyException l'exception à lever
	 */
	public void enterAnAnimal(Animal animal) throws CageOccupyException {
		if (this.animal != null) {
			throw new CageOccupyException();
		}
		else {
			this.setAnimal(animal);	
		}
	}
	

	/**
	 * retour l'animal
	 * @return the animal in the cage
	 */
	public Animal getAnimal() { return animal; }


	/**
	 * change l'animal à un autre animal
	 * @param animal le nouveau animal
	 */
	public void setAnimal(Animal animal) { this.animal = animal;}


	/**
	 * une méthode pour faire sortir l'animal dans la cage
	 * @return l'animal qui doit sortir
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
	public void giveEat() {
		if(animal != null) {
			animal.eat();
		}
	}
	
	
	/**
	 * vérifie si l'animal est null
	 * @return retour vrai ou faux
	 */
	public boolean isEmpty() {
		return this.animal == null;
	}
	
	
	@Override
	public String toString() {
		return "Cage de: " + this.getAnimal();
	}
}
