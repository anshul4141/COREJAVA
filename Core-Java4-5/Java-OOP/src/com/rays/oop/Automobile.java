package com.rays.oop;

public class Automobile {

	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GEARS = 5;

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return this.make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accelerator() {
		speed = speed + 10;
		System.out.println("Accelerated. Current speed: " + this.speed + " km/h");
	}

	public void brake() {
		speed = speed - 10;
		if (speed < 0)
			speed = 0;
		System.out.println("Braked. Current speed: " + this.speed + " km/h");
	}

	public void changeGear(int gear) {
		if (gear > 0 && gear <= NO_OF_GEARS) {
			System.out.println("Gear changed to: " + gear);
		} else {
			System.out.println("Invalid gear. Please select gear between 1 and " + NO_OF_GEARS);
		}
	}
}