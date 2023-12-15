package model;

public abstract class Vehicle {
	String engine,color,name;

	public Vehicle(String engine, String color, String name) {
		super();
		this.engine = engine;
		this.color = color;
		this.name = name;
	}
	
	public abstract void startEngine();
	
}
