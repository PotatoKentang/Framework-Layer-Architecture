import Factory.VehicleFactory;
import model.Car;
import model.Vehicle;

public class Main {

	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();
		//kalo aslabnya dia make new CarFactory, make vehiclefactory buat jdi abstractionnya buat setiap factory yg di bikin
		Vehicle car = vehicleFactory.makeCar("V8", "Blue", "Javascript");
		car.startEngine();
	}
}
