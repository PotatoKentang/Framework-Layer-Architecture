package model;

import java.util.Scanner;

import mediator.Mediator;

public class PasswordTextField extends Component{
	Mediator mediator;
	
	public PasswordTextField(Mediator mediator) {
		this.mediator = mediator;
		this.name="passwordInput";
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("Input password: ");
		Scanner scanner = new Scanner(System.in);
		this.value = scanner.nextLine();
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
	}

}
