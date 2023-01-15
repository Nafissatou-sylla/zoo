package org.formation.sylla.modelisationdezoo.model;

/**
 * classe de l'animal Gazelle
 * @author SYLLA Nafissatou
 *
 */
public class Gazelle extends Animal{
	
	/**
	 * la longueur de corne de la gazelle
	 */
	private double hornLenght;
	
	/**
	 * le constructeur
	 * @param name le nom de la Gazelle
	 * @param age son âge 
	 * @param weight son poids
	 * @param hornLenght la longueur de sa corne
	 */
	public Gazelle(String name, int age, double weight, double hornLenght) {
		super(name, age, weight);
		this.setHornLenght(hornLenght);
	}

	/**
	 * @return the hornLenght
	 */
	public double getHornLenght() { return hornLenght; }

	/**
	 * @param hornLenght change la longueur de corne de la gazelle et la remplace avec celle passé en paramétre
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
	 * when the gazelle run she loses 0.07kg
	 */
	public void run() { this.losingWeight(0.07); }

	
	@Override
	public String toString() {
		return  super.toString() + " hornLenght= " + this.getHornLenght() ;
	}

}
