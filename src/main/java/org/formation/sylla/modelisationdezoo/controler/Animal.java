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
	}
	
	/**
	 * 
	 * abstract methods
	 */
	public abstract String eat();
	public abstract void sleep();
	public abstract void grow();
	public abstract void losingWeight();
	
}
