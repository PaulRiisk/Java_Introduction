package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws TestException{

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        checkForZero(i);

        // IN GENERAL:
        // YOU WANT TO FAIL CODE IN LOUD!

        int z = sc.nextInt();
        try {
            checkForZero(z);
        } catch (TestException e) {
            // Do something about it
            System.out.println("Caught Exception" + e.getMessage());
        } finally {
            // Doing something regardless of caught or not
            System.out.println("Finally");
        }
        System.out.println("This happens always!");


    }

    private static void checkForZero(int number) throws TestException{
        if(number == 0) {
            throw new TestException("NUMBER IS ZERO!");
        }
    }

}
