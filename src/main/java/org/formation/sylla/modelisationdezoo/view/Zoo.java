package org.formation.sylla.modelisationdezoo.view;
import org.formation.sylla.modelisationdezoo.controleur.Manager;

import java.util.ArrayList;

import org.formation.sylla.modelisationdezoo.model.Animal;
import org.formation.sylla.modelisationdezoo.model.Cage;
import org.formation.sylla.modelisationdezoo.model.Lion;
import org.formation.sylla.modelisationdezoo.model.Visitor;

/**
 * classe Zoo
 * @author SYLLA Nafissatou
 *
 */
public class Zoo {
	
	/**
	 * la liste des visiteurs
	 */
	private  ArrayList<Visitor> visitors;
	
	
	/**
	 * le nombre maximum des visiteurs
	 */
	private final int visitorSize = 10;
	
	
	/**
	 * le constructeur qui initialise la liste des visisteurs à null (association)
	 */
	public Zoo() {
		this.visitors = null;
	}

	
	/**
	 * 
	 * @param visitors the list of visitor to add in the zoo
	 * return la liste des visiteurs
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
	
	
	/**
	 * recupère la méthode getEatToAnimal de la classe Manager
	 */
	public void giveEat() {
		Manager.getInstance().getEatToAnimal();
	}
	
	/**
	 * récupère la méthode qui affiche les animaux de la classe Manager
	 */
	public void display() {
		for (String string: Manager.getInstance().displayAnimals()) {
			System.out.println(string);
		}
	}

}
