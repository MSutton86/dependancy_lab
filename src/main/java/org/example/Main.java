package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello doc!");

        Weapon hammer = new Hammer();

        Javelin javelin = new Javelin();

        Club club = new Club();

        Attacker robot_one = new Robot(hammer);

//        Robot robot_two = new Robot(javelin);
//
//        Robot robot_three = new Robot(club);

        robot_one.Attack();

        Attacker wolf_one = new Werewolf(name:"Oz", attackPower:35);

        wolf_one.Attack();

//        robot_two.Attack();
//
//        robot_three.Attack();
    }
}
