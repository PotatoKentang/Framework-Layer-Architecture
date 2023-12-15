import Observer.Publisher;
import Observer.Subscriber;

public class Main {
	public Main() {
		//Publisher observable
		//Subscriber observer
		//another example
		//Channel is observable
		//User is observer
		Publisher publisher = new Publisher();
		publisher.add(new Subscriber("patrick"));
		publisher.add(new Subscriber("reynard"));
		publisher.add(new Subscriber("jeff"));
		publisher.add(new Subscriber("keven"));
		publisher.publish("ada video baru");
	}
	
	public static void main(String[] args) {
		new Main();
	}		

}
