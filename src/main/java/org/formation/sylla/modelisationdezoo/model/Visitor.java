/**
 * 
 */
package org.formation.sylla.modelisationdezoo.model;

/**
 * classe visiteur
 * @author SYLLA Nafissatou
 *
 */
public class Visitor {
	
	/**
	 * le poids du visiteur
	 */
	private double weight;

	
	/**
	 * le constructeur
	 * @param weight visitor's weight
	 */
	public Visitor(double weight) { this.weight = weight; }

	/**
	 * @return visitor's weight
	 */
	public double getWeight() { return weight;}

	
}
