package org.formation.sylla.modelisationdezoo.manager;

import java.util.ArrayList;

public class Zoo {
	private ArrayList<Cage> cages;
	private  ArrayList<Visitor> visitors;
	private final int visitorSize = 10;
	
	public Zoo() {
		this.visitors = null;
		this.cages = new ArrayList<>();
	}

	/**
	 * @param cages the zoo's cages
	 */
	public Zoo(ArrayList<Cage> cages) { this.setCages(cages); }

	/**
	 * @return the list of the cages in the zoo
	 */
	public ArrayList<Cage> getCages() { return cages; }

	
	/**
	 * @param cages the cages to set
	 */
	public void setCages(ArrayList<Cage> cages) { this.cages = cages; }
	

	/**
	 * display all animals in the cage of the zoo
	 * @param cages the list cages in the zoo
	 */
	public void displayAnimal(ArrayList<Cage> cages) {
		for(Cage cage: cages) {
			System.out.print(cage.getAnimal().getName() + 
					cage.getAnimal().getAge() + " ans " + 
					cage.getAnimal().getWeight() + "kg  " );
			if(cage.getAnimal().getName() == "La Gazelle ") {
				System.out.print(cage.getAnimal().getHornLenght() + "cm");}
			System.out.println();
		}
	}
	
	  
	
	/**
	 * 
	 * @param animal the animal's who should eat
	 */
	public void getEatToAnimal(Animal animal) { animal.eat();}
	
	
	/**
	 * 
	 * @param visitors the list of visitor to add in the zoo
	 */
	public ArrayList<Visitor> addVisitor(ArrayList<Visitor> visitors) {
		double weight = 50;
		for(int i=0; i<= visitorSize; i++) {
			visitors.add(new Visitor(weight));
			weight++;
		 }
		return visitors;
	}
	
	
	/**
	 * 
	 * @param visitors visitors the list of visitor to add in the zoo
	 * @return the visitor to get out
	 */
	public Visitor takeOutAVisitor(ArrayList<Visitor> visitors) {
		return visitors.remove( visitors.size()-1 );
	}

}
