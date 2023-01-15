package org.formation.sylla.modelisationdezoo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {

	Animal animal;
	
	@BeforeEach
	void initialisingAnimal() {
		animal = new Lion("lion", 2, 20);
	}
	
	@Test
	void testGetName() {
		assertEquals(animal.getName(), "lion");
	}

	@Test
	void testSetName() {
		String name = "Le roi lion";
		animal.setName(name);
		assertEquals(animal.getName(), "Le roi lion");
	}

	@Test
	void testGetAge() {
		assertEquals(animal.getAge(), 2);
	}

	@Test
	void testSetAge() {
		int age = 3;
		animal.setAge(age);
		assertEquals(animal.getAge(), 3);
	}

	@Test
	void testGetWeight() {
		assertEquals(animal.getWeight(), 20);
	}

	@Test
	void testSetWeight() {
		double weight= 30;
		animal.setWeight(weight);
		assertEquals(weight, 30);
	}

	@Test
	void testGrow() {
		assertEquals(animal.getWeight(), 20);
		animal.grow(10);
		assertEquals(animal.getWeight(), 30);
	}

	@Test
	void testLosingWeight() {
		assertEquals(animal.getWeight(), 20);
		animal.losingWeight(5);
		assertEquals(animal.getWeight(), 15);
	}

	@Test
	void testToString() {
		assertEquals(animal.toString(), "name = lion, age= 2ans , weight= 20.0kg ");
	}
	

}
