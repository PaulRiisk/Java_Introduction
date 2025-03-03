package enums;

public enum Tooltier {
    DIAMOND(10, 2),
    NETHERITE(100, 4);

    private final int attackMultiplier;
    private final int attackSpeed;

    // constructor
    Tooltier(int attackMultiplier, int attackSpeed) {
        this.attackMultiplier = attackMultiplier;
        this.attackSpeed = attackSpeed;
    }

    // getters
    public  int getAttackMultiplier() {
        return attackMultiplier;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

}
