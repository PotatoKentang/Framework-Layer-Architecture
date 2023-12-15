package Observer;

import java.util.ArrayList;

public class Subscriber {
	String name;	
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	
	public void notify(String information) {
		System.out.println(this.name + " received : " + information);
	}

	
}
