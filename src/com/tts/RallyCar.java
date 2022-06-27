package com.tts;

class RallyCar implements Vehicle {

	int speed, gear;

	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}

	@Override
	public void accelerate(int increment) {
		speed = speed + increment;
	}

	@Override
	public void brake(int decrement) {
		speed = speed - decrement;
	}

	public void displayStatus() {
		System.out.println("speed: " + speed + " gear: " + gear);
	}
}