package enums;

public class Main {
    public static void main(String[] args) {

        Difficulty gameDifficulty = Difficulty.MEDIUM;
        gameDifficulty = Difficulty.HARD;

        Tooltier tier = Tooltier.DIAMOND;
        System.out.println(tier.getAttackMultiplier());


    }
}
