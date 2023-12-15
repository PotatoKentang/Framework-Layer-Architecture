package model;

import state.NormalState;
import state.PhoneState;

public class Phone {
	PhoneState phoneState;
	public Phone() {
		phoneState = new NormalState(this);
		// TODO Auto-generated constructor stub
	}
	public PhoneState getPhoneState() {
		return phoneState;
	}
	public void setPhoneState(PhoneState phoneState) {
		this.phoneState = phoneState;
	}
	
	public void playGame() {
		phoneState.playingGame();
	}
	public void message() {
		phoneState.message();
	}
	public void turnedOff() {
		phoneState.turnOff();
	}
	public void charge() {
		phoneState.charge();
	}
	
}
