package org.formation.sylla.modelisationdezoo.controler;

public class Monkey extends Animal{

	/**
	 * 
	 * @param name monkey's name
	 * @param age monkey's age
	 * @param weight monkeys weight
	 */
	public Monkey(String name, int age, double weight) {
		super(name, age, weight);
	}

	/**
	 * when monkey eat he grows 0.35kg
	 */
	@Override
	public void eat() { this.grow(0.35); }

	
	/**
	 * when monkey sleeps he loses 0.12kg
	 */
	@Override
	public void sleep() { this.losingWeight(0.12); }
	
	/**
	 * when monkey jumps he loses 0.07kg
	 */
	public void jump() { this.losingWeight(0.07); }
	
	/**
	 * 
	 * @return monkey's cry's type
	 */
	public String cry() {return "Babouiner "; }
}
