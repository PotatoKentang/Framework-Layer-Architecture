package builder;

import restaurant.Burger;

public class Director {
	BurgerBuilder builder;
	
	
	//director nyuruh behavior builder namun tidak membalikan apa apa
	public Director(BurgerBuilder builder) {
		super();
		this.builder = builder;
	}
	
	public void makeBlackBurger() {
		builder
			.setBuns("Black Buns");

	}
	
	public void makeVegetarianPizza() {
		builder
			.setSingleToppings("lettuce");
	}
	
	
}
