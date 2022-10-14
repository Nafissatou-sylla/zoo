package org.formation.sylla.modelisationdezoo.controler;

public class Gazelle extends Animal{
	private double hornLenght;
	
	public Gazelle(String name, int age, double weight, double hornLenght) {
		super(name, age, weight);
		this.setHornLenght(hornLenght);
	}

	/**
	 * @return the hornLenght
	 */
	public double getHornLenght() { return hornLenght; }

	/**
	 * @param hornLenght the hornLenght to set
	 */
	public void setHornLenght(double hornLenght) { this.hornLenght = hornLenght; }

	@Override
	public void eat() { this.grow(0.40);}

	@Override
	public void sleep() { this.losingWeight(0.1); }

	public void jump() { this.losingWeight(0.07); }

}
