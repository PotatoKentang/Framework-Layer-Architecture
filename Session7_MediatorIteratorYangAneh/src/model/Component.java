package model;

public abstract class Component {
	String value;
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void input();
	public abstract void send();
}
