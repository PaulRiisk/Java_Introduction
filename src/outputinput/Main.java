package outputinput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // output with println

        System.out.println("Hello World!");

        int x = 10;
        System.out.println(x);

        System.out.println("Es geht um " + x + " Euro!");

        //scanner to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your Username: ");
        String input = scanner.nextLine();

        System.out.println("Your Username is: " + input);

    }
}
