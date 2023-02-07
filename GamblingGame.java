package com.Review;
import java.util.*;

public class GamblingGame {
    public static final int stack = 100;
    public static final int bet = 1;
    static int newStake ;

    // UC2 to check randomly if the Gambler wins or loose the bet
    public static void winLoose(int r, int bet){
        if (r==bet){
            System.out.println("Gambler Wins!");

        }
        else{
            System.out.println("Gambler Loose!");

        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the game");
        Random random = new Random();
        int r = random.nextInt(2);
        winLoose(r,bet);
    }
}
