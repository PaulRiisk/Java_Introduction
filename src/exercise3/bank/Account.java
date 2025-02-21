package exercise3.bank;

public class Account {
    private int balance;
    private String accountID;
    private Person accountHolder;

    public Account(int balance, String accountID, Person accountHolder) {
        this.balance = balance;
        this.accountID = accountID;
        this.accountHolder = accountHolder;
    }

    protected void depositAmount(int amount) {
        balance += amount;
    }

    protected int withdrawAmount(int amount) {
        balance -= amount;
        return amount;
    }

    public int getBalance() {
        return  balance;
    }

    public boolean isAccountID(String id) {
        return this.accountID.equals(id);
    }

    public boolean isAccountHolder(Person person) {
        return accountHolder == person;
    }




}
