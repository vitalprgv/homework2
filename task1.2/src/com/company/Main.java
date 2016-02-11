package com.company;

public class Main {

    public static void main(String[] args) {
        Dog spot = new Dog ("spot ", " ruff!!");
        Dog scruffy = new Dog ("scruffy ", " wurf!!");
        String action = spot.getName() + " says " + spot.getSays();
        String action1 = scruffy.getName() + " says " + scruffy.getSays();
        System.out.println(action);
        System.out.println(action1);


    }
}
