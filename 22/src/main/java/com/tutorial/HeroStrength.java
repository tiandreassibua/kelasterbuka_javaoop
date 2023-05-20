package com.tutorial;

public class HeroStrength extends Hero {
    private String type = "Strngth";
    
    public HeroStrength(String nameInput, double attackInput, double healthInput) {
        super(nameInput, attackInput, healthInput);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Type\t: " + this.type);
    }

	@Override
	public void takeDamage(double damage) {
		System.out.println(super.getName() + " receive half damage " + damage + " -> " + 0.5 * damage);
        super.setHealth(0.5 * damage);
	}
}
