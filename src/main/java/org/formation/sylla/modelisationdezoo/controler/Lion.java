package org.formation.sylla.modelisationdezoo.controler;

public class Lion extends Animal{
	
	/**
	 * 
	 * @param name Lion name's in super class
	 * @param age lion's age in super class
	 * @param weight lion's weight in super class
	 */
	public Lion(String name, int age, double weight) {
		super(name, age, weight);
	}

	/**
	 * when the lion eats he grows 1,9kg
	 */
	@Override
	public void eat() { this.grow(1.9); }
	
	/**
	 * when the lion sleeps he loses 0,3 kg
	 */

	@Override
	public void sleep() { this.losingWeight(0.3); }

	/**
	 * return lion's weight + @param weight
	 */
	@Override
	public double grow(double weight) { return this.getWeight() + weight; }

	/**
	 * return lion's weight - @param weight
	 */
	@Override
	public double losingWeight(double weight) { return this.getWeight() - weight; }
	
	public void jump() { this.losingWeight(0.5); }
	
	public void run() {this.losingWeight(0.35); }
	
	/**
	 * 
	 * @return lion cry's type
	 */
	public String cry() { return " rugir" ; }
	
	public void devour() {}

}
