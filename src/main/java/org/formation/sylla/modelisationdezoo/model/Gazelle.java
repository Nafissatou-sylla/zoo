package org.formation.sylla.modelisationdezoo.model;

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

	/**
	 * when the gazelle eats she grows 0.4kg
	 */
	@Override
	public void eat() { this.grow(0.40);}

	
	/**
	 * when the gazelle sleeps she loses 0.1kg
	 */
	@Override
	public void sleep() { this.losingWeight(0.1); }

	/**
	 * when the gazelle jump she losess 0.07kg
	 */
	public void jump() { this.losingWeight(0.07); }

	@Override
	public String toString() {
		return  super.toString() + " hornLenght=" + hornLenght ;
	}

	
	
	

}
