package adapter;

import model.Archer;
import model.Enemy;
import model.MeleeHero;

//meleeHero gk boleh memiliki constructor karena nnti saat dependency injection 
//attribute constructor harus di oper juga 
public class ArcherToMeleeAdapter extends MeleeHero{
	Archer archer;
	
	public ArcherToMeleeAdapter(Archer archer) {
		this.archer = archer;
	}
	
	@Override
	public void attack(Enemy enemy) {
		// TODO Auto-generated method stub
		archer.shoot(enemy);
	}

	@Override
	public void moveForward() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveBackward() {
		// TODO Auto-generated method stub
		
	}
	
}
