package model;

public abstract class Pizza {
	String customerName;
	public Pizza(String customerName) {
		// TODO Auto-generated constructor stub
		this.customerName=customerName;
	}
	
	public void makePizza() {
		//ini template yg dimaksud
		createDough();
		putToppings();
		cookDough();
		servePizza();
	}
	void servePizza() {
		System.out.println("Serving Pizza to: "+ this.customerName);
	}	
	abstract void createDough();
	abstract void putToppings();
	abstract void cookDough();

}
