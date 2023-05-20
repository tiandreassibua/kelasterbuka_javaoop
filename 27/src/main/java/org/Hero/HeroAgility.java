package org.Hero;

public class HeroAgility extends Hero {
    public HeroAgility(String name) {
        super(name);
    }

    @Override
    public void levelUp() {
        this.setLevel(1);
    }
}
