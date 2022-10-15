package org.formation.sylla.modelisationdezoo;

import static org.junit.jupiter.api.Assertions.*;

import org.formation.sylla.modelisationdezoo.manager.Gazelle;
import org.formation.sylla.modelisationdezoo.manager.Lion;
import org.formation.sylla.modelisationdezoo.manager.Visitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LionTest extends AnimalTest{
	Lion lion;
	double initWeight;
	
	@BeforeEach
	void initialisingLion() {
		lion = new Lion("Le lion", 1, 10);
		 initWeight = lion.getWeight();
	}
	
	@Test
	void testGetName() {
		assertEquals(lion.getName(), "Le lion");
	}
	
	@Test
	void testSetName() {
		String name = "Le roi";
		lion.setName(name);
		String value = lion.getName();
		assertEquals(name, value);
	}
	
	@Test
	void testGetAge() { assertEquals(lion.getAge(), 1);}
	
	@Test
	void testSetAge() {
		int age = 5;
		lion.setAge(age);
		int value = lion.getAge();
		assertEquals(age, value);
	}
	
	@Test
	void testGetWeight() { assertEquals(lion.getWeight(), 10);}
	
	@Test
	void testSetWeight() {
		int weight = 15;
		lion.setAge(weight);
		int value = lion.getAge();
		assertEquals(weight, value);
	}

	@Test
	void testEat() {
		lion.eat();
		double newWeight = lion.getWeight();
		assertEquals(newWeight,initWeight + 1.9);
	}
	

	@Test
	void testSleep() {
		lion.sleep();
		double newWeight = lion.getWeight();
		assertEquals(newWeight, initWeight - 0.3);
	}
	

	@Test
	void testJump() {
		lion.jump();
		double newWeight = lion.getWeight();
		assertEquals(newWeight, initWeight - 0.5);
	}
	

	@Test
	void testRun() {
		lion.run();
		double newWeight = lion.getWeight();
		assertEquals(newWeight, initWeight - 0.35);
	}
	
	@Test
	void testCry() {
		String cry = lion.cry();
		assertEquals(cry, "rugir");
		
	}
	
	@Test
	void testDevourGazelle() {
		Gazelle gazelle = new Gazelle("", 1, 9.0, 2.7);
		lion.devour(gazelle );
		double newWeight = lion.getWeight();
		assertEquals(newWeight, initWeight + (gazelle.getWeight() / 3) );
	}
	
	@Test
	void testDevourVisitor() {
		Visitor visitor = new Visitor(6) ;
		lion.devour(visitor );
		double newWeight = lion.getWeight();
		assertEquals(newWeight, initWeight + (visitor.getWeight() / 3) );
	}
	
}
