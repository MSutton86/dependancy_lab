package org.example;

public class Werewolf implements Attacker{
    //Instance variables (HAS A)
    public String name;
    public int attackPower;

    //Constructor
    public Werewolf(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }
}
