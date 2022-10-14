package org.formation.sylla.modelisationdezoo;

import static org.junit.jupiter.api.Assertions.*;

import org.formation.sylla.modelisationdezoo.manager.Lion;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LionTest extends AnimalTest{
	Lion lion;
	
	@BeforeEach
	void initialisingLion() {
		lion = new Lion("Le lion", 1, 10);
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

}
