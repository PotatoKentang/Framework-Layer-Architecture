package Factory;

import model.Car;
import model.Vehicle;

public class VehicleFactory {
	public Vehicle makeCar(String engine, String color, String name)
	{
		return new Car(engine, color, name);
	}
}
