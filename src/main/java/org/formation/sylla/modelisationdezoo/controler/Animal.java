package org.formation.sylla.modelisationdezoo.controler;

/**
 * class abstract Animal
 * @author finas
 *
 */

public abstract class Animal {
	private String name;
	private int age;
	private double weight;
	private double hornLenght;
	
	/**
	 * 
	 * @param name animal's name
	 * @param age animal's age
	 * @param weight animal's weight
	 */
	public Animal(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.setHornLenght(0.0);
	}
	
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }


	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }


	public double getWeight() { return weight; }
	public void setWeight(double weight) { this.weight = weight; }
	
	
	public double getHornLenght() { return hornLenght; }
	public void setHornLenght(double hornLenght) { this.hornLenght = hornLenght;}


	/**
	 * return animal's weight + @param weight
	 */
	protected double grow(double weight) { return this.getWeight() + weight; }

	/**
	 * return animal's weight - @param weight
	 */
	protected double losingWeight(double weight) { return this.getWeight() - weight; }

	
	/** 
	 * 
	 * abstract methods
	 */
	public abstract void eat();
	public abstract void sleep();


	
	
}
