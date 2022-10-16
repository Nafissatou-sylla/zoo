package org.formation.sylla.modelisationdezoo;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.formation.sylla.modelisationdezoo.manager.Animal;
import org.formation.sylla.modelisationdezoo.manager.Cage;
import org.formation.sylla.modelisationdezoo.manager.Lion;
import org.formation.sylla.modelisationdezoo.manager.Visitor;
import org.formation.sylla.modelisationdezoo.manager.Zoo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZooTest {
	Zoo zoo;
	ArrayList<Cage> cages;
	ArrayList<Visitor> visitors;
	
	
	@BeforeEach
	void initZoo() {
		zoo = new Zoo();
		cages = new ArrayList<>();
		visitors = new ArrayList<>();
	}
	
	@Test
	void testGetCage() { assertEquals( zoo.getCages(), cages); }
	
	@Test
	void testSetCage() {
		ArrayList<Cage> listCages = new ArrayList<>();
		zoo.setCages(listCages);
		ArrayList<Cage> value = zoo.getCages();
		assertEquals(listCages, value);
	}
	
	@Test
	void testGetEatToAnimal() {
		for(int i=0; i<cages.size(); i++) {
		zoo.getCages().get(i).getAnimal().eat();
		}
	}
	
	
	@Test
	void testAVisitor() {
		zoo.aVisitor(visitors);
	}
	
	@Test
	void testTakeOutAVisitor() {
		ArrayList<Visitor> visitorList = new ArrayList<>();
		visitors.add(new Visitor(25));
		visitors.add(new Visitor(29));
		zoo.takeOutAVisitor(visitorList);
		assertEquals(null, visitorList);
	}
}
	
