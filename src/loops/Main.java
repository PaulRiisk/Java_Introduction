package loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] questions = new String[3];
        questions[0] = "How many States does the USA habe?";
        questions[1] = "What is the capital of the United Kingdom?";
        questions[2] = "What is the chemical symbol for Iron?";

        String[] answers = new String[3];
        answers[0] = "50";
        answers[1] = "London";
        answers[2] = "Fe";

        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answers[i]);
        }

        // foreach loop
        for(String question : questions) {
            System.out.println(question);
        }

        Scanner scanner = new Scanner(System.in);

        // while loop AND endless loop!
        while (true) {
            System.out.println("Do you want to continue?");
            if(scanner.next().equalsIgnoreCase("yes")) {
                continue;
            } else {
                break;
            }
        }



    }
}

