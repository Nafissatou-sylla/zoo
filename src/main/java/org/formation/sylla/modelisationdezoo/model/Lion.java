package org.formation.sylla.modelisationdezoo.model;

/**
 * classe Lion qui extends la classe Abstract Animal, et implements aussi l'interface mangeable
 */

public class Lion extends Animal implements Mangeable{
	
	/**
	 * le constructeur
	 * @param name le nom du lion
	 * @param age son âge
	 * @param weight son poids
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
	 * quand le lion cri, il rugit
	 * @return lion cry's type
	 */
	public String cry() { return "rugir" ; }

	
	/**
	 * when the lion eats the gazelle he grows
	 * @param gazelle the gazelle to eat
	 */
	@Override
	public double devour(Gazelle gazelle) {
		this.grow(gazelle.getWeight() / 3);
		return this.getWeight();
	}


	/**
	 * when the lion eats the visitor he grows
	 * @param visitor the visitor to eat
	 */
	@Override
	public double devour(Visitor visitor) {
		this.grow(visitor.getWeight() / 3);
		return this.getWeight();
	}

	
}
