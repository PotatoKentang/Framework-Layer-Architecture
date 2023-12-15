package Observer;

import java.util.ArrayList;

public class Publisher {
	ArrayList<Subscriber> subs = new ArrayList<>();
	public void add(Subscriber subsriber) {
		this.subs.add(subsriber);
	}
	
	
	public void publish(String name) {
		for (Subscriber subscriber : subs) {
			subscriber.notify(name);
		}
	}
}
