package model;

public class MeatLoverPizza extends Pizza{


	public MeatLoverPizza(String customerName) {
		super(customerName);
		// TODO Auto-generated constructor stub
	}
	@Override
	void createDough() {
		// TODO Auto-generated method stub
		System.out.println("dough with rats");
	}

	@Override
	void putToppings() {
		// TODO Auto-generated method stub
		System.out.println("Human meat as toppings");
	}

	@Override
	void cookDough() {
		// TODO Auto-generated method stub
		System.out.println("Cooking with the power of the sun");
	}

}
