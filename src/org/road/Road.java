package org.road;

import org.transport.Transport;

public class Road {
	public void roadBike() {
		System.out.println("Road bike: 10");
	}
	public void roadCycle() {
		System.out.println("Road cycle: 20");
	}
	public void roadBus() {
		System.out.println("Road bus: 20");
	}
	public static void main(String[]args) {
		Road road =new Road();
		road.roadBike();
		road.roadCycle();
		road.roadBus();
		
    }

}
