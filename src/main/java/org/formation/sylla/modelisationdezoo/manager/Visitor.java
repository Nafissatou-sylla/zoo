/**
 * 
 */
package org.formation.sylla.modelisationdezoo.manager;

/**
 * @author finas
 *
 */
public class Visitor {
	private int weight;

	/**
	 * @param weight visitor's weight
	 */
	public Visitor(int weight) { this.setWeight(weight); }

	/**
	 * @return visitor's weight
	 */
	public int getWeight() { return weight;}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) { this.weight = weight;}
	
}
