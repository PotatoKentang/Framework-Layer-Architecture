package model;

public class Archer {
	int health;
	int damage;
	public int posX;	
	int max_range = 2;
	
	public Archer(int health, int damage) {
		super();
		this.health = health;
		this.damage = damage;
	}

	public void shoot(Enemy enemy) {
		if(this.posX-enemy.posX <= max_range)
			enemy.deductHealth();
	}

}
