package state;

import StatePattern.State;
import model.Phone;

public abstract class PhoneState{
	Phone phone;
	public PhoneState(Phone phone) {
		// TODO Auto-generated constructor stub
		this.phone = phone;
	}
	public abstract void playingGame();
	public abstract void turnOff();
	public abstract void message();
	public abstract void charge();
}
