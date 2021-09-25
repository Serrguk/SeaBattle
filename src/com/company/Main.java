package com.company;

import java.util.Scanner;

public class Main {
    public static String playerName1;
    static String playerName2;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter player's 1 name: ");
        playerName1 = scanner.nextLine();
        System.out.print("Enter player's 2 name: ");
        playerName2 = scanner.nextLine();

        Field.drawField(playerName1);

    }
}
