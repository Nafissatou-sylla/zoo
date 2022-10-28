package org.formation.sylla.modelisationdezoo.view;

import java.util.ArrayList;

import org.formation.sylla.modelisationdezoo.controleur.Manager;
import org.formation.sylla.modelisationdezoo.model.Cage;
import org.formation.sylla.modelisationdezoo.model.Visitor;

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
	
	
	public void giveEat() {
		Manager.getInstance().getEatToAnimal();
	}
	
	
	public void display() {
		for (String string: Manager.getInstance().displayAnimals()) {
			System.out.println(string);
		}
	}

}
