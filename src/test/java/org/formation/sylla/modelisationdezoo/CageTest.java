package org.formation.sylla.modelisationdezoo;

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
		cage = new Cage(animal);
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
}
