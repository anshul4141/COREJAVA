package com.rays.oop;

public class TestAutomobile {

	public static void main(String[] args) {

		Automobile car = new Automobile();

		car.setColor("Red");
		car.setMake("Toyota");
		car.setSpeed(50);

		System.out.println("Car Make: " + car.getMake());
		System.out.println("Car Color: " + car.getColor());
		System.out.println("Number of Gears: " + Automobile.NO_OF_GEARS);

		car.accelerator();
		car.changeGear(3);
		car.accelerator();
		car.brake();
		System.out.println("Final Speed: " + car.getSpeed() + " km/h");

	}

}
