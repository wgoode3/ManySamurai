package Humans;

public class Samurai extends Human {
	
	private static int count = 0;

	public Samurai(String name) {
		super(name, 200, 10, 10, 10);
		count++;
	}
	
	// that kills the other human, but reduces the Samurai's health by half
	public void deathBlow(Human target) {
		target.setHealth(0);
		this.setHealth(this.getHealth()/2);
		System.out.println(this.getName() + " uses deathblow!");
		System.out.println(target.getName() + " is defeated!");
		System.out.println(this.getName() + " has " + this.getHealth() + " hp remaining!");
	}
	
	public void meditate() {
		Integer newHealth = (int) (1.5 * this.getHealth());
		this.setHealth(newHealth);
		System.out.println(this.getName() + " uses meditate!");
		System.out.println(this.getName() + " has " + this.getHealth() + " hp remaining!");
	}
	
	public static void howMany() {
		System.out.println("There are " + count + " samurai!");
	}
	
}
