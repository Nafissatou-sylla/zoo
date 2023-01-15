package org.formation.modelisationdezoo.view;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.formation.sylla.modelisationdezoo.controleur.Manager;
import org.formation.sylla.modelisationdezoo.model.Animal;
import org.formation.sylla.modelisationdezoo.model.Cage;
import org.formation.sylla.modelisationdezoo.model.Lion;
import org.formation.sylla.modelisationdezoo.model.Visitor;
import org.formation.sylla.modelisationdezoo.view.Zoo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZooTest {
	Zoo zoo;
	ArrayList<Visitor> visitors;
	
	
	@BeforeEach
	void initZoo() {
		zoo = new Zoo();
		visitors = new ArrayList<>(10);
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
	
	@Test
	void testGiveEat() {
		zoo.giveEat();
	}
	
	@Test
	void testDisplay() {
		zoo.display();
	}
}
	
