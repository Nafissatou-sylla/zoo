package org.formation.sylla.modelisationdezoo.controler;

import java.util.ArrayList;

public class Zoo {
	private ArrayList<Cage> cages;
	private ArrayList<Animal> animals;
	private Visiteur visiteurs;
	
	public Zoo() {
		this.animals = new ArrayList<>();
		this.visiteurs = null;
		this.cages = new ArrayList<>();
		
	}

	/**
	 * @param cages
	 */
	public Zoo(ArrayList<Cage> cages) {
		this.setCages(cages);
	}

	/**
	 * @return the cages
	 */
	public ArrayList<Cage> getCages() {
		return cages;
	}

	/**
	 * @param cages the cages to set
	 */
	public void setCages(ArrayList<Cage> cages) {
		this.cages = cages;
	}
	
	public void displayAnimal(ArrayList<Cage> cages) {
		for(Cage cage: cages) {
			System.out.print(cage.getAnimal().getName() + 
					cage.getAnimal().getAge() + " ans " + 
					cage.getAnimal().getWeight() + "kg " );
			if(cage.getAnimal().getName() == "La Gazelle ") {System.out.print(cage.getAnimal().getHornLenght() + "cm");}
			System.out.println();
		}
	}
	
	public void getEatToAnimal() {
		Lion lion = new Lion("", 0, 0);
		Monkey monkey = new Monkey("", 0, 0);
		Gazelle gazelle = new Gazelle("", 0, 0, 2);
		
		lion.eat();
		monkey.eat();
		gazelle.eat();
		
		System.out.println("les animaux aprés avoir mangé" + "\n");
		System.out.println(lion.getName() + lion.getAge() + "ans" + lion.getWeight() + "kg");
		System.out.println(monkey.getName() + monkey.getAge() + "ans" + monkey.getWeight() + "kg");
		System.out.println(gazelle.getName() + gazelle.getAge() + "ans" + gazelle.getWeight() + "kg" + gazelle.getHornLenght()+ "cm");
	}
	
	
	
}
