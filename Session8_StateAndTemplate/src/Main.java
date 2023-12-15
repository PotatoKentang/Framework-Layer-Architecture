import model.Phone;

public class Main {

	public Main() {
		//cara lebih terorganisir dalam sebuah behavior
//		fitur":
//		main game
//		messaging
//		turn off
//		charge
//		conteks: hp main
//		konteks: state yang mempengaruhi behavior
//		normalState
//		lowBatteryState
//		turnedOffState
		//codingan ini gk jalan nnti belajar sendiri
		Phone phone = new Phone();
		phone.playGame();
		phone.playGame();
		phone.playGame();
		phone.charge();
		phone.turnedOff();
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
