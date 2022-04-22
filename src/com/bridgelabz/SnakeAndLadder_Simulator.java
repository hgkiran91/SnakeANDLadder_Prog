package com.bridgelabz;

import java.util.Random;

public class SnakeAndLadder_Simulator {

    public static final int NO_PLAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;

    public static int getDieRoll() {
        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        System.out.println("Rolled Dice Number: " + roll);
        return roll;
    }

    public static int diceRollOption() {
        Random random = new Random();
        int optionCheck = random.nextInt(3) + 1;
        System.out.println("Checking for option: " + optionCheck);
        return optionCheck;
    }

    public static void main(String[] args) {
        int position = 0;
        System.out.println("Initial Position: " + position);

        int diceRoll = getDieRoll();
        int option = diceRollOption();

        switch (option) {
            case NO_PLAY:
                break;
            case LADDER:
                if (diceRoll > 0) {
                    position = diceRoll + option;
                }
                break;
            case SNAKE:
                if (diceRoll >= 0) {
                    position -= diceRoll;
                }
        }
        System.out.println("Current position:" + position);
    }
}
