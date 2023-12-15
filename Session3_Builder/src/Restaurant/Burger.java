package restaurant;

import java.util.ArrayList;

public class Burger {
	String buns;
	String cheese;
	ArrayList<String> toppings;
	boolean useMustard;
	boolean useKetchup;
	boolean isgluttenFree;
	public Burger(String buns, String cheese, ArrayList<String> toppings, boolean useMustard, boolean useKetchup,
			boolean isgluttenFree) {
		super();
		this.buns = buns;
		this.cheese = cheese;
		this.toppings = toppings;
		this.useMustard = useMustard;
		this.useKetchup = useKetchup;
		this.isgluttenFree = isgluttenFree;
	}
	public String getBuns() {
		return buns;
	}
	public void setBuns(String buns) {
		this.buns = buns;
	}
	public String getCheese() {
		return cheese;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public ArrayList<String> getToppings() {
		return toppings;
	}
	public void setToppings(ArrayList<String> toppings) {
		this.toppings = toppings;
	}
	public boolean isUseMustard() {
		return useMustard;
	}
	public void setUseMustard(boolean useMustard) {
		this.useMustard = useMustard;
	}
	public boolean isUseKetchup() {
		return useKetchup;
	}
	public void setUseKetchup(boolean useKetchup) {
		this.useKetchup = useKetchup;
	}
	public boolean isIsgluttenFree() {
		return isgluttenFree;
	}
	public void setIsgluttenFree(boolean isgluttenFree) {
		this.isgluttenFree = isgluttenFree;
	}
	
	public void printBurgerDetails()
	{
		System.out.println("buns:"+buns);
		System.out.println("cheese:"+cheese);
		System.out.println(toppings);
		System.out.println("isgluttenFree: "+isgluttenFree);
		System.out.println("useMustard: "+useKetchup);
		System.out.println("useMustard:"+useMustard);
	}
	
}
