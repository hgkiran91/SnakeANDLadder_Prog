package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder_Simulator {

    public static void getDieRoll() {
        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        System.out.println("Rolled Dice Number: " + roll);
    }

    public static void main(String[] args) {
        int position = 0;
        System.out.println("Initial Position: " + position);

        getDieRoll();
    }
}
