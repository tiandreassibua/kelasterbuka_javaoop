package com.tutorial;

public class Player {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int level;
    private int totalDamage;
    private boolean isAlive;

    // ini adalah object member
    private Armor armor;
    private Weapon weapon;

    public Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.maxHealth() - this.totalDamage;
    }

    public void display() {
        System.out.println();
        System.out.println("Player\t: " + this.name);
        System.out.println("Level\t: " + this.level);
        System.out.println("Health\t: " + this.getHealth() + "/" + this.maxHealth());
        System.out.println("Attack\t: " + this.getAttackPower());
        System.out.println("Alive\t: " + this.isAlive);
    }

    public void attack(Player opponent) {
        // hitung damage
        int damage = this.getAttackPower();
        
        // print event
        System.out.println("\n" + this.name + " menyerang " + opponent.getName() + " menggunakan " + this.weapon.getWeaponName() + " dengan " + damage + " damage");

        // menyerang si opponent
        opponent.defence(damage);
        this.levelUp();

        if(opponent.getHealth() <= 0) {
            System.out.println("\n" + opponent.getName() + " mati, dibunuh " + this.getName());
        }
    }

    public void defence(int damage) {
        // menerima damage
        int defencePower = this.armor.getDefencePower();
        int deltaDamage;

        System.out.println(this.name + " defence power = " + defencePower);
        if (damage > defencePower) {
            deltaDamage = damage - defencePower;
        } else {
            deltaDamage = 0;
        }

        System.out.println("menerima damage = " + deltaDamage);

        // menambah total damage
        this.totalDamage += deltaDamage;

        // cek isAlive
        if (this.getHealth() <= 0) {
            this.isAlive = false;
            this.totalDamage = this.maxHealth();
        }

        this.display();
    }

    private int getAttackPower() {
        return this.baseAttack + this.level * this.incrementAttack + this.weapon.getAttack();
    }

    private void levelUp() {
        this.level++;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int maxHealth() {
        return this.baseHealth + this.level * this.incrementHealth + this.armor.getAddHealth();
    }

    public boolean getIsAlive() {
        return this.isAlive;
    }
}
