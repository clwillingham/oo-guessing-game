package org.computermentors.chris_willingham.guessing_game;

import java.util.Scanner;

public class Player {
    private Scanner scanner;
    private String name;

    public Player(String name, Scanner scanner){
        this.scanner = scanner;
        this.name = name;
    }

    public int getGuess(){
        System.out.print(name + " pick a number: ");
        return scanner.nextInt();
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
