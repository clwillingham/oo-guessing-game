package org.computermentors.chris_willingham.guessing_game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static final int MAX_NUMBER = 10;

    private Scanner scanner = new Scanner(System.in);
    private final int number;
    private boolean isFinished = false;


    public Game(){
        Random generator = new Random();
        number = generator.nextInt(MAX_NUMBER);
    }

    public void play(){
        while (!isFinished){
            loop();
        }
    }

    public boolean loop(){
        System.out.print("Pick a number: ");
        int guess = scanner.nextInt();
        if(number > guess){
            System.out.println("Number is greater than guess");
        }else if(number < guess){
            System.out.println("Number is less than guess");
        }else{
            System.out.println("You Win!");
            //Game ends here
            isFinished = true;
        }
        return isFinished;
    }

    public boolean isFinished() {
        return isFinished;
    }
}
