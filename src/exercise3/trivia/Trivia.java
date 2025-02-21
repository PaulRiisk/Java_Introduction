package exercise3.trivia;

public class Trivia {
    public String question;
    public String answer;

    public Trivia(String question, String answer) {
        this.question = question;
        this.answer = answer;

    }

    // toLowerCase
    public boolean isCorrectAnswer(String input) {
        input = input.toLowerCase();

        return this.answer.toLowerCase().equals(input);
    }

    public void printQuestion(){
        System.out.println(question);
    }

    public void printAnswer(){
        System.out.println(answer);
    }

    public void printCorrect(){
        System.out.println("That was the correct Answer!");
    }

    public void printIncorrect(){
        System.out.println("That was the incorrect Answer!");
    }

    public void printCorrectAnswer(){
        System.out.println("The correct answer was: " + this.answer);
    }


    public boolean validateAnswer(String input) {
        boolean valid = isCorrectAnswer(input);

        if(valid){
            printCorrect();
        } else {
            printIncorrect();
            printCorrectAnswer();
        }
        return valid;
    }



}
