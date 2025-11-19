package com.rays.oop.encapsulation;

public class Automobile {

	private String color;
	private int speed;
	private String make;
	public final static int NO_OF_GEARS = 6;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void brake() {

		if (speed == 0) {
			System.out.println("car already stoped");
		} else {
			speed = speed - 10;
		}

	}

	public void accelerator() {

		if (speed == 400 || speed > 400) {
			System.out.println("speed limit is high please applay brake");
		} else {
			speed = speed + 10;
		}

	}

	public void changeGear(int gear) {

		if (gear > NO_OF_GEARS) {
			System.out.println("invalid gear...");
		}

		if (gear == 1) {
			System.out.println("gear switched 1");
			speed = 20;
			System.out.println("current speed is: " + speed);
		}
		
		

	}

}
