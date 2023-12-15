package builder;

import java.util.ArrayList;

import restaurant.Burger;

public class BurgerBuilder {
	String buns = "bred";
	String cheese="mozaerlla";
	ArrayList<String> toppings = new ArrayList<String>();
	boolean useMustard=false;
	boolean useKetchup=false;
	boolean isgluttenFree=true;
	public BurgerBuilder setBuns(String buns) {
		this.buns = buns;
		return this;
	}

	public BurgerBuilder setCheese(String cheese) {
		this.cheese = cheese;   		
		return this;                                                                              
	}

	public BurgerBuilder setToppings(ArrayList<String> toppings) {
		for (String topping : toppings) {
			this.toppings.add(topping);
		}
		return this;                                                                              
	}

	public BurgerBuilder setUseMustard(boolean useMustard) {
		this.useMustard = useMustard;
		return this;                                                                              
	}

	public BurgerBuilder setUseKetchup(boolean useKetchup) {
		this.useKetchup = useKetchup;
		return this;                                                                              
	}
	public BurgerBuilder setSingleToppings(String topping) {
		this.toppings.add(topping);
		return this;
	}
	
	public BurgerBuilder setIsgluttenFree(boolean isgluttenFree) {
		this.isgluttenFree = isgluttenFree;
		return this;                                                                              
	}
	public Burger makeBurger() {
		return new Burger(buns, cheese, toppings, useMustard, useKetchup, isgluttenFree);
	}
}
