package org.air;

import org.road.Road;

public class Air {
	public void airAeroplane() {
		System.out.println("Air aeroplane : 1");
	}
	public void airHelicopter() {
		System.out.println("Air helicopter: 2");
	}
	public static void main(String[]args) {
		Air ai =new Air();
		ai.airAeroplane();
		ai.airHelicopter();
    }

}
