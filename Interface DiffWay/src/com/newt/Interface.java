package com.newt;



public class Interface {
	

	
	public static void main(String[] args) {
	CulturalEvent ce = new CulturalEvent();
	ce.danceEvent((hours, chargeunit) -> hours * chargeunit);//ce.danceEvent(new Programmer());
	ce.danceEvent((hours, chargeunit) -> 2 *hours *chargeunit);//ce.danceEvent(new Manager());
	}
}

	interface Dancer { // Functional Interface
	int dance(int hours, int chargeunit);
	}

	class Programmer implements Dancer {
	@Override
	public int dance(int hours, int chargeunit) {
	return hours * chargeunit;
	}
	}

	class Manager implements Dancer {
	@Override
	public int dance(int hours, int chargeunit) {
	return 2*hours * chargeunit;
	}
	}

	class CulturalEvent {
	void danceEvent(Dancer d) {
	System.out.println("Charge for Dancer" + d.dance(3, 500));
	}
	}


