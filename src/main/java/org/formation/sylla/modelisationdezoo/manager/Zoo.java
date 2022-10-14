package org.formation.sylla.modelisationdezoo.controler;

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
	public void aVisitor(ArrayList<Visitor> visitors) {
		for(int i=0; i<= visitorSize; i++) {
			visitors.add(new Visitor(11));
		}
	}
	
	
	/**
	 * 
	 * @param visitors visitors the list of visitor to add in the zoo
	 * @return the visitor to get out
	 */
	public Visitor takeOutAVisitor(ArrayList<Visitor> visitors) {
		Visitor visitor = null;
		for(int i=0; i<= visitorSize; i++) {
			visitor = visitors.remove(i);
		}
		return visitor;

	}

	/**
	 * @return the visitors
	 */
	public ArrayList<Visitor> getVisitors() {return visitors;}
	
	public void setVisitors(ArrayList<Visitor> visitors) { this.visitors = visitors;}
}
