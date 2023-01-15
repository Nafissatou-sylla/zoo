package org.formation.sylla.modelisationdezoo.controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.formation.sylla.modelisationdezoo.model.technique.CageOccupyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagerTest {

	@Test
	void testGetInstance() {
		assertNotNull(Manager.getInstance());
		assertEquals(Manager.getInstance(), Manager.getInstance());
	}

	@Test
	void testGetEatToAnimal() throws CageOccupyException{	
		Manager.getInstance();
		Manager.getInstance().getEatToAnimal();	
		assertDoesNotThrow(()->{Manager.getInstance();});
	}

	@Test
	void testDisplayAnimals() {
		Manager.getInstance().displayAnimals();
	}

}
