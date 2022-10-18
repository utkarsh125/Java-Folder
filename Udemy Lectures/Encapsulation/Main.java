package com.Encapsulation;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Utkarsh";
//        player.health = 1000;
//        player.weapon = "P90";
//
//        int damage = 100;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health: "+player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Utkarsh",1200,"MorningStar");
        System.out.println("Initial health is "+ player.getHealth());
    }
}
