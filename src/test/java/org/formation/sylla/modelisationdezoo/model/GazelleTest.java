package org.formation.sylla.modelisationdezoo.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GazelleTest extends AnimalTest{
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
		gazelle.setName("Une Gazelle");
		assertEquals(gazelle.getName(),"Une Gazelle");
	}
	
	@Test
	void testGetAge() { assertEquals(gazelle.getAge(), 1);}
	
	@Test
	void testSetAge() {
		gazelle.setAge(5);
		assertEquals(gazelle.getAge(), 5);
	}
	
	@Test
	void testGetWeight() { assertEquals(gazelle.getWeight(), 6.5);}
	
	@Test
	void testSetWeight() {
		gazelle.setWeight(15);
		assertEquals(gazelle.getWeight(), 15);
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
		gazelle.run();
		double newWeight = gazelle.getWeight();
		assertEquals(newWeight, initWeight - 0.07);
	}
	
	@Test
	void testToString() {
		assertEquals(gazelle.toString(), "name = Gazelle, age= 1ans , weight= 6.5kg " + " hornLenght= " + gazelle.getHornLenght() );
	}
}

