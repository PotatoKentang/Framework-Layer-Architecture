import java.util.Scanner;

import adapter.ArcherToMeleeAdapter;
import main.Game;
import model.Archer;
import model.Enemy;
import model.Warrior;

public class Main {
	Scanner scanner = new Scanner(System.in);
	public Main() {
		Enemy enemy = new Enemy();
		String role;
		
		do {
			System.out.println("Pilih role Warrior | Archer");
			role = scanner.nextLine();
		} while(!role.equals("Warrior") && !role.equals("Archer"));
		
		switch(role) {
		case "Warrior":
			System.out.println("Warrior Choosen");
			Warrior warrior = new Warrior(1,2);
			Game game = new Game(warrior, enemy);
		case "Archer":
			System.out.println("Archer Choosen");
			Archer archer = new Archer(1,2);
			Game game1 = new Game(new ArcherToMeleeAdapter(archer), enemy);
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
