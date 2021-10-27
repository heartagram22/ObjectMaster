package human;

public class Human {
    private int strength;
    private int stealth;
    private int intelligence;
    private int health;

    public Human(){
        this.health = 100;
        this.stealth = 3;
        this.strength = 3;
        this.intelligence =3;

    }
    public void attack(Human other) {
        other.health -= this.strength;
        System.out.println("The strength of Human is " + this.strength + " and when attach the other human, the health is " + other.health + "!");
    }
}
