package org.formation.sylla.modelisationdezoo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.formation.sylla.modelisationdezoo.model.Gazelle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GazelleTest {
	Gazelle gazelle;
	double initWeight;
	
	@BeforeEach
	void initGazelle() {
		gazelle = new Gazelle("Gazelle", 1, 6.5, 2.3);
		initWeight = gazelle.getWeight();
	}
	
	@Test
	void testGetName() {
		assertEquals(gazelle.getName(), "Gazelle");
	}
	
	@Test
	void testSetName() {
		String name = "Une Gazelle";
		gazelle.setName(name);
		String value = gazelle.getName();
		assertEquals(name, value);
	}
	
	@Test
	void testGetAge() { assertEquals(gazelle.getAge(), 1);}
	
	@Test
	void testSetAge() {
		int age = 5;
		gazelle.setAge(age);
		int value = gazelle.getAge();
		assertEquals(age, value);
	}
	
	@Test
	void testGetWeight() { assertEquals(gazelle.getWeight(), 6.5);}
	
	@Test
	void testSetWeight() {
		int weight = 15;
		gazelle.setAge(weight);
		int value = gazelle.getAge();
		assertEquals(weight, value);
	}
	
	
	@Test
	void testGetHornLenght() { assertEquals(gazelle.getHornLenght(), 2.3);}
	
	@Test
	void testSetHornLenght() {
		double hornLenght = 3.5;
		gazelle.setHornLenght(hornLenght);
		double value = gazelle.getHornLenght();
		assertEquals(hornLenght, value);
	}
	

	@Test
	void testEat() {
		gazelle.eat();
		double newWeight = gazelle.getWeight();
		assertEquals(newWeight,initWeight + 0.40);
	}
	

	@Test
	void testSleep() {
		gazelle.sleep();
		double newWeight = gazelle.getWeight();
		assertEquals(newWeight, initWeight - 0.1);
	}
	

	@Test
	void testJump() {
		gazelle.jump();
		double newWeight = gazelle.getWeight();
		assertEquals(newWeight, initWeight - 0.07);
	}
	
}

