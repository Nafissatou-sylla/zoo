package org.formation.sylla.modelisationdezoo.model;

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
	
	public Animal() {
		this("animal", 1, 12.5);
	}
	
	
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
	
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }


	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }


	public double getWeight() { return this.weight; }
	public void setWeight(double weight) { this.weight = weight; }
	
	
	public double getHornLenght() { return hornLenght; }
	public void setHornLenght(double hornLenght) { this.hornLenght = hornLenght;}


	/**
	 * 
	 * @param weight change the animal weight in this weight + @param weight
	 */
	protected void grow(double weight ) {  this.setWeight( this.getWeight() + weight );}

	/**
	 * @param weight change the animal weight in this weight - @param weight
	 */
	protected void losingWeight(double weight) {  this.setWeight(this.getWeight() - weight);; }

	
	
	@Override
	public String toString() {
		return "name = " + this.getName() + ", age= " + this.getAge() + "ans , weight= " + this.getWeight() + "kg ";
	}


	/** 
	 * 
	 * abstract methods
	 */
	public abstract void eat();
	public abstract void sleep();
}
