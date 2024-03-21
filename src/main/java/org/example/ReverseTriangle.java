package org.example;

import java.util.Scanner;

public class ReverseTriangle {
    public void draw() {
        Scanner scan = new Scanner(System.in);

        int num;
        boolean running = true;



        while(running) {
            System.out.println("Geben Sie eine Zahl zwischen 3 und 6 ein:");

            num = scan.nextInt();

            if ((num >= 3) && (num <= 6)) {
                for (int i = 1; i <= num; i++) {
                    System.out.println("*".repeat(Math.max(0, num - i + 1)));
                }
                System.out.println("und fertig!");
                running = false;
            } else {
                System.err.println("Achtung, ungültige Eingabe!");
            }
        }

        scan.close();
    }
}
