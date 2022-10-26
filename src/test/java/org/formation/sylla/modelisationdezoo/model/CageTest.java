package org.formation.sylla.modelisationdezoo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.formation.sylla.modelisationdezoo.model.Animal;
import org.formation.sylla.modelisationdezoo.model.Cage;
import org.formation.sylla.modelisationdezoo.model.Lion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CageTest {
	Cage cage;
	Animal animal; 
	
	@BeforeEach
	void initCage() {
		cage = new Cage();
	}
	
	@Test
	void testGetAnimal() { assertEquals(cage.getAnimal(), animal);}

	@Test
	void testSetAnimal() {
		Animal newAnimal = new Lion("", 1, 10.0);
		cage.setAnimal(newAnimal);
		Animal value = cage.getAnimal();
		assertEquals(value, newAnimal);
		
	}
	
	@Test
	void testTakeOutAnAnimal() {
		assertEquals(cage.takeOutAnAnimal(), null);
	}
	
	@Test
	void testEntryAnAnimal() {
	
	}
	
	@Test
	void testIsEmpty() {
		assertEquals(cage.isEmpty(), true);
	}
}
