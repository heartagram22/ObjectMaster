package human;

public class Wizard extends Human {

    public Wizard() {
        this.health = 50;
        this.intelligence = 8;

    }

    public void heal(Human other) {
      other.health += this.intelligence;
        System.out.println("The other human by the wizard's intelligence is "+ other.health +".");
    }

    public void fireball(Human next) {
        next.health -= (this.intelligence*3);
        System.out.println("The human's health is " + next.health +".");
    }
}
