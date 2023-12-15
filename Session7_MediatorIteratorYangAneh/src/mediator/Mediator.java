package mediator;

import java.util.ArrayList;

import model.Component;

public abstract class Mediator {
	ArrayList<Component> components = new ArrayList<>();
	public void add(Component e) {
		components.add(e);
	}
	public abstract void send(Component e);
}
