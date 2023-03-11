package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	private void tranTransportForm() {
		System.out.println("Transportform: Road, Air, Water");
	}
	public static void main(String[]args) {
		Transport tr =new Transport();
		Road road =new Road();
		Air ai =new Air();
		Water w =new Water();
		tr.tranTransportForm();
		road.roadBike();
		road.roadCycle();
		road.roadBus();
		ai.airAeroplane();
		ai.airHelicopter();
		w.watBoat();
		w.watShip();

    }
}	
