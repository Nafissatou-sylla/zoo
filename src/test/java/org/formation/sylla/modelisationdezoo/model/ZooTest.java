package org.formation.sylla.modelisationdezoo.model;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.formation.sylla.modelisationdezoo.model.Animal;
import org.formation.sylla.modelisationdezoo.model.Cage;
import org.formation.sylla.modelisationdezoo.model.Lion;
import org.formation.sylla.modelisationdezoo.model.Visitor;
import org.formation.sylla.modelisationdezoo.view.Zoo;
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
		visitors = new ArrayList<>(10);
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
	void testAddVisitor() {
		ArrayList<Visitor> visitorList = new ArrayList<>();
		Visitor visitor1= new Visitor(19);
		Visitor visitor2= new Visitor(24);
		Visitor visitor3= new Visitor(24);

		visitorList.add(visitor1);
		visitorList.add(visitor2);
		visitorList.add(visitor3);
		assertEquals(zoo.addVisitor(visitorList), visitorList);
	}
	
	
	@Test
	void testTakeOutAVisitor() {
		ArrayList<Visitor> visitorList = new ArrayList<>();
		Visitor visitor1= new Visitor(19);
		Visitor visitor2= new Visitor(24);
		Visitor visitor3= new Visitor(24);

		visitorList.add(visitor1);
		visitorList.add(visitor2);
		visitorList.add(visitor3);

		Visitor visitor = zoo.takeOutAVisitor(visitorList);
		int value = visitorList.size();
		
		assertEquals( visitor, visitor3 );
		assertEquals( value, 2 );
	} 
}
	
