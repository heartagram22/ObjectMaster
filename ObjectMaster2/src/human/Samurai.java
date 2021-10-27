package human;

public class Samurai extends Human {
    public static int numSamurai = 0;
    public Samurai() {
        this.health = 100;
        numSamurai++;
    }

    public void deathBlow(Human death) {
        death.health = 0;
        this.health = (this.health/2);
        System.out.println("The Samurai health is " + this.health + ".");

    }

    public void meditate() {
      this.health += (this.health/2);
        System.out.println(this.health);
    }

    public static int howMany() {
        return numSamurai;


    }
}
