import Humans.Human;
import Humans.Samurai;


public class Main {
	public static void main(String[] args) {
		Human h1 = new Human("Benny");
		Samurai.howMany();
		Samurai s1 = new Samurai("Jack");
		h1.attack(s1);
		// s1.attack(h1);
		s1.deathBlow(h1);
		System.out.println(h1.getHealth());
		s1.meditate();
		s1.meditate();
		Samurai.howMany();
		Samurai s2 = new Samurai("Oda Nobunaga");
		Samurai.howMany();
	}
}
