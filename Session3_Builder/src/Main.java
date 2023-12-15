import java.util.ArrayList;
import java.util.Arrays;

import builder.BurgerBuilder;
import builder.Director;
import restaurant.Burger;

public class Main {

	public static void main(String[] args) {
		BurgerBuilder builder = new BurgerBuilder();
		Burger b = builder
				.setBuns("bread")
				.setCheese("mozarella")
				.setIsgluttenFree(true)
				.setUseKetchup(true)
				.setUseMustard(true)
				.setToppings(
						new ArrayList<String>(
								Arrays.asList("lettuce","pickle")
								)
						)
				.setSingleToppings("human meat")
				.makeBurger();
		b.printBurgerDetails();
		
		
		//diretor gunanya mengset data saja melalui reference
		//dari builder
		Director director = new Director(builder);
		director.makeBlackBurger();
		Burger blackBurger = builder.makeBurger();
		blackBurger.printBurgerDetails();
		
		
	}

}
