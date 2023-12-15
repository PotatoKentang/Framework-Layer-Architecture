package model;

import java.util.Scanner;

import mediator.Mediator;

public class EmailTextField extends Component {
	Mediator mediator;
	
	public EmailTextField(Mediator mediator) {
		this.mediator = mediator;
		this.name="emailInput";
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("Input email: ");
		Scanner scanner = new Scanner(System.in);
		this.value = scanner.nextLine();
		send();
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		mediator.send(this);
	}

}
