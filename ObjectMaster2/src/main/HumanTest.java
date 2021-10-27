package main;

import human.Human;
import human.Ninja;
import human.Samurai;
import human.Wizard;

public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        human1.attack(human2);
        Wizard wizard = new Wizard();
        wizard.heal(human1);
        wizard.fireball(human1);
        Ninja ninja = new Ninja();
        ninja.steal(human1);
        Samurai samurai = new Samurai();
        samurai.deathBlow(human1);
        samurai.meditate();
        System.out.println(Samurai.howMany());


    }
}
