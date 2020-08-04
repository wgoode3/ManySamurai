package Humans;


public class Human {
	private String name;
	private Integer health;
	private Integer strength;
	private Integer dexterity;
	private Integer intelligence;
	
	public Human(String name, Integer health, Integer strength, Integer dexterity, Integer intelligence) {
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
	}
	
	public Human(String name) {
		this.name = name;
		this.health = 100;
		this.strength = 3;
		this.dexterity = 3;
		this.intelligence = 3;
	}
	
	public Human() {
		this.name = "DEFAULT NAME";
		this.health = 100;
		this.strength = 3;
		this.dexterity = 3;
		this.intelligence = 3;
	}
	
	public void attack(Human target) {
		target.health -= this.strength;
		System.out.println(this.name + " attacks!");
		System.out.println(target.name + "'s health reduced to " + target.health);
	}
	
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHealth() {
		return health;
	}
	public void setHealth(Integer health) {
		this.health = health;
	}
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public Integer getDexterity() {
		return dexterity;
	}
	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
	}
	public Integer getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	

}

