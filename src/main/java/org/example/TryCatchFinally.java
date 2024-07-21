package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic exception occurred.");
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }

}
