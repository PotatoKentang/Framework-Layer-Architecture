package model;


//constructor hanya di buat di children sehingga tidak terjadi bentrokan

public class Warrior extends MeleeHero {
	
	public void attack(Enemy enemy) {
		// Ensure that enemy is close enough
		if(enemy.posX - this.posX <= 1) {
			enemy.deductHealth();
		}
	}
	
	public void moveForward() {
		if(posX == 8) {
			return;
		}
		posX ++;
	}
	
	public Warrior(int damage,int health) {
		super();
		this.damage = damage;
		this.health = health;
	}

	public void moveBackward() {
		if(posX == 0) {
			return;
		}
		posX --;
	}
}
