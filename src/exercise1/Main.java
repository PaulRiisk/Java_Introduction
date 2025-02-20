package exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercise 1 - Small Trivia Game

        /*
        * Define (at least) three questions with 3 answers!
        * user input with scanner
        * if/else to check for correct answer
        * if wrong, tell user and show correct answer
        *
        * BONUS: incremental point counter
        *
        * TIPS:
        * Strings = scanner.next()
        * userInput.equals(answer)
        */

        int points = 0;

        int q1 = 5;
        int q2 = 2;
        String q3 = ("minecraft");

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Fingers does a Hand have?");
        int a1 = scanner.nextInt();

        if (a1 == q1) {
            System.out.println("Thats correct +1 Point!");
            points++;
        } else {
            System.out.println("Thats not correct, the answer is: " + q1);
        }

        System.out.println("\nWhat is the best die hard movie?");
        int a2 = scanner.nextInt();

        if (a2 == q2) {
            System.out.println("Thats correct +1 Point!");
            points++;
        } else {
            System.out.println("Thats not correct, the answer is: Die Hard " + q2);
        }

        System.out.println("\nWhats the name of the top selling block game?");
        String a3 = scanner.next();
        a3 = a3.toLowerCase();

        if (a3.equals(q3)) {
            System.out.println("Thats correct +1 Point!");
            points++;
        } else {
            System.out.println("Thats not correct, the answer is: " + q3);
        }

        System.out.println("Done! You have made it. You earned " + points + " Points!");
    }
}
