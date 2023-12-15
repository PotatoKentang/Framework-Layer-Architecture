import model.MeatLoverPizza;
import model.MozzarellaPizza;
import model.Pizza;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Pizza pizza1= new MozzarellaPizza("Reynard");
		Pizza pizza2= new MeatLoverPizza("Jeff");
		pizza1.makePizza();
		pizza2.makePizza();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}	

}
