package human;

public class Ninja extends Human {
    public Ninja() {
        this.stealth = 10;
    }

    public void steal(Human stealth) {
        stealth.health -= this.stealth;
        this.health += this.stealth;
        System.out.println("The health of Ninja is " + this.health +".");
    }

    public void runAway() {
        this.health -= 10;
        System.out.println("My health is " + this.health + ".");

    }
}
