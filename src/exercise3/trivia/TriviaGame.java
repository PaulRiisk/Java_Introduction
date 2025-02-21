package exercise3.trivia;

import java.util.*;

public class TriviaGame {
    public List<Trivia> trivias;
    private Scanner scanner = new Scanner(System.in);
    private int score = 0;
    private int maxScore;

    public void startGame(){
        populateTriviaList();
        gameLoop();
    }

    public void gameLoop(){
        while (true) {

            for(Trivia trivia : trivias) {
                trivia.printQuestion();
                if(trivia.validateAnswer(getUserInput())) {
                    score++;
                }
                printScore();
            }

            if(shouldEndGame()) {
                break;
            }
        }
        printScore();
    }

    public boolean shouldEndGame() {
        askForAbort();
        resetScore();
        return endGame(getUserInput());
    }


    private String getUserInput() {
        return scanner.nextLine();
    }

    private boolean endGame(String input) {
        return !input.equalsIgnoreCase("y");
    }

    private void askForAbort() {
        System.out.println("Do you want to play again? (Y/N)");
    }

    private void printScore() {
        System.out.println("Your score is: " + score);
    }

    private void resetScore() {
        score = 0;
    }

    private void populateTriviaList() {
        trivias = new ArrayList<>();


        trivias.add(new Trivia("What is the name of the protagonist in the Halo series?", "MasterChief"));
        trivias.add(new Trivia("Which company developed the Dark Souls series?", "FromSoftware"));
        trivias.add(new Trivia("What is the name of the main villain in the Half-Life series?", "G-Man"));
        trivias.add(new Trivia("Which battle royale game features a shrinking storm?", "Fortnite"));

        trivias.add(new Trivia("How many Chaos Emeralds are in the Sonic the Hedgehog series?", "7"));
        trivias.add(new Trivia("In what year was the first PlayStation console released?", "1994"));
        trivias.add(new Trivia("How many inventory slots does Steve have in Minecraft?", "36"));
        trivias.add(new Trivia("How many different types of blocks are in the original version of Tetris?", "7"));

        maxScore = trivias.size();
        Collections.shuffle(trivias);
    }
}
