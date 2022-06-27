package com.tts;

class Motorcycle implements Vehicle {

	int speed, gear;

	public void changeGear(int newGear) {
		gear = newGear;
	}

	
	public void accelerate(int increment) {
		speed = speed + increment;
	}

	
	public void brake(int decrement) {
		speed = speed - decrement;
	}

	public void displayStatus() {
		System.out.println("speed: " + speed + " gear: " + gear);
	}
}

//class Motorcycle implements Vehicle{
//		
//}