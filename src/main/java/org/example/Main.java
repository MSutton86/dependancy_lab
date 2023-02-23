package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello doc!");

        //Weapon hammer = new Weapon( "Hammer", 50);
        Weapon club = new Weapon( "Club", 25);
        Robot robot_one = new Robot(club);
        System.out.println(robot_one.name);
        robot_one.Attack();
    }
}
