package org.example;

import java.util.Scanner;

public class TryWithOutCatch {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = scanner.next();
            if(!name.equals("Naveen")) {
                System.exit(0);
            }
            throw new Exception("I am in exception");
        } catch (Exception e) {
            System.out.println("Catching" + e.getMessage());
        } finally {
            System.out.println("I am in finally block.");
        }


    }

}
