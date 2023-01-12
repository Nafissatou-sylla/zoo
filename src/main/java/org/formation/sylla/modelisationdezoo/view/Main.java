 package org.formation.sylla.modelisationdezoo.view;

public class Main {
	
	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.display();
		zoo.giveEat();
		System.out.println("aprés avoir manger: ");
		zoo.display();
		
	}
}
