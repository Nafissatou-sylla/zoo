package org.formation.sylla.modelisationdezoo.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VisitorTest {
	Visitor visitor;
	
	@BeforeEach
	void initVisitor() {
		visitor = new Visitor(25);
	}
	
	@Test
	void testGetWeight() { assertEquals(visitor.getWeight(), 25);}
	
}
