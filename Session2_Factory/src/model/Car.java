package model;

public class Car extends Vehicle {
	
	public Car(String engine, String color, String name) {
		super(engine, color, name);
	}

	@Override
	public void startEngine() {
		System.out.println("BROM BROM");
	}
}
