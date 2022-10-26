package org.formation.sylla.modelisationdezoo.model;

import static org.junit.jupiter.api.Assertions.*;

import org.formation.sylla.modelisationdezoo.model.Monkey;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonkeyTest{
	Monkey monkey;
	double initWeight;
	
	@BeforeEach
	void initMonkey() {
		monkey = new Monkey("Singe", 1, 7.0);
		 initWeight = monkey.getWeight();
	}
	
	@Test
	void testGetName() {
		assertEquals(monkey.getName(), "Singe");
	}
	
	@Test
	void testSetName() {
		String name = "Le singe";
		monkey.setName(name);
		String value = monkey.getName();
		assertEquals(name, value);
	}
	
	@Test
	void testGetAge() { assertEquals(monkey.getAge(), 1);}
	
	@Test
	void testSetAge() {
		int age = 5;
		monkey.setAge(age);
		int value = monkey.getAge();
		assertEquals(age, value);
	}
	
	@Test
	void testGetWeight() { assertEquals(monkey.getWeight(), 7);}
	
	@Test
	void testSetWeight() {
		int weight = 15;
		monkey.setAge(weight);
		int value = monkey.getAge();
		assertEquals(weight, value);
	}

	@Test
	void testEat() {
		monkey.eat();
		double newWeight = monkey.getWeight();
		assertEquals(newWeight,initWeight + 0.35);
	}
	

	@Test
	void testSleep() {
		monkey.sleep();
		double newWeight = monkey.getWeight();
		assertEquals(newWeight, initWeight - 0.12);
	}
	

	@Test
	void testJump() {
		monkey.jump();
		double newWeight = monkey.getWeight();
		assertEquals(newWeight, initWeight - 0.07);
	}
	
	@Test
	void testCry() {
		String cry = monkey.cry();
		assertEquals(cry, "Babouiner");
		
	}
	
}

