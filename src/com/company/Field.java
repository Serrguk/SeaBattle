package com.company;

public class Field {
    public static void drawField(String name) {
        System.out.println();
        System.out.println(name + ", place your 4-deck ship on the battlefield: \n");
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - - - - - - - - - -");
        }
        System.out.print("\nEnter OX coordinate: ");
        int X = Main.scanner.nextInt();
        System.out.print("Enter OY coordinate: ");
        int Y = Main.scanner.nextInt();

        System.out.println("\nChoose direction: \n1 - Vertical\n2 - Horizontal");
        int dir = Main.scanner.nextInt();
    }
}
