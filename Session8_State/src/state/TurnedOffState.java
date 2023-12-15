package state;

import model.Phone;

public class TurnedOffState extends PhoneState{

	public TurnedOffState(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playingGame() {
		// TODO Auto-generated method stub
		System.out.println("Phone is already turned off..");
		phone.setPhoneState(new TurnedOffState(phone));
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Phone is already turned off..");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("Phone is already turned off..");
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("charging phone");
		System.out.println("phone is back online...");
		phone.setPhoneState(new NormalState(phone));

	}

}
