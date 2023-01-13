package org.formation.sylla.modelisationdezoo.model;

public class Lion extends Animal implements Mangeable{
	
	/**
	 * 
	 * @param name LionTest name's in super class
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
	 * when the lion sleeps he loses 0,3kg
	 */
	@Override
	public void sleep() { this.losingWeight(0.3); }
	
	
	/**
	 * when lion jumps he loses 0,5 KG
	 */
	public void jump() { this.losingWeight(0.5); }
	
	
	/**
	 * when the lion run he loses 0.35 KG
	 */
	public void run() {this.losingWeight(0.35); }
	
	
	/**
	 * 
	 * @return lion cry's type
	 */
	public String cry() { return "rugir" ; }

	/**
	 * when the lion eats the gazelle he grows
	 * @param gazelle the gazelle to eat
	 */
	public double devorer(Gazelle gazelle) {
		this.grow(gazelle.getWeight() / 3);
		return this.getWeight();
	}


	/**
	 * when the lion eats the visitor he grows
	 * @param visitor the visitor to eat
	 */
	public double devorer(Visitor visitor) {
		this.grow(visitor.getWeight() / 3);
		return this.getWeight();
	}

	
}
