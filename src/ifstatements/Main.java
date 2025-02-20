package ifstatements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int exam1 = 31;
        int exam2 = 51;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Results for Exam 1: ");
        exam1 = scanner.nextInt();
        System.out.println("Results for Exam 2: ");
        exam2 = scanner.nextInt();

        if(exam1 >= 50) {
            System.out.println("You have passed exam 1!");
        } else {
            System.out.println("You have failed exam 1!");
        }

        if(exam2 >= 50) {
            System.out.println("You have passed exam 2!");
        } else if(exam2 < 0) {
            System.out.println("You did you have negative points?!");
        } else {
            System.out.println("You have failed exam 2!");
        }

        if(exam1 >= 50 && exam2 >= 50) {
            System.out.println("You passed all exams!");
        }


    }
}
