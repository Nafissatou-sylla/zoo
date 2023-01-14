package org.formation.sylla.modelisationdezoo.model;

import static org.junit.jupiter.api.Assertions.*;
import org.formation.sylla.modelisationdezoo.model.technique.CageOccupyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CageTest {
	Cage cage;
	Animal animal; 
	
	@BeforeEach
	void initCage() {
		cage = new Cage();
		animal = null;
	}
	
	@Test
	void testGetAnimal() { assertEquals(cage.getAnimal(), null);}

	@Test
	void testSetAnimal() {
		Animal newAnimal = new Lion("", 1, 10.0);
		cage.setAnimal(newAnimal);
		Animal value = cage.getAnimal();
		assertEquals(value, newAnimal);
		
	}
	
	
	@Test
	void testEntryAnAnimal() throws CageOccupyException {
		Animal lion = new Lion("lion", 1, 15);	
		cage.enterAnAnimal(lion);
		
		assertThrows(CageOccupyException.class, ()->{cage.enterAnAnimal(lion);});
		// assertDoesNotThrow(()->{cage.enterAnAnimal(new Monkey("Singe", 2, 12));});
	}
	
	@Test
	void testTakeOutAnAnimal() {
		assertEquals(cage.takeOutAnAnimal(), null);
	}
	
	@Test
	void testIsEmpty() {
		assertTrue(cage.isEmpty());
	}
	
	@Test 
	void testGiveEat() {
		Lion lion = new Lion("lion", 2, 15);
		cage.setAnimal(lion);
		cage.giveEat();
	}
	
	@Test
	void testToString() {
		assertEquals(cage.toString(), "Cage de: " + cage.getAnimal());
	}
}
