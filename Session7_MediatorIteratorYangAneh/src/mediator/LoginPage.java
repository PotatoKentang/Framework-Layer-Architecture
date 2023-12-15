package mediator;

import iterator.Iterator;
import model.Component;
import model.EmailTextField;
import model.PasswordTextField;

public class LoginPage extends Mediator{
	Iterator iterator;
	EmailTextField emailField;
	PasswordTextField passwordField;
//	SubmitButton submitButton;
	public void send(Component e) {
		//hmhm
		if(e.getName()=="emailInput") {
			emailField.input();
		}
		else if(e.getName()=="passwordInput") {
			passwordField.input();
		}
		else {
//			submitButton.input();
		}
	}
		
}
