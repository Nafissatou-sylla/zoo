package org.formation.sylla.modelisationdezoo.model.technique;

public class CageOccupyException extends Exception {

	public CageOccupyException() {
		this("Cage déja occupée");
	}

	public CageOccupyException(String message) {
		super(message);
	}

	

	

}
