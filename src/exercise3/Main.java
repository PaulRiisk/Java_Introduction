package exercise3;

import exercise3.bank.Bank;
import exercise3.bank.Person;
import exercise3.trivia.TriviaGame;

public class Main {
    public static void main(String[] args) {
        //Exercise 3

        /*
         * a) exercise3.trivia game with classes and objects:
         * modify exercise3.trivia game in a way to use classes as well
         * custom classes for question answer pairs, lists to save them
         *
         * b) bank management system
         * create a bank management system with following components;
         * person (saves first, middle and last name, age, and social security number)
         * bank (saves list of customers and their checking accounts, maximum overdraw amount)
         * checking account (should have current value, methods for taking and depositing money)
         * opening a checking account should only work via a bank and must require a certain amount of initial deposit
         *
         * Bonus: make banking system interactive
         *
         */

        Person nano = new Person("Nano", "Attack", 9);
        Person daniel = new Person("Daniel", "Smith", 29);
        Person marie = new Person("Marie", "Susan", 31);

        Bank pb = new Bank("PaulBank");

        pb.openBankAccount(nano, 200);  // not old enough
        pb.openBankAccount(marie, 2000);
        pb.openBankAccount(daniel, 10); // not enough

        System.out.println(pb.getAccountByPerson(marie).getBalance());
        pb.withdrawAmount(3000, marie); //cannot, is over the limit


        // uncomment to play the game
        // TriviaGame game = new TriviaGame();
        // game.startGame();



    }
}
