package state;

import model.Phone;

public class NormalState extends PhoneState{

	public NormalState(Phone phone) {
		super(phone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void playingGame() {
		// TODO Auto-generated method stub
		System.out.println("Playing Game");
		phone.setPhoneState(new LowBatteryState(phone));
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("turning off");
		phone.setPhoneState(new TurnedOffState(phone));
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("Messaging");
		phone.setPhoneState(new LowBatteryState(phone));
	}

	@Override
	public void charge() {
		// TODO Auto-generated method stub
		System.out.println("charging");
		phone.setPhoneState(new NormalState(phone));
	}
}
