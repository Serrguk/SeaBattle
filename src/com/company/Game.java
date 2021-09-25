package com.company;

import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static int[][] fieldForPlayer1 = new int[10][10];
    static int[][] fieldForPlayer2 = new int[10][10];

    public void drawField(String name) {
        System.out.print("Enter player's 1 name: ");
        String playerName1 = scanner.nextLine();
        System.out.print("Enter player's 2 name: ");
        String playerName2 = scanner.nextLine();
        System.out.println();
        System.out.println(name + ", place your 4-deck ship on the battlefield: \n");
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - - - - - - - - - -");
        }
        System.out.print("\nEnter OX coordinate: ");
        int X = scanner.nextInt();
        System.out.print("Enter OY coordinate: ");
        int Y = scanner.nextInt();

        System.out.println("\nChoose direction: \n1 - Vertical\n2 - Horizontal");
        int direction = scanner.nextInt();

        for (int i = 0; i < fieldForPlayer1.length; i++) {
            for (int j = 0; j < fieldForPlayer1.length; j++) {
                if (name.equals(playerName1)) {

                }
            }
        }
    }
}
