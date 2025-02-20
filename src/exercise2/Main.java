package exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercise 2

        /*
         * a) Re-create trivia Game from before 5 questions, 5 answers
         * arrays to save the question and answers
         * 2 methods to make the code more readable
         * hint:
         *      duplicate code can usually be made into methods
         *      endless while loop with if statements so user can play indefinitely
         */

        int points = 0;

        String[] questions = new String[5];
        questions[0] = "What is the name of the main protagonist in The Legend of Zelda series?";
        questions[1] = "Which company created Halo?";
        questions[2] = "How many slots are in a standard Minecraft hotbar?";
        questions[3] = "In Minecraft, what material is needed to craft a Nether portal?";
        questions[4] = "Which character is known for the phrase “Finish Him” in Mortal Kombat?";

        String[] answers = new String[5];
        answers[0] = "Link";
        answers[1] = "Bungie";
        answers[2] = "9";
        answers[3] = "Obsidian";
        answers[4] = "Scorpion";

        Scanner scanner = new Scanner(System.in);


        // While Loop to keep the Trivia Game running
        while (true) {

            answerTheQuestion(questions, answers, 0);

            System.out.println("\nDo you want to continue? y/n");
            if(scanner.next().equalsIgnoreCase("y")) {
                continue;
            } else {
                System.out.println("Thank you for playing!");
                break;
            }
        }
    }

    public static void answerTheQuestion(String[] questions, String[] answers, int points) {
        points = answerLoop(questions, answers, points);

        System.out.println("Your points are: " + points);
    }

    private static int answerLoop(String[] questions, String[] answers, int points) {
        for (int i = 0; i < questions.length; i++) {
            Scanner scanner = new Scanner(System.in);

            // ask the question
            System.out.println(questions[i]);

            // scan for answer
            String ans = scanner.next();

            if (ans.equals(answers[i])) {
                System.out.println("Thats correct +1 Point!\n");
                points++;
            } else {
                System.out.println("Thats not correct, the answer is: " + answers[i] + "\n");
            }
        }
        return points;
    }

}
