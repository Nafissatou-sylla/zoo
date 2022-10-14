/**
 * 
 */
package org.formation.sylla.modelisationdezoo.controler;

/**
 * @author finas
 *
 */
public class Visitor {
	private int weight;

	/**
	 * @param weight
	 */
	public Visitor(int weight) {
		this.setWeight(weight);
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
