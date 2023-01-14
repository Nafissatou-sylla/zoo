package org.formation.sylla.modelisationdezoo.model;

/**
 * class abstract Animal
 * @author SYLLA Nafissatou
 *
 */

public abstract class Animal {
	
	/**
	 * le nom de l'animal	
	 */
	private String name;
	
	
	/**
	 * l'age de l'animal	
	 */
	private int age;
	
	
	/**
	 * le poids de l'animal
	 */
	private double weight;
	
	
	/**
	 * le constructeur
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
	 * donne le nom de l'animal
	 * @return le nom
	 */
	public String getName() { return name; }
	
	
	/**
	 * change le nom de l'animal et le remplace avec le nom passé en paramètre
	 * @param name le nouveau nom de l'animal
	 */
	public void setName(String name) { this.name = name; }


	/**
	 * donne l'age de l'animal
	 * @return l'age
	 */
	public int getAge() { return age; }
	
	
	/**
	 * change l'age de l'animal avec l'age passé en paramétre
	 * @param age le nouveau age de l'animal
	 */
	public void setAge(int age) { this.age = age; }


	/**
	 * donne le poids de l'animal
	 * @return le poids
	 */
	public double getWeight() { return this.weight; }
	
	
	/**
	 * change le poids de l'animal et le remplace avec le poids passé en paramètre
	 * @param weight le nouveau poids de l'animal
	 */
	public void setWeight(double weight) { this.weight = weight; }


	/**
	 * la méthode pour faire grossir l'animal
	 * @param weight le nouveau poids à ajouter aux poids de l'animal
	 */
	protected void grow(double weight ) {  this.setWeight( this.getWeight() + weight );}

	/**
	 * la méthode pour faire perdre du poids à l'animal
	 * @param weight le poids à diminuer aux poids de l'animal
	 */
	protected void losingWeight(double weight) {  this.setWeight(this.getWeight() - weight);; }

	
	@Override
	public String toString() {
		return "name = " + this.getName() + ", age= " + this.getAge() + "ans , weight= " + this.getWeight() + "kg ";
	}


	/** 
	 * méthode dormir commun à tout les animaux
	 * abstract methods
	 */
	public abstract void eat();
	

	/** 
	 * méthode manger commun à tout les animaux
	 * abstract methods
	 */
	public abstract void sleep();

}
