package org.computermentors.chris_willingham.guessing_game;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        Player player = new Player(scanner.nextLine(), scanner);

        while(true){
            Game game = new Game(player);
            game.play();
        }
    }
}
