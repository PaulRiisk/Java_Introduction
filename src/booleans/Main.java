package booleans;

public class Main {
    public static void main(String[] args) {

        boolean thisIsTrue = true;
        boolean thisIsFalse = false;

        System.out.println("Is this true? "+ thisIsTrue);
        System.out.println("Is this false? "+ thisIsFalse);

        // comparison operators
        // > >= == != < <=

        int yourScore = 98;

        boolean passedTest = yourScore >= 50; //this is true: 98 > 50
        System.out.println("You passed: " + passedTest + ", with " + yourScore + " points!");

        boolean hasPerfectScore = yourScore == 100;
        System.out.println("You have a perfect Score? " + hasPerfectScore);

        boolean failedTest = passedTest == false;
        failedTest = !passedTest;   //negating a variable with exclamation mark
        //true -> false
        //false -> true

    }
}
