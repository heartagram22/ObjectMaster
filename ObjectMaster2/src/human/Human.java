package human;

public class Human {
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;

    public Human() {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public void attack(Human other) {
        other.health -= this.strength;
        System.out.println("The strength of Human is " + this.strength + " and when attach the other human, the health is " + other.health + "!");
    }
}
