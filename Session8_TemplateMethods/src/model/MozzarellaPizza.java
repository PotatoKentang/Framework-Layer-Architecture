package model;

public class MozzarellaPizza extends Pizza {


	public MozzarellaPizza(String customerName) {
		super(customerName);
		// TODO Auto-generated constructor stub
	}

	@Override
	void createDough() {
		// TODO Auto-generated method stub
		System.out.println("Creating Dough");
	}

	@Override
	void putToppings() {
		// TODO Auto-generated method stub
		System.out.println("Adding cheese mozarella");
	}

	@Override
	void cookDough() {
		// TODO Auto-generated method stub
		System.out.println("cooking dough");
	}

}
