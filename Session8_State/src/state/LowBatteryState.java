package state;

import model.Phone;

public class LowBatteryState extends PhoneState{

	public LowBatteryState(Phone phone) {
		// TODO Auto-generated constructor stub
		super(phone);
	}

	@Override
	public void playingGame() {
		// TODO Auto-generated method stub
		System.out.println("still playing game...");
		System.out.println("Battery is low");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("turning off phone...");
		phone.setPhoneState(new TurnedOffState(phone));
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("message send...");
		System.out.println("Battery is low");
		
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("charging phone");
		System.out.println("phone is back online...");
		phone.setPhoneState(new NormalState(phone));
	}

}
