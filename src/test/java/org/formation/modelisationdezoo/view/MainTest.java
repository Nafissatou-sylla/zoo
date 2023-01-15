package org.formation.modelisationdezoo.view;

import static org.junit.jupiter.api.Assertions.*;

import org.formation.sylla.modelisationdezoo.view.Zoo;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testMain() {
		Zoo zoo = new Zoo();
		zoo.display();
		zoo.giveEat();
		System.out.println("aprés avoir manger: ");
		zoo.display();
	}

}
