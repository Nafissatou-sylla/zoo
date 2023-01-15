package org.formation.sylla.modelisationdezoo.controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.formation.sylla.modelisationdezoo.model.Cage;
import org.formation.sylla.modelisationdezoo.model.Gazelle;
import org.formation.sylla.modelisationdezoo.model.Lion;
import org.formation.sylla.modelisationdezoo.model.Monkey;
import org.formation.sylla.modelisationdezoo.model.technique.CageOccupyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagerTest {
	Cage cages[];
	
	@BeforeEach
	void initManager() {
		cages = new Cage[3];
		
		try {
			cages[0] = new Cage();
			cages[0].enterAnAnimal(new Lion("Lion", 2, 41.9));
			cages[1] = new Cage();
			cages[1].enterAnAnimal(new Monkey("Singe", 1, 15.35));
			cages[2] = new Cage();
			cages[2].enterAnAnimal(new Gazelle("Gazelle", 1, 20.4, 3.0));
		} catch (CageOccupyException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	void testGetCage() { assertEquals( Manager.getInstance().getCages(), Manager.getInstance().getCages()); }
	
	@Test
	void testSetCage() {
		Cage listCages[] = new Cage[10];
		Manager.getInstance().setCages(listCages);
		Cage[] value = Manager.getInstance().getCages();
		assertEquals(listCages, value);
	}
	

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
